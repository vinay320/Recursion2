import java.util.Scanner;

public class StringToInt {

        public static void StI (String c)
        {
            if (c.length() >= 1) {
                System.out.print(Integer.parseInt(String.valueOf(c.charAt(0))));
            }
            StI(c.substring(1));

        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        try {
            StI(a);
        }catch (Exception e)
        {

        }
    }
}
