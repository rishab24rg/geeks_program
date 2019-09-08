import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


class kth_smallest_element {
    public static int findKthSmallest(List<Integer> A, int k)
	{
		// create an max-heap using PriorityQueue class and
		// insert first k elements of the array into the heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.addAll(A.subList(0, k));

		// do for remaining array elements
		for (int i = k; i < A.size(); i++)
		{
			// if current element is less than the root of the heap
			if (A.get(i) < pq.peek())
			{
				// replace root with the current element
				pq.poll();
				pq.add(A.get(i));
			}
		}

		// return the root of max-heap
		return pq.peek();
	}

	public static void main(String[] args)
	{
	    int x;
	    Scanner sc=new Scanner(System.in);
	    x=sc.nextInt();
	    for(int j=1;j<=x;j++)
	    {
	        int n,i,k;
    	    n=sc.nextInt();
    	    List<Integer> A = new ArrayList<>();
    	    for(i=0;i<n;i++)
    	    {
    	        A.add(sc.nextInt());
    	    }
    	    k=sc.nextInt();
    		System.out.println(findKthSmallest(A, k));
    	    }
	    
	}
}
