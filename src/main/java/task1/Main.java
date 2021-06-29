package task1;

import static task1.Book.printBooks;
import static task1.Journal.printJournals;
import static task1.Magazine.printMagazines;

public class Main {
    public static void main(String[] args) {

        Book b = new Book("Vikings");
        Journal j = new Journal("TopRank");
        Magazine m = new Magazine("Adidas");

        Printable[] p = {b, j, m};

        for (Printable ps : p) {
            ps.print();
        }

        System.out.println("\n");
        printMagazines(p);

        System.out.println("\n");
        printBooks(p);

        System.out.println("\n");
        printJournals(p);

    }
}
