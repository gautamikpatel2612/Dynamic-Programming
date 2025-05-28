70. Climbing Stairs

  
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

*********************************************************************************************************************************************************** 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

*********************************************************************************************************************************************************** 
  
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

*********************************************************************************************************************************************************** 

class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}

*********************************************************************************************************************************************************** 

TC: O(N), we are visiting all the elements once in given input.
SC: O(N), we took extra array to store output.


*********************************************************************************************************************************************************** 
  

QUE : Find the number of distinct ways that you can climb the stairs of n steps. we can take 1 or 2 steps at a time.

n=5 ->                          ----    n=5     
                                |
                            ----    n=4
                            |
                        ----    n=3
                        |
                    ----    n=2 
                    |
                ----    n=1

so if we want to count for n=5
How many steps to reach 5?  -> if 1 steps at a time then from n=4 to 1 step to rach n=5.
                            -> if 2 steps at a time then from n=3 to 2 steps to rech n=5. --> to tal= no. of ways at n=4 + no. of ways at n=3 will be the ans.

  *********************************************************************************************************************************************************** 
  

n=5 ->                          ----    n=5 steps          6.-> from n=3 to reach here(2 stesp) + from n=4 to reach here(1 step) = 3+5 -> 8 ways
                                |
                            ----    n=4 steps            5.-> from n=2 to reach here(2 stesp) + from n=3 to reach here(1 step) = 2+3 -> 5 ways           
                            |
                        ----    n=3 steps              4.-> from n=1 to reach here(2 stesp) + from n=2 to reach here(1 step) = 1+2 -> 3 ways
                        |
                    ----    n=2 steps                3.-> from n=0 to reach here(2 stesp) + from n=1 to reach here(1 step) = 1+1 -> 2 ways
                    |
                ----    n=1 steps                  2.->  1 way

--------------------    n=0 steps                1.->  1 way

*********************************************************************************************************************************************************** 
