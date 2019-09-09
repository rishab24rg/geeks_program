
import java.util.*;
import java.lang.*;
import java.io.*;

class bit_difference {
    
    static int sumBitDifferences(int arr[], int n) 
    { 
          
        int ans = 0; // Initialize result 
  
        // traverse over all bits 
        for (int i = 0; i < 32; i++) { 
              
            // count number of elements  
            // with i'th bit set 
            int count = 0; 
              
            for (int j = 0; j < n; j++) 
                if ((arr[j] & (1 << i)) == 0) 
                    count++; 
  
            // Add "count * (n - count) * 2"  
            // to the answer 
            ans += (count * (n - count) * 2); 
        } 
          
        return ans; 
    } 
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
		    int n=sc.nextInt();
		    int[] x=new int[n];
		    for(int j=0;j<n;j++){
		        x[j]=sc.nextInt();
		    }
		    System.out.println(sumBitDifferences(x,n));
		}
	}
}
