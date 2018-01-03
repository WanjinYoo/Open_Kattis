import java.util.*;
public class trik{
	public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   String input = scan.nextLine();
   String [] parts = input.split("");
   for (int i = 0; i < parts.length; i++){
   	if((!parts[i].equals("A")) && (!parts[i].equals("B")) && (!parts[i].equals("C"))){
   		System.out.println("not valid");
   		System.exit(-1);
   	}
   }
   if (parts.length > 50){
   	System.exit(-1);
   }
   int x = 0;
   int ball = 1;
   do{
    String element = parts[x];
   switch(element){
    case "A": if (ball == 1){
    	ball++;
    }
    else if(ball != 3){
    	ball--;
    }
     break;
    case "B": if (ball == 2){
    	ball++;
    }
    else if(ball != 1){
    	ball--;
    }
     break;
    case "C": if (ball == 3){
    	ball-=2;
    }
    else if(ball !=2){
    	ball += 2;
    }
    break;
   }
   x++;
   }
   while(x < parts.length);
   System.out.println(ball);

   }



	
}