class Count50 implements Chain
{
 
    private Chain nextInChain;
 
    public void setNext(Chain c)
    {
        nextInChain = c;
    }
 
    public void process(int cash)
    {
        int cnt = cash / 50;
        cash %= 50;
    
        if (cnt != 0) {
            System.out.println( "50 Notes : " + cnt );
        }
        if (cash != 0) nextInChain.process( cash );
    }
}