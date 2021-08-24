import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Summary {

//    static String[] names = new String[1000];
//    static int[] numbers = new int[1000];
//    static int n = 0;

    public static void main(String[] args) {

        String[] names = new String[1000];
        int[] numbers = new int[1000];
        int n = 0;

        Scanner sc = null;
        try {
            sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()){
                names[n] = sc.next();
                numbers[n] = sc.nextInt();
                n++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        bubbleSort(n, names, numbers);

        for (int i = 0; i < n; i++) {
            System.out.printf("이름: " + names[i]);
            System.out.println(", 전화번호: " + numbers[i]);
        }

    }

    public static void bubbleSort(int n, String[] names, int[] numbers) {
        for(int i=n-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (names[j].compareTo(names[j+1]) > 0){
                    // swap
                    String tempString = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempString;

                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                }
            }
        }
    }
}
