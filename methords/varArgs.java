package methords;

import java.lang.reflect.Array;
import java.util.Arrays;

public class varArgs {
  public static void main(String[] args) {
    fun();
    
  }

  static void fun(String ...v){
   System.out.println(Arrays.toString(v));
  }
  
}
