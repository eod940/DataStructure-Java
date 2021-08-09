package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Code20 {

    static String[] name = new String[1000];
    static String[] number = new String[1000];
    static int count = 0;

    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("input.txt"));

            while(inFile.hasNext()){ // detect End of File
                name[count] = inFile.next();
                number[count] = inFile.next();
                count++;
            }

            inFile.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(9);
//            return; 여기서 return은 메인 함수의 return임. (메인함수 종료)
        }

        bubbleSort();

        for (int i=0; i<count; i++) System.out.println(name[i] + ":" + number[i]);

    }

    static void bubbleSort(){
        for(int i = count-1; i>0; i--){
            for(int j=0; j<i; j++){

                if(name[j].compareTo(name[j+1]) > 0){ // str1
                    String temp = name[j];
                    name[j] =  name[j+1];
                    name[j+1] = temp;

                    temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
    }
}
