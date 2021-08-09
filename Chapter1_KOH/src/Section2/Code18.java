package Section2;

import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++)
            data[i] = sc.nextInt();
        sc.close();

        bubbleSort(n, data); // void type(return이 없어서)이기 때문에 변수와 같이 선언하지 않음

        System.out.println("Sorted data:");
        for(int i = 0; i<n; i++)
            System.out.println(data[i]);

    }

    static void bubbleSort(int n, int [] data){
        for(int i=n-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
//                    swap(data[j], data[j+1]);
                }
            }
        }
//        return; 있으나 마나함..
    }

/*   값에 의한 호출(Primitive type) 이라 동작하지 않음
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }*/

}
