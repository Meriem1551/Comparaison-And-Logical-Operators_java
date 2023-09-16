package org.math;

public class Main {
    public static void main(String[] args) {
        // 1- COPMARISON OPERATORS:
        int x = 1;
        int y = 1;
        System.out.println(x == y);//return 1 or 0

        /*
         *Comparison Operators:
         *  ==
         *  < , <=
         *  > , >=
         *  !=
         */

        //2- LOGICAL OPERATORS:
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;// the both expressions must be true
        System.out.println(isWarm);

        boolean hasHighIncom = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasGoodCredit || hasHighIncom;// true: if one of them is true
        System.out.println(isEligible);

        boolean hasCriminalRecord =  false;
        isEligible = (hasGoodCredit || hasHighIncom) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}