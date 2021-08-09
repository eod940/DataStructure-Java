package Section1;

import java.util.Scanner;

public class Code14_bubble {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++)
            data[i] = sc.nextInt();
        sc.close();

        for(int i=n-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (data[j] > data[j+1]){
                    // swap
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted data:");
        for(int i = 0; i<n; i++)
            System.out.println(data[i]);

    }
}
