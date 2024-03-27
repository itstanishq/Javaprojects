import java.util.*;

public class sum {

  public static void main(String[] args) {

    // sum();
    
    
   int answer = sum3(2,3);
   
   System.out.println(answer); 
  }



static void sum() {
  System.out.print("enter the first number :- ");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  System.out.print("enter the second number :- ");
  int b = sc.nextInt();
  int sum = a + b ;

  System.out.println("the sum of both number is :- " + sum);

 }

// we have to give some parameters in our function

static int sum3(int a,int b) {
  int ans = a + b ;
  return ans ;
}

// this is the example for a function with parameters.


}

