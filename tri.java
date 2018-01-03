import java.util.*;
public class tri{


	public static int[] insertionsort(int[] x,int y,int[] z){
    int check = 0;

    if(y == 3){
    	return z;
    }
     int temp = 0;
    
     for(int i = y; i >= 0; i--){
         if( z[i] > x[y]){
           temp = z[i];
           z[i] = x[y];
           z[i+1] = temp;
           check ++;
         }
     }
     if(check == 0){
        z[y] = x[y];
     }
      y++;
		return insertionsort(x,y,z);
	}
	public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
    int[] intarray = new int[3];
    int[] sortedarray = new int[3];
    String input = scan.nextLine();
    String [] parts = input.split(" ");
    Boolean ans = false;
    if(parts.length != 3){
      System.exit(-1);
    }
    int [] array = new int[4];
    int x =0;
    try{
   
       for (int i = 0; i < 3; i++){
       intarray[i] =  Integer.valueOf(parts[i]);
       if(intarray[i] > 100 ){
       	System.exit(-1);
       }
   }
   sortedarray = insertionsort(intarray,0,array);
   int min = sortedarray[0];
   int mid = sortedarray[1];
   int max = sortedarray[2];
   //System.out.println("hisdf");
   if(min == max && mid == 0){
      System.out.println(min+"+"+intarray[1]+"="+intarray[2]); 
      System.exit(-1);
   }
   if(intarray[0] == min){
      
    
    if(min + intarray[1] == intarray[2]){
      System.out.println(min+"+"+intarray[1]+"="+intarray[2]);
    }
    if(min == intarray[1] -intarray[2]){
      System.out.println(min+"="+intarray[1]+"-"+intarray[2]);
    }
    else if(min * intarray[1] == intarray[2]){
      System.out.println(min+"*"+intarray[1]+"="+intarray[2]);
    }
    else if(min == intarray[1]/intarray[2]){
      System.out.println(min+"="+intarray[1]+"/"+intarray[2]);
    }
   }
   else if(intarray[0] == mid){
      
    
     if(mid + intarray[1] == intarray[2]){
      System.out.println(mid+"+"+intarray[1]+"="+intarray[2]);
    }
    else if(mid == intarray[1] - intarray[2]){
      System.out.println(mid+"="+intarray[1]+"-"+intarray[2]);
    }
    else if(mid * intarray[1] == intarray[2]){
      System.out.println(mid+"*"+intarray[1]+"="+intarray[2]);
    }
    else if(mid - intarray[1] == intarray[2]){
      System.out.println(mid+"-"+intarray[1]+"="+intarray[2]);
    }
    else if(mid == intarray[1]/intarray[2]){
      System.out.println(mid+"="+intarray[1]+"/"+intarray[2]);
    }
   }
   else{
    if(max + intarray[1] == intarray[2]){
      System.out.println(max+"+"+intarray[1]+"="+intarray[2]);
    }
    else if(max - intarray[1] == intarray[2]){
      System.out.println(max+"-"+intarray[1]+"="+intarray[2]);
    }
    else if(max*intarray[1] == intarray[2]){
      System.out.println(max+"*"+intarray[1]+"="+intarray[2]);
    }
    else if(max == intarray[1] * intarray[2]){
      System.out.println(max+"="+intarray[1]+"*"+intarray[2]);
    }
    else if(max/intarray[1] == intarray[2]){
      System.out.println(max+"/"+intarray[1]+"="+intarray[2]);
    }




   }  
}
   catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
    	System.exit(-1);
    }
	}
}