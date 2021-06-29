package task1;

public class Main {
    public static void main(String[] args) {

        Book b = new Book("someBook");
        Journal j = new Journal("journalName");
        Magazine m = new Magazine("magazineName");

        Printable[] p = {b, j, m};

        for (Printable ps : p) {
            ps.print();
        }

    }
}
