import java.util.Scanner;

public class Duplicate {
    public static String Dup(String a1)
    {
        if(a1.length()<=1)
        {
            return a1;
        }
        if (a1.charAt(0)==a1.charAt(1))
        {
            return Dup(a1.substring(1));
        }
        else
        {
            return a1.charAt(0)+Dup(a1.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        System.out.println(Dup(a));
    }
}
