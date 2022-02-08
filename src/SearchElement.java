//Element search using recursion.....
import java.util.Scanner;

public class SearchElement {
    static boolean Search(int[] arr,int l,int n)
    {
        if(l>=arr.length)
        {
            return false;
        }
        else
        {
            if(arr[l]==n)
            {
                return true;
            }
        }
        return Search(arr,l+1,n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter Element to Search");
        int n=s.nextInt();
        int l=0;
        System.out.println(Search(arr,l,n));
    }
}
