/**
 * Created by Subangkar on 01-Jul-18.
 */
public class CheckWithdrawable implements Chain {
	
	private Chain nextInChain;
	
	@Override
	public void setNext( Chain nextInChain ) {
		this.nextInChain = nextInChain;
	}
	
	@Override
	public void process( int cash ) {
		if(cash<=0){
			System.out.println("Invalid amount :)");
		}
		else if ((cash % 10) != 0)
		{
			System.out.println("Sorry Can't Process. Cash is Not a multiple of 10 :(");
		}
		else
		{
			nextInChain.process(cash);
		}
	}
}
