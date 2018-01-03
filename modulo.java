import java.util.*;
public class modulo{
	public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    int [] arl = new int[10];
    int counter = 0;
    for (int i = 0; i < 10; i++){
       arl[i] = scan.nextInt() % 42;
       if(arl[i] < 0){
       	System.exit(-1);
       }
    }
    int [] hash = new int [10000];
    for (int i = 0; i < 10; i++){
       
       if(hash[arl[i]] == 0){
       	counter++;
       	hash[arl[i]] += 1;
       }
      
    }
    System.out.println(counter);
	}
}