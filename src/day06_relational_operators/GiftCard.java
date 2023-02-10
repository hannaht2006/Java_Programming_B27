package day06_relational_operators;

public class GiftCard {
    /*
    create a class GiftCard

    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end
     */
    public static void main(String[] args) {
        double giftCard = 500;
        int timeUse = 3;
        giftCard -= 150;
        timeUse -= 1;
        System.out.println("Gift Card remain : $ "+ giftCard);
        giftCard -= 99;

        System.out.println("Gift Card remain : $ " +giftCard);
        timeUse -= 1;

        System.out.println("Gift Card remain : $ " +giftCard);
        System.out.println("Time use gift card remain : " +timeUse);

    }
}
