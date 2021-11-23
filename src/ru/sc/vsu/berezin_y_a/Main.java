package ru.sc.vsu.berezin_y_a;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameMain().setVisible(true);
            }
        });

        if (needCmd()) {
            runCmd();
        }

    }

    private static boolean needCmd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to use cmd? Enter true/false: ");
        return scanner.nextBoolean();
    }

    private static void runCmd() throws IOException {
        Logic logic = new Logic();
        CmdCommands cmdCommand = CmdCommands.STATIC;
        Scanner scanner = new Scanner(System.in);

        String command;
        String inputFile;
        String outputFile = "-";
        int[][] arr = new int[][] {
                {3, 4, 9},
                {2, 5, 8},
                {1, 6, 7},
        };

        System.out.println("Commands:");
        System.out.println("-run     - run program");
        System.out.println("-help    - show help page");
        System.out.println("-exit    - exit from program");
        System.out.println("-read    - read array from console");
        System.out.println("-input   - enter input file");
        System.out.println("-output  - enter output file");

        while (cmdCommand != CmdCommands.EXIT) {
            command = scanner.next();
            if (Objects.equals(command, "-run")) {
                cmdCommand = CmdCommands.RUN;
            } else if (Objects.equals(command, "-help")) {
                cmdCommand = CmdCommands.HELP;
            } else if (Objects.equals(command, "-exit")) {
                cmdCommand = CmdCommands.EXIT;
            } else if (Objects.equals(command, "-read")) {
                cmdCommand = CmdCommands.READ_FROM_CONSOLE;
            } else if (Objects.equals(command, "-input")) {
                cmdCommand = CmdCommands.ENTER_INPUT_FILE;
            } else if (Objects.equals(command, "-output")) {
                cmdCommand = CmdCommands.ENTER_OUTPUT_FILE;
            } else {
                System.out.println("Error, this command is not found. Try again: ");
            }

            switch (cmdCommand) {
                case EXIT -> System.exit(1);
                case RUN -> {
                    if (!Objects.equals(outputFile, "-")) {
                        PrintWriter writer = new PrintWriter(outputFile, StandardCharsets.UTF_8);
                        writer.println("Answer:" + logic.solution(arr));
                        writer.close();
                    }
                    System.out.println("Answer:" + logic.solution(arr));
                }
                case READ_FROM_CONSOLE -> {
                    arr = Util.readIntArray2FromConsole();
                    printArrayInConsole(arr);
                }
                case ENTER_INPUT_FILE -> {
                    System.out.print("Enter way to input file: ");
                    inputFile = scanner.next();
                    arr = Util.readIntArray2FromFile(inputFile);
                    printArrayInConsole(arr);
                }
                case ENTER_OUTPUT_FILE -> {
                    System.out.print("Enter way to output file: ");
                    outputFile = scanner.next();
                }
                case HELP -> {
                    System.out.println("Commands:");
                    System.out.println("-run     - run program");
                    System.out.println("-help    - show help page");
                    System.out.println("-exit    - exit from program");
                    System.out.println("-read    - read array from console");
                    System.out.println("-input   - enter input file");
                    System.out.println("-output  - enter output file");
                }
            }

        }
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
