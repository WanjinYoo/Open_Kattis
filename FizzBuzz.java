import java.util.*;
import java.io.*;
public class FizzBuzz{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
    int[] intarray = new int[3];
    String input = scan.nextLine();
    String [] parts = input.split(" ");

    try{
    for (int i = 0; i < 3; i++){
       intarray[i] =  Integer.valueOf(parts[i]);
    }
     int x = intarray[0];
     int y = intarray[1];
     int z = intarray[2];
     
     for (int i = 1; i <= z ; i++ ) {
       if(i < x){
       	System.out.println(i);
       }
      else if(i % x == 0 && i % y == 0 && i >= y){
        	System.out.println("FizzBuzz");
      }
      else if(i % x == 0 ){
        	System.out.println("Fizz");
      }
       else if(i % y == 0 ){
        	System.out.println("Buzz");
      }
      else {
      	System.out.println(i);
      }



     }

     }
    catch(ArrayIndexOutOfBoundsException e){
    	System.exit(-1);
    }

	}
}