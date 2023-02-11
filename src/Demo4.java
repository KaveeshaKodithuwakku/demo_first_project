import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {

        int mainArrayIndexCount = 6,subArrayIndexCount;

        Scanner scan = new Scanner(System.in);

        int [][] mainArray = new int[mainArrayIndexCount][];

        for(int i=0; i<3;i++){
            System.out.print("Enter sub array index count : " );
            subArrayIndexCount = scan.nextInt();
            mainArray[i] = new int[subArrayIndexCount];
            for(int j=0; j < mainArray[i].length; j++){
                System.out.println("Enter Value : " );
                mainArray[i][j] =  scan.nextInt();
                System.out.println("mainArray["+ i + "]" + "[" + j + "] = " +mainArray[i][j]);
            }
        }

    }
}
