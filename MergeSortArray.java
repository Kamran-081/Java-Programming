import java.util.*;
public class MergeSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for(int i=0;i<n1;i++)
          a[i]=sc.nextInt();
        for(int i=0;i<n2;i++)
          b[i]=sc.nextInt();
        int[] c = new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++)
          c[k++]=a[i];
        for(int i=0;i<n2;i++)
          c[k++]=b[i];
        Arrays.sort(c);
        for(int x:c)
          System.out.print(x+" ");
    }
}
