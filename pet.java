import java.util.*;
public class pet{
	public static void main(String[] args){
 
      Scanner scan = new Scanner(System.in);
      String [] vals = new String[5];
      for(int i =0; i < 5; i++){
        vals[i] = scan.nextLine();
      }
      String [] temp = new String[4];
      int [] sums = new int[5];
      
      for(int i =0; i < 5; i++){
        temp = vals[i].split(" ");
        for(int j=0; j < 4; j++){
        	sums[i]+=Integer.parseInt(temp[j]);
        }
      }  
      int max = max(sums); 
      for(int i =0; i < 5; i++){
      	if(sums[i] == max){
      		System.out.println((i+1)+" "+max);
      	}
      }
	}
  public static int max(int[] x){
  	int max = 0;
  	for(int i =0; i <x.length ; i++){
       if(x[i] > max){
       	max = x[i];
       }
  	}
  	return max;
  }
}