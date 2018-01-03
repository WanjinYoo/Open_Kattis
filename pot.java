import java.util.*;
public class pot{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int length = scan.nextInt();
	if (length < 1 || length > 10){
     	System.exit(-1);
     }
	int [] values = new int[length];
	int score = 0;
	for (int i = 0; i < length; i++){
     values[i] = scan.nextInt();
     if (values[i] < 10 || values[i] > 9999){
     	System.exit(-1);
     }
	}
	int [] temp = twovals(values); 
	for (int i = 0; i < length; i++){
     score += Math.pow(values[i]/10,temp[i]);
	}
	System.out.println(score);
	}
	public static int[] twovals(int[] a){
    int [] k = new int[a.length];
     for (int i = 0; i < a.length;i ++){
         k[i] = a[i]%10; 
     }
     return k;
	}
}