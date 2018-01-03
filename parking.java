

import java.util.*;
public class parking{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int i =0;
		while(i < t){
			int n = input.nextInt();
			input.nextLine();
			String x = input.nextLine();
			String [] temp =  x.split(" ");
			int [] xi = new int[temp.length];
			for (int j =0; j < temp.length; j ++){
				xi[j] = Integer.valueOf(temp[j]);
			}
			int tmp = 0;

			for (int j=0; j < xi.length-1; j++){
				if(xi[j] < xi [j+1]){
					tmp = xi[j];
					xi[j] = xi[j+1];
					xi[j+1] = tmp;
					j = 0;
				}
			}
			System.out.println(Arrays.toString(xi));
			i++;

		}

















	}
}