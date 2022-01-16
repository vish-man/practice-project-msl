package com.step1.lesson4;

import java.util.Scanner;

// Class  LongestIncreasingSubsequence = lis

public class  LongestIncreasingSubsequence {
	
    // function lis 
    public int[] lis(int[] V)
    {        
        int n = V.length - 1;
        int[] M = new int[n + 1];  
        int[] P = new int[n + 1]; 
        int L = 0;
 
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
 
            //linear search applied here
            for (int tessa = L ; tessa >= 1; tessa--)
            {
                if (V[M[tessa]] < V[i])
                {
                    j = tessa;
                    break;
                }
            }            
            P[i] = M[j];
            if (j == L || V[i] < V[M[j + 1]])
            {
                M[j + 1] = i;
                L = Math.max(L,j + 1);
            }
        }
 
              //backtrack
        int[] result = new int[L];
        int tessa = M[L];
        for (int i = L - 1; i >= 0; i--)
        {
            result[i] = V[tessa];
            tessa = P[tessa];
        }
        return result;             
    }
 
    //main function is here
    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);
        System.out.println("Longest Increasing Subsequence Algorithm Test\n");
 
        System.out.println("How many elements you want to enter");
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("\nEnter "+ n +" elements");
        for (int i = 1; i <= n; i++)
            arr[i] = scan.nextInt();
 
        LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence(); 
        int[] result = obj.lis(arr);       
 
        //printing the result 
        System.out.print("\nLongest Increasing Subsequence is : ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        
        //printing the length of lis here
        System.out.println("\n\nAnd the length of LIS is : "+result.length);
    }
}
