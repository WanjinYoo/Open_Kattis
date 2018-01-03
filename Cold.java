import java.util.*;
import java.util.List;
public class Cold{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String length = scan.nextLine();
		String input = scan.nextLine();
		String [] parts = input.split(" ");
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		int counter = 0;
		try{
       al.add (Integer.valueOf(length));

       for (int i = 0; i < al.get(0); i++){
       al.add (Integer.valueOf(parts[i]));
      }
    for (int i = 0; i < al.get(0)+1; i++){

       if(al.get(i) < 0) {
       	 counter++;
       	}
     
	}
	System.out.println(counter);
	}
	catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
    	System.exit(-1);
    }

}
   
}