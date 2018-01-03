import java.util.*;
public class sevenwonders{
	public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String result = scan.nextLine();
    String [] parts = result.split("");
    int score = 0;
    int t = 0;
    int g = 0;
    int c = 0;
    int bonus =0;
    if(parts.length > 50){
    	System.exit(-1);
    }
    for(int i = 0; i < parts.length;i++){
   if(parts[i].equals("T")){
   	t++;
   }
   if(parts[i].equals("G")){
   	g++;
   }
   if(parts[i].equals("C")){
   	c++;
   }
    }

    score = (int)(Math.pow(t,2) + Math.pow(g,2) + Math.pow(c,2));
    while(t >0 && g>0 && c>0){
     bonus ++;
     t--;
     g--;
     c--;
    }
    score += (bonus*7);
    System.out.println(score);
}
}