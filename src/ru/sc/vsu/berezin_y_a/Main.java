package ru.sc.vsu.berezin_y_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        TestProgram testProgram = new TestProgram();

        if (!testProgram.test()) {
            System.out.println("Test error");
            return;
        } else {
            System.out.println("All tests completed");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameMain().setVisible(true);
            }
        });

    }

    private static int readCountArraysInArray() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the count of arrays in main array: ");
        return scn.nextInt();
    }

    private static void creatingArrays(int[][] arr, int countArraysInArray) {
        for (int i = 0; i < countArraysInArray; i++) {
            arr[i] = readArray();
        }
    }

    private static int[] readArray() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Creating the array");
        System.out.print("Enter the length of the array: ");
        int len = scn.nextInt();
        int[] arr = new int[len];
        System.out.println("Filling the array");
        for (int i = 0; i < len; i++) {
            System.out.printf("Enter the %d element of array: ", i);
            arr[i] = scn.nextInt();
        }
        return  arr;
    }

    private static void printArrayInConsole(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

}
