package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Study01 {
	   public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      
		      int num = sc.nextInt();
		      
		      String[] strAr = new String[num];
		      ArrayList<String> splitAr= new ArrayList<String>();
		   
		      for(int i=0; i<strAr.length;i++) {
		         splitAr.add(sc.next());
		      }
		   
		      for(int z=0; z<splitAr.size();z++) {
		         int score=0;
		         int a =0;
		         for(int i=0; i<splitAr.get(z).split("").length;i++) {
		            if(splitAr.get(z).split("")[i].equals("O")){
		               score=score+(++a);
		               System.out.println("(O)여기 점수는:"+score+" "+"a는:"+a);
		            }else{
		            	a=0;

		               System.out.println("(X)여기 점수는:"+score+" "+"a는:"+a);
		            }
		            
		         }
		         
		         System.out.println(score);
		      }
		   
		      
		      
		      
		   }

}
