import java.util.*;
public class Stucktime{
	public static void main(String[] args){


		Scanner scan = new Scanner(System.in);
		try {

			int x = scan.nextInt();
			for(int i = 1; i <= x; i++){
				System.out.println(i+" Abracadabra");

			}


		}
		catch(InputMismatchException e){
			System.exit(-1);
		}







	}
}