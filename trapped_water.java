import java.io.*;
import java.util.*;

class trapped_water {

    static long TrappingWater(int arr[], int n) { 
        int leftMax = 0, rightMax = 0, res = 0;
        int low = 0, high = n-1;
        while(low <= high){
            if(arr[low] < arr[high]){
                if(arr[low] > leftMax){
                    leftMax = arr[low];
                } else {
                    res += leftMax-arr[low];
                }
                low++;
            } else {
                if(arr[high] > rightMax){
                    rightMax = arr[high];
                } else {
                    res += rightMax-arr[high];
                }
                high--;
            }
        }
        return res;
    } 
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    System.out.println(TrappingWater(arr, n));
		}
	}
}
