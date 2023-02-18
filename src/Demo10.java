import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("com.mysql");
        }catch (ClassNotFoundException ex){
            System.out.println("Check your mysql driver");
        }

        System.out.println("Enter number");
        String num = scanner.next();

        try {
            getSum(num);
        }catch (NumberFormatException ex){
            System.out.println(ex);
        }
    }

    public static void getSum(String n1) throws NumberFormatException{
        System.out.println(Integer.parseInt(n1));
    }
}
