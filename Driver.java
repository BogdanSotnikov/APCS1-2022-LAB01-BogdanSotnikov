public class Driver{
 public static void main(String[]args){
   /**
   *Examples how to call a method from a different java file:
   */
   //store it in a variable
   int x = Functions.test(1);
   //print it
   System.out.println(Functions.test(2));
   //print it with context!
   System.out.println("test(test(4)) =" + Functions.test(Functions.test(4)));
  
  
   /*
   *You must write several test cases for this problem:
   *The tests should print the intended output in addition to the actual output.
   *You should also replace the placeholder text with an actual function call.
   */
   System.out.println("makeBricks(1,1,2) expected: false result: " + Functions.makeBricks(1, 1, 2));
   System.out.println("makeBricks(1,1,6) expected: true  result: " + Functions.makeBricks(1, 1, 6));

   System.out.println("makeBricks(10,1,16) expected: false  result: " + Functions.makeBricks(10, 1, 16));
   System.out.println("makeBricks(11,1,16) expected: true  result: " + Functions.makeBricks(11, 1, 16));
   System.out.println("makeBricks(1,3,16) expected: true  result: " + Functions.makeBricks(1, 3, 16));
   System.out.println("makeBricks(0,3,27) expected: false  result: " + Functions.makeBricks(0, 3, 27));
   System.out.println("makeBricks(27,0,27) expected: true  result: " + Functions.makeBricks(27, 0, 27));
   System.out.println("makeBricks(0,5,25) expected: true  result: " + Functions.makeBricks(0, 5, 25));
   System.out.println("makeBricks(25,0,25) expected: true  result: " + Functions.makeBricks(25, 0, 25));

 }
}
