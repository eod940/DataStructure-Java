package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
    public static void main(String[] args) {
//        String fileName = "input.txt";
        String[] name = new String[1000];
        String[] number = new String[1000];
        int count = 0;

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

        for (int i=0; i<count; i++) System.out.println(name[i] + ":" + number[i]);

    }
}
