public class Functions{
 public static int test(int x){
  return x+1; 
 }

/*STEP 1: 
In this comment block, explain what your group discussed and how you wish to partition the problem. 
List the cases, and how finding the answer differs in each case.
Your response:
    We thought that we needed to have enough small bricks to fill what the big bricks wouldn't be able to, which is where we got "goal%5<=small"
    Then, we combined that with the case of having enough bricks to fulfill the goal at all, which is the other half of the boolean.

    In all, our human language solution was this:
    We have at least as many total bricks than we need and at least as many small bricks as we need.

 */

 /*STEP 2: Write the test cases first in the driver. Pay attention to how the test function is called.*/
 /*STEP 3: Complete the function makeBricks.*/
 public static boolean makeBricks(int small, int big, int goal){
  return (goal<=5*big+small) && (goal%5<=small);
 }
}
