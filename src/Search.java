// Linear search using recursion...
import java.util.Scanner;

public class Search {
     static int Searchh(int[] arr, int i, int ss)
    {
        if(i<0) {
            return -1;
        }
       else if(arr[i]==ss)
        {
            return i;
        }
        return Searchh(arr,(i-1),ss);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("enter element to search");
        int ss=s.nextInt();
        int a=Searchh(arr,(arr.length-1),ss);
        if(a>=0)
        {
            System.out.println(ss+ " found at "+a);
        }
        else
        {
            System.out.println(ss+" Not found");
        }
    }
}
