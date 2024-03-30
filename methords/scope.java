package methords;

public class scope {

  public static void main(String[] args) {
    int a =99;
    int b = 40 ;
    {
    //  int a = 88;   // this value cant be changed becouse it is pre intialised 

    int c = 30;
    }

   // System.out.println(c);   // it cant be displayed becouse this variable is inside the block scope 
  }

  static void random (int marks){
    int num = 67;
    System.out.println(num);
    System.out.println(marks);
  }
  
}
