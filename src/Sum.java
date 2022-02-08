//Array sum using recursion
import java.util.Scanner;

public class Sum {
    static int sum(int[] arr,int i)
    {
        if(i>=arr.length)
        {
            return 0;
        }
        return (sum(arr,i+1)+arr[i]);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int i=0;
        System.out.println(sum(arr,i));
    }
}
