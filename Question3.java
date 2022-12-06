public class Q1 {
    public static void main(String[] args) {
        // Question: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
        //           The sum of these multiples is 23.Find the sum of all the multiples of 3 or 5 below 1000.

        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                temp1 = temp1 + i;
            }
        }

        for (int j = 0; j <= 1000; j++) {
            if (j % 5 == 0) {
                temp2 = temp2 + j;
            }
        }

        System.out.println(temp1 + temp2);

    }
}
