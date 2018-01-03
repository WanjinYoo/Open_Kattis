import java.util.*;
public class reversebinary{

	public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    try{
    int x = scan.nextInt();
     if(x < 1 || x > 1000000000){
       System.exit(-1);
    }

    String s = Integer.toBinaryString(x);
    String [] sl = s.split("");

    int rnumber = 0;
     ArrayList<Integer> arl2 = new ArrayList<Integer>(); 
    List array = intsum(sl,arl2);
    Collections.reverse(array);
    Iterator it = array.iterator();
    int k = array.size() - 1;
   while(it.hasNext()){
    
         rnumber +=  (int)it.next() * ((int)Math.pow(2,k));
         k--;
    }
    
    System.out.println(rnumber);
}
     catch(NumberFormatException | InputMismatchException e){
        System.exit(-1);
     }
	}
	public static ArrayList<Integer> intsum(String[] sl,ArrayList<Integer> array){
	int n = sl.length-1;
    String[] newArray= new String[n];
   	if (sl[0].equals("1")){
     	array.add(1);
     	if (n == 0){
     		return array;
     	}
     	else{
     		System.arraycopy(sl,1,newArray,0,n);
     	return intsum(newArray,array);
     }
     }
     else{

     	array.add(0);
     	if (n == 0){
     		return array;
     	}
     	else{
     		System.arraycopy(sl,1,newArray,0,n);
     return intsum(newArray,array);
 }
 } // else branch
    }
}