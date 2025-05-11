//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.getTable(n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for(int i=1;i<11;i++){
            
            ar.add(i*n);
        }
        return ar;
    }
}