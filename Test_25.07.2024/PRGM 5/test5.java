import java.util.*;
public class test5 {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] input1 = new int[n];
        for(int i=0;i<n;i++)
        {
            input1[i]=in.nextInt();
        }
        List<Integer> primes = new ArrayList<>();
        for (int num : input1) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        int smallestPrime = Integer.MAX_VALUE;
        for (int prime : primes) {
            if (prime < smallestPrime) {
                smallestPrime = prime;
            }
        }
        int sum = 0;
        for (int prime : primes) {
            if (prime != smallestPrime) {
                sum += prime;
            }
        }
        System.out.println("Sum of all prime numbers except the smallest prime: " + sum);
    }

}
