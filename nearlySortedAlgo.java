import java.util.*;
import java.lang.*;
import java.io.*;

class nearlySortedAlgo {
	    public static void nearlySortedAlgo(int[] arr,int k) {
		
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for(int i=0;i<k;i++) {
			heap.add(arr[i]);
		}
		
		for(int i=k;i<arr.length;i++) {
			System.out.print(heap.remove() + " ");
			heap.add(arr[i]);
		}
		
		while(!heap.isEmpty())
			System.out.print(heap.remove() + " ");
		
		
	}
	public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        while(tc-->0){
            int n= scn.nextInt();
            int k = scn.nextInt();
            
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = scn.nextInt();
            
            
            nearlySortedAlgo(arr,k);
            System.out.println();
            
        }
	}
}
