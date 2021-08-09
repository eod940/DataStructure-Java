package Section1;

public class Code10 {
    public static void main(String[] args) {
        // 1) 2, 3, ..., n/2 으로 나누었을 때 나머지가 나오면 안됨
        // 2) 2, 3, ..., sqrt(n) : 루트 n보다 클 수 없음..

        int n = 24;
        /* 1번 */
        boolean isPrime = true;
        for (int i=2; i<= n/2 && isPrime; i++){
            if(n%i == 0)
                isPrime = false; // not prime
//              혹은 찾기만 하면 바로 break;
        }
        /* 2번 */
        for (int i=2; i*i <= n && isPrime; i++){
            if(n%i == 0)
                isPrime = false; // not prime
        }
        if (isPrime)
            System.out.println(n + " is prime number");

    }
}
