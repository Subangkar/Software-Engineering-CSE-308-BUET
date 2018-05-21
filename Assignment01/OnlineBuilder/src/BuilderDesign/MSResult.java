package BuilderDesign;

/**
 * Created by Subangkar on 20-May-18.
 */
public class MSResult implements ResultBuilder {
	
	private Result result;
	private int pres = 0;
	private int assign = 0;
	private int termFinal = 0;
	
	public MSResult(  ) {
		this.result = new Result();
	}
	
	@Override
	public void addExamMarks( String examName , int marks ) {
		if (examName.equals( "A" )) {
			assign = marks;
		} else if (examName.equals( "T" )) {
			termFinal = marks;
		} else if (examName.equals( "P" )) {
			pres = marks;
		}
	}
	
	@Override
	public void calculateRes() {
		double total = 0;
		total = assign * 0.3 + pres * 0.15 + termFinal * 0.55;
		
		result.setPer( total );
		
		String grd="X";
		if(total>=80) grd = "A+";
		else if(total>=70) grd = "A";
		else if(total>=60) grd = "B";
		else if(total>=50) grd = "C";
		else grd = "F";
	}
	
	@Override
	public Result getRes() {
		return null;
	}
}
