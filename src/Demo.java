import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double avarageRate =0.0,totalRate =0.0;
        double[]array = new double[7];

        for(int i=0;i<array.length;i++)
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Day " +(i+1)+" Rain : ");
            array[i] = scan.nextDouble();
            totalRate = totalRate + array[i];

        }

        avarageRate = totalRate / array.length;
        System.out.print("Average Rain rate is : " +avarageRate);

        //for each
        for(double data: array){
            System.out.println(data);
        }
    }
}
