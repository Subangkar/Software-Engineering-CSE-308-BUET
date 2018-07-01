import java.util.Scanner;

class ATMUser
{
    static Chain getAtmMoney(){
        Chain c0 = new CheckWithdrawable();
        Chain c1 = new Count500();
        Chain c2 = new Count50();
        Chain c3 = new Count10();
        c0.setNext(c1);
        c1.setNext(c2);
        c2.setNext(c3);
        return c0;
    }
    
    
    public static void main(String[] args) {
    
    
        Scanner scanner = new Scanner( System.in );
        int cash;
        do {
            System.out.print("Enter an amount(>0): ");
            cash = scanner.nextInt();
            getAtmMoney().process(cash);
        }while (cash>0);
    }
}