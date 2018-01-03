import java.util.*;
public class Dicecup{

	public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int[] intarray = new int[2];
    String input = scan.nextLine();
    String [] parts = input.split(" ");
    try{
   
       for (int i = 0; i < 2; i++){
       intarray[i] =  Integer.valueOf(parts[i]);
       if(intarray[i] > 20 || intarray[i] < 4){
       	System.exit(-1);
       }
   }
   
   int max = 0;
   int[] ans = dice(intarray[0],intarray[1]);
   int[] temp = new int[intarray[0]*intarray[1]];
   for (int i = 2; i <= (intarray[0]*intarray[1]); i++){
     if (ans[i] >= max){
     	max = ans[i];
     }
 }
  for (int i = 2; i <= (intarray[0]*intarray[1]); i++){
    if (ans[i] == max){
    	System.out.println(i);
    }
  }

}     
    catch(ArrayIndexOutOfBoundsException e){
    	System.exit(-1);
    }
	}
   public static int[] dice(int x,int y){
    int [] temp = new int [(x*y)+1];
    Arrays.fill(temp,0);
    for (int i = 1; i <= x; i ++){
    	for(int j =1; j<=y; j++){
    		temp[i+j] += 1;
    	}
    }
   	return temp;
   } 
}
