import java.util.*;
public class carrots{
	public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     try{
   


       String input = scan.nextLine();
       String parts[] = input.split(" ");

      int x = Integer.parseInt(parts[0]);
      String [] al = new String[x];
      int y = Integer.parseInt(parts[1]);
      if(x < 1 || x > 1000 || y <1 || y >1000){
      	System.exit(-1);
      }
     for(int i = 0; i < x; i++ ){
       al[i] = scan.nextLine();
     } 
     System.out.println(y);

     }
    catch(InputMismatchException e){
     	System.exit(-1);
     }



    
	}
}