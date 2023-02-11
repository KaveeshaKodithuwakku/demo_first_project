import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int[]numbers = new int[7];


        Scanner scan = new Scanner(System.in);

        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Enter Value " );
            numbers[i] = scan.nextInt();
        }

        getSum(numbers);

    }

    public static  void getSum(int array[]){
        int total =0;

       for(int data: array){
           total = total + data;

        }

     System.out.print("Sum of all numbers: " +total);

    }
}
