package methords;

public class Shadowing {
 static int x = 90; // this will be shadowed at line 8
  public static void main(String[] args) {
    System.out.println(x); //90
    int x;
   // System.out.println(x);  // scope will begin when value is initialised 
    x = 40;
    System.out.println(x); //40
    fun(); //90
  }

  static void fun(){
    System.out.println(x);
  }
  
}
