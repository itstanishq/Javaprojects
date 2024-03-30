package methords;

public class overloading {

  public static void main(String[] args) {
    fun(43);  // in overloading the func name could be same but args should be different 
    fun("tanishq");  
  }

  static void fun(int a){
   System.out.println(a);
  }

  static void fun(String a){
    System.out.println(a);
  }
  
}

