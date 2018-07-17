package BuilderDesign;

import java.util.Scanner;

/**
 * Created by Subangkar on 20-May-18.
 */
public class ResultMan {
	
	Result Construct(String type){
		ResultBuilder rb = null;
		Scanner sc = new Scanner( System.in );
		String exm="X";
		int marks;
		
		if(type.equals( "UG" )){
			rb=new UGResult();
			System.out.println("UG");
			
		}
		else if(type.equals( "Masters" )){
			rb=new MSResult();
			System.out.println("MS");
			
		}
		
		while (!exm.equals( "T" )) {
			exm = sc.next();
			marks = sc.nextInt();
			rb.addExamMarks( exm,marks );
			rb.calculateRes();
			System.out.println(exm);
		}
		
		return rb.getRes();
	}
	
}
