package BuilderDesign;

/**
 * Created by Subangkar on 20-May-18.
 */
public interface ResultBuilder {
//	void addClassTest(String name,int marks);
//	void addAttendence(int marks);
//	void addTermFinal(int marks);
//	void addAssign(int marks);
//	void addPresent(int marks);
	
	void addExamMarks(String examName,int marks);
	
	void calculateRes();
	
	Result getRes();
}
