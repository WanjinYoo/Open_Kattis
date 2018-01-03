import java.util.*;
public class kemija{
	public static void main(String[] args){
	
    Scanner scan = new Scanner(System.in);
     String s = scan.nextLine();
     String [] al = s.split(" ");
     String [] newstring = new String[al.length];
     for(int i = 0; i < al.length; i++){
     	for(int j = 0; j < al[i].length();j++){
           

         if(al[i].substring(j,j+1).matches("a|e|i|o|u")){
         	newstring[i] = concat(newstring[i],al[i].substring(j,j+1));
         	j += 2;
         }
         else {
         	newstring[i] =concat(newstring[i],al[i].substring(j,j+1));
         }
     	}
     }
     for(int i =0; i < newstring.length;i++){
     System.out.println(newstring[i]);
 }
	}
	public static String concat(String a, String b){
		if (a == null){
			return b;
		}
		else{
		a += b;
		return a;
	}
	}
}