// Decimal to Binary using recursion
import java.util.Scanner;

public class Decimal {
    static int Binary(int a)
    {
        if(a==0)
        {
            return 0;
        }

        return ((a%2)+10*Binary(a/2));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(Binary(a));
    }
}
