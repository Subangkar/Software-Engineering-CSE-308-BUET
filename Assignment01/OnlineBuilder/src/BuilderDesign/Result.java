package BuilderDesign;

/**
 * Created by Subangkar on 20-May-18.
 */
public class Result {

	private double per = 0;
	private String grade = "X";
	
	public double getPer() {
		return per;
	}
	
	public void setPer( double per ) {
		this.per = per;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade( String grade ) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return ("Total : "+per+"%\n"+"Grade : "+ grade);
	}
}
