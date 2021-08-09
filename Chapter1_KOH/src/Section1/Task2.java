package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("문제 6번 :"+question6());
    }

    public static int question6(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;

        if(n==1) return 1;
        for(int i=1; i<n; i++){
            // 2는 원하는 밑임
            result = 2 * result;
            if(result == n){
                return result;
            }
            else if(result > n){
                return result;
            }
        }
        return -1;
    }

    public static int question7(){
        int result = 0;
        Scanner sc = null;
        try{
            sc = new Scanner(new File("taskData.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        int n = sc.nextInt();
        int [] data = new int [n];
        for(int i=0; i<n; i++){
            for(int j=n-1; j==0; j--){
                result = data[i]-data[j];
            }
        }

        return result;
    }

}
