package BuilderDesign;

import java.util.HashSet;

/**
 * Created by Subangkar on 20-May-18.
 */
public class UGResult implements ResultBuilder {
	
	private Result result;
	private int[] ctmarks = new int[3];
	private int attndnc = 0;
	private int termFinal = 0;
	
	
	public UGResult() {
		result = new Result();
		ctmarks[0] = ctmarks[1] = ctmarks[2] = 0;
	}
	
	private void updateCtMarks( int mark ) {
		if (mark > ctmarks[0]) {
			ctmarks[2] = ctmarks[1];
			ctmarks[1] = ctmarks[0];
			ctmarks[0] = mark;
		} else if (mark > ctmarks[1]) {
			ctmarks[2] = ctmarks[1];
			ctmarks[1] = mark;
		} else if (mark > ctmarks[2]) {
			ctmarks[2] = mark;
		}
	}
	
	@Override
	public void addExamMarks( String examName , int marks ) {
		if (examName.equals( "A" )) {
			attndnc = marks;
		} else if (examName.equals( "T" )) {
			termFinal = marks;
		} else {
			updateCtMarks( marks );
		}
	}
	
	@Override
	public void calculateRes() {
		double total = 0;
		total = (ctmarks[0] + ctmarks[1] + ctmarks[2]) * 0.2 + attndnc * 0.1 + termFinal * 0.7;
		
		result.setPer( total );
		
		String grd = "X";
		if (total >= 80) grd = "A+";
		else if (total >= 70) grd = "A";
		else if (total >= 60) grd = "B";
		else if (total >= 50) grd = "C";
		else grd = "F";
		
	}
	
	@Override
	public Result getRes() {
		return result;
	}
}
