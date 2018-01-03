import java.util.*;
public class stackingcups{

	public static boolean isInteger(String s) {
      boolean isValidInteger = false;
      try
      {
         Integer.parseInt(s);
 
         // s is a valid integer
 
         isValidInteger = true;
      }
      catch (NumberFormatException ex)
      {
         // s is not an integer
      }
 
      return isValidInteger;
   }
  public static void sort(int[] a){
   int temp = 0;
   for (int i = 0; i < a.length -1; i++){
   
    if (a[i] > a[i+1]){
        temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
        sort(a);
    }
   } 
  
  }

	public static void main(String[] args){

     Scanner scan = new Scanner(System.in);
     try{

     	Boolean check = true;
     	int length = scan.nextInt();
     	scan.nextLine();
      if(length < 1 || length > 20){
        System.exit(-1);
      }
     	String parts[] = new String[length];
     	int [] arl = new int [length];
      String [] sarl = new String [length];
     	String temp[] = new String[2];
      int [] temparl = new int [length];
        int tempscore = 0;

       for(int i = 0; i < length; i ++){
         parts[i] = scan.nextLine();
       }
 

       for(int j = 0; j < length; j ++){
       	
         temp = parts[j].split(" ");
         if (isInteger(temp[0])){
         	tempscore  =  Integer.valueOf(temp[0]) / 2;
          if (tempscore > 1000){
           System.exit(-1);
         }
         arl[j] = tempscore;
         sarl[j] = temp[1];
         temparl[j] = tempscore;
     }//if statement
     else {
      tempscore  =  Integer.valueOf(temp[1]);
      if(tempscore > 1000){
     System.exit(-1);
       }
     	arl[j] = tempscore;
      sarl[j] = temp[0];
      temparl[j] = tempscore;
     }
    }
    sort(arl);
    for(int i = 0; i < length; i++){
      for(int j = 0; j < length; j++){
       if(arl [i] == temparl[j]){
         System.out.println(sarl[j]);
       }
      }
    }
}
     catch(InputMismatchException e){
     	System.exit(-1);
     }
	}
}