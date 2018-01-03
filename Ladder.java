import java.util.*;
public class Ladder{
 public static void main(String[] args){

   Scanner scan = new Scanner(System.in);
   String s = scan.nextLine();
   String [] array = s.split(" ");
   Double maxlen = 0.0;
   Double [] newal = new Double[2];
   for(int i = 0; i < 2; i++){
   	newal[i] = Double.parseDouble(array[i]);
   }

   maxlen = newal[0]/Math.sin(Math.toRadians(newal[1]));
   int x = (int)Math.ceil(maxlen);
   System.out.println(x);





   }
 }