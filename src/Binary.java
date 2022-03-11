// Binary Search Using Recursion....
import java.util.Scanner;

public class Binary
{
        static int Bina(int[] arr,int ss,int f,int l)
        {
            if(f>l)
            {
                return -1;
            }
            int mid=(f+l)/2;
            if(arr[mid]==ss)
            {
                return mid;
            }
            if(arr[mid]>ss)
            {
                l=mid-1;
            }
            if(arr[mid]<ss)
            {
                f=mid+1;
            }
            return Bina(arr,ss,f,l);

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
        int nn=Bina(arr,ss,0,arr.length-1);
        if(nn>=0)
        {
            System.out.println(ss+" found at "+nn);
        }
    }
}
