import java.util.*;
import java.lang.*;
import java.io.*;

class largest_fib_subseq {
    
    static boolean isPerfectSquare(double x)  
    { 
          
        // Find floating point value of 
        // square root of x. 
        double sr = Math.sqrt(x); 
      
        // If square root is an integer 
        return ((sr - Math.floor(sr)) == 0); 
    } 
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		for(int i=0;i<b;i++){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        int x=a[j];
		        int num=x*x*5-4;
		        int num1=x*x*5+4;
		        if(isPerfectSquare(num)||isPerfectSquare(num1)){
		            System.out.print(x+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
