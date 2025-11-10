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
    /*public int add(String numbers) {
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
    }*/

    //5. Supporting custom Delimeter
    /*public int add(String numbers) {
        if (numbers.isEmpty())
        {
            return 0;
        }

        String delimiter = "[,\n]";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }

        String[] parts = numbers.split(delimiter);
        int sum = 0;
        for (String p : parts) {
            sum = sum + Integer.parseInt(p);
        }
        return sum;
    }*/

    //6. negative number
    public int add(String numbers) {
        if (numbers.isEmpty())
        {
            return 0;
        }

        String delimiter = "[,\n]";
        if (numbers.startsWith("//"))
        {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }

        String[] parts = numbers.split(delimiter);
        int sum = 0;
        StringBuilder negatives = new StringBuilder();

        for (String p : parts)
        {
            int num = Integer.parseInt(p);
            if (num < 0)
            {
                if (negatives.length() > 0)
                {
                    negatives.append(",");
                    negatives.append(num);
                }

            }
            sum = sum + num;
        }

        if (negatives.length() > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + negatives);
        }

        return sum;
    }




}
