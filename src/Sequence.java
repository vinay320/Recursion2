import java.util.Scanner;

public class Sequence {
    public static boolean Seq(String str)
    {
        if(str.length()==1)
        {
            return str.charAt(0) == 'a';
        }
        if(str.length()==2)
        {
            if(str.charAt(0)=='a')
            {
            return str.charAt(1)=='a';
            }
            else if(str.charAt(0)=='b')
            {
                return str.charAt(1)=='b';
            }
        }
        if(str.length()==3)
        {
            if(str.charAt(0)=='a')
            {
                return str.charAt(1)== 'b' && str.charAt(2)=='b';
            }
            else if(str.charAt(0)=='b' && str.charAt(1)=='b')
            {
                return str.charAt(2)=='a';
            }
        }
        return Seq(str.substring(1));

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(Seq(str));
    }
}
