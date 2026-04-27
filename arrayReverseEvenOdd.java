/*Write a Java program to read n elements in a one
dimensional array and display the elements in reverse order 
and count the number of even and odd elements.*/

import java.util.*;
public class ReverseEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even=0, odd=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        for(int i=n-1;i>=0;i--)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println(even+" "+odd);
    }
}
