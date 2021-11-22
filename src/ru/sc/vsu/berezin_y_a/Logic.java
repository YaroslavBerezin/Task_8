package ru.sc.vsu.berezin_y_a;

public class Logic {

    State state;

    public String solution(int[][] arr) {
        if (analyzeArray(arr)) {
            return "yes";
        } else {
            return "no";
        }
    }

    public boolean analyzeArray(int[][] arr) {
        int lustElement;
        if (arr.length > 1) {
            if (arr[arr.length - 1][0] >= arr[arr.length - 2][0]) {
                state = State.DECREASING;
                lustElement = 9999;
            } else {
                state = State.INCREASING;
                lustElement = -9999;
            }
        } else if (arr[0].length > 1) {
            if (arr[0][0] >= arr[0][1]) {
                state = State.DECREASING;
                lustElement = 9999;
            } else {
                state = State.INCREASING;
                lustElement = -9999;
            }
        } else {
            return true;
        }
        for (int i = 0; i < arr[arr.length - 1].length; i++) {
            if (i % 2 == 0) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    switch (state) {
                        case INCREASING -> {
                            if (lustElement >= arr[j][i]) {
                                return false;
                            }
                        }
                        case DECREASING -> {
                            if (lustElement <= arr[j][i]) {
                                return false;
                            }
                        }
                    }
                    lustElement = arr[j][i];
                }
            } else {
                for (int[] ints : arr) {
                    switch (state) {
                        case INCREASING -> {
                            if (lustElement >= ints[i]) {
                                return false;
                            }
                        }
                        case DECREASING -> {
                            if (lustElement <= ints[i]) {
                                return false;
                            }
                        }
                    }
                    lustElement = ints[i];
                }
            }
        }
        return true;
    }

}
