import java.util.*;
public class Zamka{

	public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   try{
   Boolean check = false;
   int x = scan.nextInt();
   int y = scan.nextInt();
   int z = scan.nextInt();
   if(x > y || y > 10000|| x < 1 || x > 10000 || z < 1 || z > 36){
   	System.exit(-1);
   }
  int i = x;
  int min = y;
  int max = i;
  while (y >= i){
       
    if(add(i) == z){
       if (i < min){
       	min = i;
       }
       if (max < i){
       	max = i;
       }
      check = true;
    }
    i++;
  }
  if(check){
  System.out.println(min);
  System.out.println(max);
}
 else{
  System.out.println("Not found");
 }

} // catch 
   catch(InputMismatchException e){
    	System.exit(-1);
    }

	}

   public static int add(int x){
   	if (x < 10){
   		return x;
   	}
   	else {
   		return x % 10 + add(x/10);
   	}
   }


}