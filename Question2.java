public class Q3 {
    public static void main(String[] args) {
        //Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
        //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        // By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

        int Num1 = 0;
        int Num2 = 1;
        int sum = 0;

        do
        {
            sum = Num1 + Num2;
            Num1 = Num2;
            Num2 = sum;

            if (Num2 % 2 == 0)
                sum = sum + Num2;
        }
        while (Num2 < 4000000);

        System.out.println(sum);


    }
}
