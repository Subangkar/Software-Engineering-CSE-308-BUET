package BuilderDesign;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true)
        {
            ResultMan resultMan = new ResultMan();
//            Scanner sc = new Scanner( System.in );
            String type = "UG";//;sc.next();
//            sc.close();
            Result rs = resultMan.Construct( type );
            System.out.println(rs);
        }
    }
}
