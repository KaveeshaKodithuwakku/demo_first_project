import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {

        double[] marks = {12.5,78.3,56.6,65.4,53.2};

        double[] result = incrementArray(marks);

        System.out.println(Arrays.toString(result)); // [13.5,79.3,57.6,66.4,54.2]
    }

    public static double[] incrementArray(double[] array){

        double finalMark[] = new double[array.length] ;

        for(int i=0;i<array.length;i++){
            finalMark[i] = array[i] + 1;
        }

        return finalMark;
    }

}
