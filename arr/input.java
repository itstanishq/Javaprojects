package arr;

import java.util.Scanner;

public class input {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int[] ar =new int[4];
    ar[0] =23;
    ar[1] = 45;
    ar[2] = 233;
    ar[3] = 543;
    
    System.out.println(ar[3]);

    // input using for loop
    for(int i = 0 ; i < ar.length;i++){
      ar[i] = in.nextInt();
    }

    for(int i = 0 ; i < ar.length;i++){
      System.out.print(ar[i] + " ");
    }


  }
  
}
