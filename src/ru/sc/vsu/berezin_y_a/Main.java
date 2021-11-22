package ru.sc.vsu.berezin_y_a;

import java.io.IOException;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameMain().setVisible(true);
            }
        });

    }

}
