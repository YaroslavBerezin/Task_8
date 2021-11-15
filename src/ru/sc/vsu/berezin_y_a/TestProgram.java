package ru.sc.vsu.berezin_y_a;

import java.io.FileWriter;
import java.io.IOException;

public class TestProgram {

    Logic logic = new Logic();
    TestCase testCase = new TestCase();

    public boolean test() throws IOException {
        FileWriter writer = new FileWriter("testFiles/testResult.txt");
        if (logic.solution(testCase.arr1) == "no") {
            writer.write("Test 1 is not completed");
            writer.flush();
            writer.close();
            return false;
        } else if (logic.solution(testCase.arr2) != "yes") {
            writer.write("Test 2 is not completed");
            writer.flush();
            writer.close();
            return false;
        } else if (logic.solution(testCase.arr3) != "no") {
            writer.write("Test 3 is not completed");
            writer.flush();
            writer.close();
            return false;
        } else if (logic.solution(testCase.arr4) != "yes") {
            writer.write("Test 4 is not completed");
            writer.flush();
            writer.close();
            return false;
        } else if (logic.solution(testCase.arr5) != "no") {
            writer.write("Test 4 is not completed");
            writer.flush();
            writer.close();
            return false;
        } else {
            return true;
        }
    }

}
