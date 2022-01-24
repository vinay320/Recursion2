import java.util.Scanner;

public class Replace {
    public static char[] rep(char[] a, char char1, char char2, int c) {
        if (c < a.length) {
            if (a[c] == char1) {
                a[c] = char2;
            }
        }
        else if(c==a.length){
            return a;}

            return rep(a, char1, char2, c + 1);


}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        char[] ch=a.toCharArray();
        char char1=s.next().charAt(0);
        char char2=s.next().charAt(0);
        char[] s1= rep(ch, char1, char2, 0);
        System.out.println(s1);

    }
}
