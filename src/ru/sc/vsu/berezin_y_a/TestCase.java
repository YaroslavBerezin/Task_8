package ru.sc.vsu.berezin_y_a;

public class TestCase {

    int[][] arr1 = new int[][] {    // no
            {1, 2, 3, 8, 0},
    };
    int[][] arr2 = new int[][] {    // yes
            {0},
            {1},
    };
    int[][] arr3 = new int[][] {    // no
            {5, 6},
            {3, 4},
            {1, 2},
    };
    int[][] arr4 = new int[][] {    // yes
            {2, 1},
            {3, 0},
            {4, -1},
            {5, -2},
            {6, -3},
    };
    int[][] arr5 = new int[][] {    // no
            {0, 1, 0},
    };

}
