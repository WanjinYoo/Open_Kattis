import java.util.*;
public class spavanac{
	public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    String k = scan.nextLine();
    String [] a = k.split(" ");
    int x = Integer.parseInt(a[0]);
    int y = Integer.parseInt(a[1]);
    int x2 =0;
    int y2 =0;
   if(x < 0 || x > 23 || y < 0 || y > 59){
   	System.exit(-1);
   }
    if(y >= 45){
    	x2 = x;
    	y2 = y-45;
    }
    else{
     y2 = (y+60) -45;
     if (x == 0){
      x2 = 23;
     }
     else{ 
      x2 =  x-1;
     }
    }
    System.out.println(x2+" "+y2);
	}
}