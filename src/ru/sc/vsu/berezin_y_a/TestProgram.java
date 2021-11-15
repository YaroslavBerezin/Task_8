package ru.sc.vsu.berezin_y_a;


public class TestProgram {

    Logic logic = new Logic();
    TestCase testCase = new TestCase();

    public boolean test() {
        if (logic.solution(testCase.arr1) != "no") {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (logic.solution(testCase.arr2) != "yes") {
            System.out.println("Test 2 is not completed");
            return false;
        } else if (logic.solution(testCase.arr3) != "no") {
            System.out.println("Test 3 is not completed");
            return false;
        } else if (logic.solution(testCase.arr4) != "yes") {
            System.out.println("Test 4 is not completed");
            return false;
        } else if (logic.solution(testCase.arr5) != "no") {
            System.out.println("Test 5 is not completed");
            return false;
        } else {
            return true;
        }
    }

}
