public class Q2 {
    public static void main(String[] args) {

        // Question: The prime factors of 13195 are 5, 7, 13 and 29.What is the largest prime factor of the number 600851475143 ?

        long n=600851475143L;

        for(long i=2;i<n ;++i)
        {
            while(n % i==0)
            {//for yes
                n=n/i;

            }

        }
        System.out.println(n);
    }
}