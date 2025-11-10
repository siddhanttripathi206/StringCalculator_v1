public class StringCalculator
{
    // just to make the first test pass
//    public int add(String numbers) {
//        return 0;
//    }

    //2. Handling 1 number and returning 0 if no numbers are entered.
   /* public int add(String numbers)
    {
        if (numbers.isEmpty())
        {
            return 0;
        }
        return Integer.parseInt(numbers);
    }*/

    //3. Handling more than 2 numbers
    /*public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String[] parts = numbers.split(",");
        int sum = 0;
        for (String p : parts) {
            sum += Integer.parseInt(p);
        }
        return sum;
    }*/

    //4. handling new line as delimiter
    public int add(String numbers) {
        if (numbers.isEmpty())
        {
            return 0;
        }

        String[] parts = numbers.split("[,\n]");
        int sum = 0;
        for (String p : parts) {
            sum = sum + Integer.parseInt(p);
        }
        return sum;
    }



}
