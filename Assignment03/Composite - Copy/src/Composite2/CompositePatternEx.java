package Composite2;

import java.util.List;

class CompositePatternEx
{
	public static void main(String[] args)
	{
		Composite Principal = new Composite("Dr.S.Som","Principal");
		Composite hodMaths = new Composite("Mrs.S.Das","Hod-Math");
		Composite hodCompSc = new Composite("Mr. V.Sarcar","Hod-ComputerSc.");
		Composite mathComposite1 = new Composite("Math Composite-1","MathsTeacher");
		Composite mathComposite2 = new Composite("Math Composite-2","MathsTeacher");
		Composite cseComposite1 = new Composite("CSE Composite-1","CSETeacher");
		Composite cseComposite2 = new Composite("CSE Composite-2","CSETeacher");
		Composite cseComposite3 = new Composite("CSE Composite-3","CSETeacher");
//Principal is on top of college
		/*HOD -Maths and Comp. Sc. directly reports to him*/
		Principal.Add(hodMaths);
		Principal.Add(hodCompSc);
		/*Teachers of Mathematics directly reports to HOD-Maths*/
		hodMaths.Add( mathComposite1 );
		hodMaths.Add( mathComposite2 );
		/*Teachers of Computer Sc. directly reports to HOD-Comp.Sc.*/
		hodCompSc.Add( cseComposite1 );
		hodCompSc.Add( cseComposite2 );
		hodCompSc.Add( cseComposite3 );
		/*Leaf nodes. There is no department under Mathematics*/
		mathComposite1.Add(null);
		mathComposite2.Add(null);
		/*Leaf nodes. There is no department under CSE.*/
		cseComposite1.Add(null);
		cseComposite2.Add(null);
		cseComposite3.Add(null);
//Printing the details
		System.out.println("***COMPOSITE PATTERN DEMO ***");
		System.out.println("\nThe college has following structure\n");
		System.out.println(Principal.getDetails());
		List<iComposite> hods=Principal.getControllingDepts();
		for(int i=0;i<hods.size();i++)
		{
			System.out.println("\t"+hods.get(i).getDetails());
		}
		List<iComposite> mathTeachers=hodMaths.getControllingDepts();
		for(int i=0;i<mathTeachers.size();i++)
		{
			System.out.println("\t\t"+mathTeachers.get(i).getDetails());
		}
		List<iComposite> cseTeachers=hodCompSc.getControllingDepts();
		for(int i=0;i<cseTeachers.size();i++)
		{
			System.out.println("\t\t"+cseTeachers.get(i).getDetails());
		}
//One computer teacher is leaving
		hodCompSc.Remove( cseComposite2 );
		System.out.println("\n After CSE Composite-2 leaving the organization- CSE department has following employees:");
		cseTeachers = hodCompSc.getControllingDepts();
		for(int i=0;i<cseTeachers.size();i++)
		{
			System.out.println("\t\t"+cseTeachers.get(i).getDetails());
		}
	}
}