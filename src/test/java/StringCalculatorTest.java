import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest
{
    /*
    1. Test case for empty string - for an empty string it will return 0
     */
    @Test
    void emptyString()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("");
        assertEquals(0,result);
    }

    /*
    2. Handle single number
     */
    @Test
    void singleNumber()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1");
        assertEquals(1,result);
    }

    /*
    3. Handling 2 numbers
     */
    @Test
    void handling2Numbers()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1,2");
        assertEquals(3,result);
    }

    //4. Handling more than 2 numbers.
    @Test
    void handlingMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2,3,4");
        assertEquals(10, result);
    }

}
