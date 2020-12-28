import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestOfTest {

    @Test
    void showAssertionOfTest1() {
        ArrayList<String> exceptedNumbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        exceptedNumbers.add("12");
        exceptedNumbers.add("1");
        exceptedNumbers.add("-1");
        exceptedNumbers.add("1242");
        exceptedNumbers.add("aa");
        exceptedNumbers.add("true");
        exceptedNumbers.add(" ");
        exceptedNumbers.add("78");
        exceptedNumbers.add("8");
        result.add(2);
        result.add(1);
        result.add(1);
        result.add(4);
        result.add(2);
        result.add(1);

        assertArrayEquals(result.toArray(), Task1.sequenceOfNumbers(exceptedNumbers).toArray());
    }

    @Test
    void showAssertionOfExceptionTest1() {
        ArrayList<String> exceptedNumbers = new ArrayList<>();
        exceptedNumbers.add("12");
        exceptedNumbers.add("1");
        exceptedNumbers.add("-1");
        exceptedNumbers.add("1242");
        exceptedNumbers.add("aa");
        exceptedNumbers.add("true");
        exceptedNumbers.add(" ");
        exceptedNumbers.add("78");
        exceptedNumbers.add("8");

        assertThrows(NumberFormatException.class , () -> Task1.sequenceOfNumbers(exceptedNumbers).toArray());
    }

    @Test
    void showAssertionOfTest2() {
        ArrayList<String> exceptedNumbers = new ArrayList<>();
        ArrayList<Integer> changeNum = new ArrayList<>();
        ArrayList<Integer> sortNum = new ArrayList<>();
        ArrayList<ArrayList> result = new ArrayList<>();

        exceptedNumbers.add("12");
        exceptedNumbers.add("1");
        exceptedNumbers.add("-1");
        exceptedNumbers.add("1242");
        exceptedNumbers.add("aa");
        exceptedNumbers.add("true");
        exceptedNumbers.add(" ");
        exceptedNumbers.add("78");
        exceptedNumbers.add("8");

        changeNum.add(0);
        changeNum.add(1);
        changeNum.add(2);
        changeNum.add(0);
        changeNum.add(1);
        changeNum.add(3);

        sortNum.add(-1);
        sortNum.add(1);
        sortNum.add(8);
        sortNum.add(12);
        sortNum.add(78);
        sortNum.add(1242);

        result.add(sortNum);
        result.add(changeNum);

        assertArrayEquals(result.toArray(), Task2.sortNumbers(exceptedNumbers).toArray());
    }

    @Test
    void showAssertionOfExceptionTest2() {
        ArrayList<String> exceptedNumbers = new ArrayList<>();

        exceptedNumbers.add("12");
        exceptedNumbers.add("1");
        exceptedNumbers.add("-1");
        exceptedNumbers.add("1242");
        exceptedNumbers.add("aa");
        exceptedNumbers.add("true");
        exceptedNumbers.add(" ");
        exceptedNumbers.add("78");
        exceptedNumbers.add("8");

        assertThrows(NumberFormatException.class , () -> Task2.sortNumbers(exceptedNumbers).toArray());
    }
}