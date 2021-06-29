package task2;

import task1.Printable;

public class Main {
    public static void main(String[] args) {
        Drum d20 = new Drum(20);
        Drum d10 = new Drum(10);

        Guitar g6 = new Guitar(6);
        Guitar g8 = new Guitar(8);

        Trumpet t10 = new Trumpet(10);
        Trumpet t23 = new Trumpet(23);

        Instruments[] instrument = {d20, d10, g6, g8, t10, t23};

        for (Instruments instruments : instrument) {
            instruments.play();
        }

    }
}
