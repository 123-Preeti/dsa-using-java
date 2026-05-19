package com.dp;

public class LongestCommonSubsequence {
	public static int lcs(String s1, String s2, int n, int m) {
	    if(n == 0 || m == 0) {
	      return 0;
	    }
	    
	    if(s1.charAt(n - 1) == s2.charAt(m - 1)) {
	      return 1 + lcs(s1, s2, n - 1, m - 1);
	    } 
	    
	    return Math.max(lcs(s1, s2, n - 1, m), lcs(s1, s2, n, m - 1));
	  }
	  
	  public static int lcsTopDown(String s1, String s2, int n, int m, Integer[][] arr) {
	    if(n == 0 || m == 0) {
	      return 0;
	    }
	    
	    if(arr[n][m] == null) {
	      if(s1.charAt(n - 1) == s2.charAt(m - 1)) {
	        arr[n][m] = 1 + lcsTopDown(s1, s2, n - 1, m - 1, arr);
	      } else {
	        arr[n][m] = Math.max(lcsTopDown(s1, s2, n - 1, m, arr), lcsTopDown(s1, s2, n, m - 1, arr));  
	      }  
	    }

	    return arr[n][m];
	  }

	  public static int lcsBottomUp(String s1, String s2, int n, int m) {
	    if(n == 0 || m == 0) {
	      return 0;
	    }
	    
	    int[][] arr = new int[n + 1][m + 1];
	    
	    for(int i = 1; i <= n; i++) {
	      for(int j = 1; j <= m; j++) {
	          arr[i][j] = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 
	        		  (1 + arr[i - 1][j - 1]) : 
	        			  (Math.max(arr[i][j - 1], arr[i - 1][j]));
	      }
	    }
	    
	    return arr[n][m];
	  }

	  public static void main(String[] args) {
	    String s1 = "abde";
	    String s2 = "acd";
	    
	    System.out.println(LongestCommonSubsequence.lcs(s1, s2, s1.length(), s2.length()));
	    
	    Integer[][] arr = new Integer[s1.length() + 1][s2.length() + 1];
	    System.out.println(LongestCommonSubsequence.lcsTopDown(s1, s2, s1.length(), s2.length(), arr));
	    
	    System.out.println(lcsBottomUp(s1, s2, s1.length(), s2.length()));
	  }
}


//			392. Is Subsequence
//			Input: s = "abc", t = "ahbgdc"
//			Output: true
//
//			public boolean isSubsequence(String s, String t) {
//			    if(s.length() == 0 && t.length() > 0)
//			        return true;
//			    if(t.length() == 0 && s.length() > 0)
//			        return false;
//			    if(s.length() == 0 && t.length() == 0)
//			        return true;
//			    int count = s.length();
//			    int j = t.indexOf(String.valueOf(s.charAt(0)));
//			    if(j>= 0)
//			        count--;
//			    for(int i = 1; i< s.length(); i++) {
//			        j = t.indexOf(String.valueOf(s.charAt(i)), j + 1);
//			        if(j>= 0)
//			            count--;
//			    }
//			    if(count == 0)
//			        return true;
//			    return false;
//			}