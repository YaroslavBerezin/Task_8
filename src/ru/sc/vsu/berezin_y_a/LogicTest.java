package ru.sc.vsu.berezin_y_a;

import org.junit.Assert;
import org.junit.Test;

public class LogicTest {

    Logic logic = new Logic();
    boolean correctResult = false;
    boolean actualResult;

    @Test
    public void test1() {
        int[][] testArr1 = Util.readIntArray2FromFile("testFiles/input01.txt");
        actualResult = (logic.isArrayIncreasing(testArr1));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test2() {
        int[][] testArr1 = Util.readIntArray2FromFile("testFiles/input01.txt");
        actualResult = (logic.isArrayDecreasing(testArr1));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test3() {
        int[][] testArr2 = Util.readIntArray2FromFile("testFiles/input02.txt");
        actualResult = (logic.isArrayIncreasing(testArr2));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test4() {
        correctResult = true;
        int[][] testArr2 = Util.readIntArray2FromFile("testFiles/input02.txt");
        actualResult = (logic.isArrayDecreasing(testArr2));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test5() {
        int[][] testArr3 = Util.readIntArray2FromFile("testFiles/input03.txt");
        actualResult = (logic.isArrayIncreasing(testArr3));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test6() {
        int[][] testArr3 = Util.readIntArray2FromFile("testFiles/input03.txt");
        actualResult = (logic.isArrayDecreasing(testArr3));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test7() {
        int[][] testArr4 = Util.readIntArray2FromFile("testFiles/input04.txt");
        actualResult = (logic.isArrayIncreasing(testArr4));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test8() {
        correctResult = true;
        int[][] testArr4 = Util.readIntArray2FromFile("testFiles/input04.txt");
        actualResult = (logic.isArrayDecreasing(testArr4));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test9() {
        int[][] testArr5 = Util.readIntArray2FromFile("testFiles/input05.txt");
        actualResult = (logic.isArrayIncreasing(testArr5));
        Assert.assertEquals(correctResult, actualResult);
    }

    @Test
    public void test10() {
        int[][] testArr5 = Util.readIntArray2FromFile("testFiles/input05.txt");
        actualResult = (logic.isArrayDecreasing(testArr5));
        Assert.assertEquals(correctResult, actualResult);
    }

}
