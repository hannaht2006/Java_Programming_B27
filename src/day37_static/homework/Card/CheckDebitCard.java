package day37_static.homework.Card;

public class CheckDebitCard {
    public static void main(String[] args) {
        DebitCard cardOne = new DebitCard("Hannah Ton", "visa",12121212121215L, 12234,1500.0 );
        System.out.println(DebitCard.accountType);
        System.out.println(cardOne);
    }
}
