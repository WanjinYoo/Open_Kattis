import java.util.*;
public class parovi{

	public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    if(length > 20 || length < 1){
         System.exit(-1);
    }
     // 2. {1,2}
     // 3. ({1,2},{2,3}),     {1,3},({1,2},{1,3},{2,3}),      ({1,2},{1,3}),       ({2,3},{1,3})
    int [] [] partitions = new int [length+1][length+1];
     for (int i = 0; i <  length+1; i++){
     	for(int j =0; j < length+1; j++){
     		if(partitions[i][j])
     	}
	}
}
}
 /* class Pair<L,R> {
    private L l;
    private R r;
    public Pair(L l, R r){
        this.l = l;
        this.r = r;
    }
     public L getL(){ return l; }
     public R getR(){ return r; }
    }*/
