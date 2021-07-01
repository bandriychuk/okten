package task1;

import java.util.Objects;

public class Journal implements Printable{

    private String journalName;

    public Journal() {
    }

    public Journal(String journalName) {
        this.journalName = journalName;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Journal journal = (Journal) o;
        return Objects.equals(journalName, journal.journalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(journalName);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journalName='" + journalName + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Journal name is: " + getJournalName());
    }

    public static void printJournals(Printable[] p) {
//        for (int i = 0; i < p.length; i++) {
//            if (p[i] instanceof Journal) {
//                System.out.println("Method printJournals: ");
//                p[i].print();
//                break;
//            }
//        }

        for (Printable printable : p) {
            if (printable instanceof Journal) {
                System.out.println("Method printJournals: ");
                printable.print();
                break;
            }
        }
    }
}
