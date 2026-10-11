import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTaskTest {
    ArrayTask array = new ArrayTask();
@Test
    public void testforRunningSum() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] actual = array.getRunningSum(numbers);
        int[] expected = {1, 3, 6, 10, 15};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
@Test
    public void testforTwoSum() {
        int[] numbers = {2, 7, 11, 15};
        int actual = array.getTwoSum(numbers);
        int expected = 9;
        assertEquals(expected, actual);

    }
}