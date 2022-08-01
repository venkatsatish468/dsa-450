import java.util.*;
import java.lang.*;
import java.io.*;
public class zero_reverse_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        // Normal method time complexity O(n)
        int arr2[] = new int[arr.length];
        for(int i=0,k=arr.length-1;i<arr.length && k>=0;i++,k--){
            arr2[i] = arr[k];
        }
        System.out.println("First method output");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        //Second way using start and end index without using a new array
        int start = 0,end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("First method output");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}