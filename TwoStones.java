import java.util.*;
import java.io.*;
public class TwoStones{
	public static void main(String[] args){
      

      Scanner scan = new Scanner(System.in);
      try {
      int input = scan.nextInt();
      if(input <= 10000000 && input >=1){
      if(input % 2 == 0){
      	System.out.println("Bob");
      }
      else{
      	System.out.println("Alice");
      }
  }
} 
      catch(InputMismatchException e){
        	System.exit(-1);
        }



	
	}
}