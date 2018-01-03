import java.util.*;
public class speedlimit{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	ArrayList<String> intlist = new ArrayList<String>(); 
   try{
   int k = 0;
    while(true){
     int totalmile = 0;
     int temp = 0;
     int[] temparray = new int[2];
     k = scan.nextInt();
     if(k == -1){
     	break;
     }
     String [] al = new String[k];
     scan.nextLine();
     for(int i = 0; i < k; i ++){
       al[i] = scan.nextLine();
     }
     for(int i = 0; i < k; i ++){
        String [] parts = al[i].split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
         if(x < 1 || x > 90 || y <1 || y > 12){
      System.exit(-1);
       }

        totalmile += x * (y - temp);
        y = y - temp;
        temp = y + temp;
     }
     intlist.add(totalmile+" miles");
    }
    Iterator it=intlist.iterator();
    
       while(it.hasNext()){
    	System.out.println(it.next());
    }
   }
    catch(InputMismatchException e){
     	System.exit(-1);
     }
  


	}
}