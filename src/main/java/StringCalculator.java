public class StringCalculator
{
    // just to make the first test pass
//    public int add(String numbers) {
//        return 0;
//    }

    //2. Handling 1 number and returning 0 if no numbers are entered.
    public int add(String numbers)
    {
        if (numbers.isEmpty())
        {
            return 0;
        }
        return Integer.parseInt(numbers);
    }

}
