package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task{
    public static void main(String[] args) {
        System.out.println("Task set #1, 1번문제 답:"+question1());
        System.out.println("Task set #1, 2번문제 답:"+question2());
        System.out.println("Task set #1, 3번문제 답:"+question3());
        System.out.print("Task set #1, 4번문제 숫자 입력: "); question4();
        System.out.println("Task set #1, 5번문제 답:"+question5());


    }
    public static boolean isPrime(int k){
        if (k<2)
            return false;
        for (int i=2; i*i<=k; i++)
            if(k % i ==0)
                return false;
        return true;
    }

    public static int question1(){
        int count = 0;
        for(int i=0; i <= 100000; i++){
            if(isPrime(i)) count++;
        }
        return count;
    }

    public static int question2(){
        int count = 0;
        int add_minPrime = 0;
        for(int i=0; i<=100000; i++){
            if(isPrime(i) && count < 50){
                count++;
                add_minPrime += i;
            }
        }
        return add_minPrime;
    }

    public static int question3(){
        int notOdd = 0, odd = 0;
        Scanner sc = null;
        try {
            sc = new Scanner(new File("taskData.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int n = sc.nextInt();
        int [] data = new int [n];
        for(int i=0; i<n; i++) data[i] = sc.nextInt();
        sc.close();

        // Start
        for(int i=0; i < data.length; i++){
            if(data[i] % 2 == 0) notOdd += data[i];
            else odd += data[i];
        }
        notOdd -= odd;

        return notOdd;
    }

    public static void question4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<n+1; i++) {
            System.out.print("1 ");
            for(int j=1; j<n+1; j++) {
                if(i > j) {
                    System.out.print((j+1)+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static int question5(){
        Scanner sc = null;
        int result = 0;
        int minN = 0;
        try {
            sc = new Scanner(new File("taskData.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        int n = sc.nextInt();
        int [] data = new int [n];

        for(int i = 0; i<n; i++) data[i] = sc.nextInt();
        sc.close();

        for(int i=0; i<n; i++){
            if(data[i] > result) result = data[i];
            else if(minN == 0) minN = data[i];
            if(data[i] < minN) minN = data[i];
        }
        System.out.println(" max:" +result + " min:" + minN);
        result -= minN;
        return result;
    }

}
