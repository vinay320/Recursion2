import java.util.Scanner;

public class Staircase {
    public static int stair(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        return stair(n-1)+stair(n-2)+stair(n-3);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(stair(n));
    }
}

