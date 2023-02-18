import java.util.Locale;

public class Demo9 {
    public static void main(String[] args) {
        String name = "Kaveesha";
        String  n1 = new String("Madushani");

        System.out.println(name.charAt(2));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.toCharArray());
        System.out.println(name.substring(2));
        System.out.println(name.length());

        String s1 = "ABS";
        String s2 = "CDF";

        System.out.println(s1+s2);
        System.out.println(s1);
        System.out.println(s1.concat(s2));
        System.out.println(s1);

        StringBuffer bf = new StringBuffer("ABC");
        System.out.println("Buffer --->"+bf);
        bf.append("Academy");
        System.out.println("Buffer ===>"+bf);

        StringBuilder sd = new StringBuilder("ABC");
        System.out.println("Builder -->"+sd);
        sd.append("Course");
        System.out.println("Builder ==>" +sd);

    }
}
