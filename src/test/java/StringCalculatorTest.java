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
}
