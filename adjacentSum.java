import java.util.*;
public class adjacentSum {
	
  
	    
	    static int solveUtil(int ind, int[] arr, int[] dp) {
	        
	        if (ind < 0) return 0;
	        
	        
	        if (ind == 0) return arr[ind];
	        
	        
	        if (dp[ind] != -1) return dp[ind];
	        
	        
	        int pick = arr[ind] + solveUtil(ind - 2, arr, dp);
	        System.out.println(pick);
	        int nonPick = solveUtil(ind - 1, arr, dp);
	        //System.out.println(nonPick);
	        
	       
	        return dp[ind] = Math.max(pick, nonPick);
	        }
	    

	    
	    static int solve(int n, int[] arr) {
	        int dp[] = new int[n];
	        
	        
	        Arrays.fill(dp, -1);
	        
	        // Call the recursive solver for the last index (n-1).
	        try {
				try {
					return solveUtil(n - 1, arr, dp);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return n;
	    }

	    public static void main(String args[]) {
	        // Input array with elements.
	        int arr[] = {2, 1, 4, 9};
	        
	        // Get the length of the array.
	        int n = arr.length;
	        
	        // Call the solve function to find the maximum possible sum.
	        int result = solve(n, arr);
	        
	        // Print the result.
	        System.out.println(result);
	    }
	}

