import java.util.*;
public class Bijele{
	public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int[] intarray = new int[6];
    String input = scan.nextLine();
    String [] parts = input.split(" ");
    try{
   
       for (int i = 0; i < 6; i++){
       intarray[i] =  Integer.valueOf(parts[i]);
       if(intarray[i] < 0){
       	System.exit(-1);
       }
   }
   int x = 0;
     while ( x < 6){

      if ( x < 2){
        if(intarray[x] != 1){
         System.out.print((1 -intarray[x])+" "); 
        }
        else {
          System.out.print("0 "); 
        }
      }
     else if ( x > 1 && x < 5){
        if(intarray[x] != 2){
         System.out.print((2 -intarray[x])+" "); 
        }
        else {
          System.out.print("0 "); 
        }
      }

     else if(x == 5){
      	if(intarray[x] != 8){
         System.out.println((8 - intarray[x])+" "); 
        }
        else {
          System.out.println("0 "); 
        }

      }
       x++;
     }
	}
   catch(ArrayIndexOutOfBoundsException | NumberFormatException e){

    	System.exit(-1);
    }
}
}