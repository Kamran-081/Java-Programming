/* Write a Java program to read n elements into a one
dimensional array and find the sum, average, maximum, and 
minimum values. */

import java.util.*;
class ArrayArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int max = arr[0], min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        double avg = (double)sum/n;
        System.out.println(sum+" "+avg+" "+max+" "+min);
    }
}
