class Count500 implements Chain {
	
	private Chain nextInChain;
	
	public void setNext( Chain c ) {
		nextInChain = c;
	}
	
	public void process( int cash ) {
		
		int cnt = cash / 500;
		cash %= 500;
		
		if (cnt != 0) {
			System.out.println( "500 Notes : " + cnt );
		}
		if (cash != 0) nextInChain.process( cash );
	}
}