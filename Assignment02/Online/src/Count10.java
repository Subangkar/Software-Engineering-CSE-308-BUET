class Count10 implements Chain
{
    
    private Chain nextInChain;
 
    public void setNext(Chain c)
    {
        nextInChain = c;
    }
    
    public void process(int cash)
    {
        int cnt = cash / 10;
        cash %= 10;
        
        if (cnt != 0) {
            System.out.println( "10 Notes : " + cnt );
        }
    }
}