package day06_relational_operators;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 21;
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        boolean over18 = age >=18;
        boolean isEligible = isCitizen && ! hasCriminalBackground && over18;
        /*
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        boolean over18 = age >=18;

          isCitizen && ! hasCriminalBackground && over18;
          true       &&      not false         &&   true
          true       &&        true            &&   true
        ----> true

        --------------------------------
        boolean isCitizen = true;
        boolean hasCriminalBackground = true;
        boolean over18 = age >=18;

          isCitizen && ! hasCriminalBackground && over18;
          true       &&      not true         &&   true
          true       &&        false          &&   true
        ----> false

         */
        System.out.println("Is Eligible to vote = " +isEligible);
    }
}
