package day37_static.homework.Card;

public class DebitCard {
    /*
    Debit card - custom classes + static

    Create a class for Debit Card that has the following instance variables:
        card number (long), holder name (String), card type (String), pin (int), and balance (double)

        static variables: account type (debit)
            -> Use static block to initialize account type

    Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    Add the toString method that will print all of the cards information (Except the pin). If the card type does not have a value do not print that line.
     */
    String cardHolder;
    String cardType;
    long cardNumber;
    int pin;
    double balance;

    static String accountType;

    static{
        accountType = "debit";
    }

    public DebitCard(String cardHolder, String cardType) {
        this.cardHolder = cardHolder;
        this.cardType = cardType;
    }

    public DebitCard(String cardHolder, String cardType, long cardNumber, int pin, double balance) {
        this(cardHolder, cardType);
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
    }
       public boolean validCard() {
           String s = String.valueOf(cardNumber);
           if (s.length() == 16) {
             //  System.out.println("card number is valid");
               return true;

           }else{
               System.out.println("Invalid card number");
               return false;
           }
       }
       public boolean isValidCardType(){
        if( cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("master")){
         //   System.out.println("valid card type");
            return true;
        }else{
            System.out.println("invalid card type");
            return false;
        }
       }
       public boolean isValidPin(){
        String p = String.valueOf(pin);
        if (p.length()==4){
         //   System.out.println("valid pin");
            return true;
        }else{
            System.out.println("Invalid pin, pin must be 4 digits");
            return false;
        }
       }

    @Override
    public String toString() {

        String str = "cardHolder: " + cardHolder;
        if(isValidCardType() ==true){
         str += "\n Card type: " +cardType;
        }
        if(validCard()==true){
            str += "\n Card number: " + cardNumber;
        }
        if(isValidPin()==true){
            str += "\n Balance: "+balance;
        }
        return str;
    }
}
