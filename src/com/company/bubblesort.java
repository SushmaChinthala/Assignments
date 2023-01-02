package com.company;

import java.util.Scanner;

public class bubblesort {
    public static void main(String args[])
    {
        int a,i,j, n,temp;

        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements into an array");

        for(a = 0; a < n; a++)
        {
            arr[a] = s.nextInt();
        }
        System.out.println("elements before sorting are");
        for(a=0;a<n;a++)
        {
            System.out.println(arr[a]);
        }
        for(i=0;i<n;i++)
            for(j=i+1;j<n;j++)
            {
               if(arr[i]>arr[j])
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;

               }
            }
        System.out.println(" elements after sorting are");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);

        }


    }
}
