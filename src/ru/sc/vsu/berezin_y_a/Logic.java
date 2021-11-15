package ru.sc.vsu.berezin_y_a;

public class Logic {

    public String solution(int[][] arr) {
        if (isArrayDecreasing(arr) || isArrayIncreasing(arr)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private boolean isArrayIncreasing(int[][] arr) {
        int lustElement = -999;
        for (int i = 0; i < arr[arr.length - 1].length; i++) {
            if (i % 2 == 0) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (lustElement >= arr[j][i]) {
                        return false;
                    }
                    lustElement = arr[j][i];
                }
            } else {
                for (int[] ints : arr) {
                    if (lustElement >= ints[i]) {
                        return false;
                    }
                    lustElement = ints[i];
                }
            }
        }
        return true;
    }

    private boolean isArrayDecreasing(int[][] arr) {
        int lustElement = 999;
        for (int i = 0; i < arr[arr.length - 1].length; i++) {
            if (i % 2 == 0) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (lustElement <= arr[j][i]) {
                        return false;
                    }
                    lustElement = arr[j][i];
                }
            } else {
                for (int[] ints : arr) {
                    if (lustElement <= ints[i]) {
                        return false;
                    }
                    lustElement = ints[i];
                }
            }
        }
        return true;
    }

}
