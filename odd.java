import java.util.*;
public class odd{
	public static void main(String[] args){

   Scanner scan = new Scanner(System.in);
   int length = scan.nextInt();
     if(length > 20 || length < 1){
    	System.exit(-1);
    }
   int[] arl = new int[length];
   for (int i = 0; i < length; i++){
    arl[i] = scan.nextInt();
    if(arl[i] < -10 || arl[i] > 10){
    	System.exit(-1);
    }
   }

   for (int i = 0; i < length; i++){
   	if (arl[i] % 2 == 0){
    	System.out.println(arl[i]+" is even");
    }
    else{
    	System.out.println(arl[i]+" is odd");
    }
   }
	}
}