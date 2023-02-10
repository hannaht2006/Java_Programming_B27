package day07_scanner;

public class GiftCard {
    /*
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
        int uses = 3;
        System.out.println("using giftcard. $150 removed ");
        giftCard -=150; // giftCard = giftCard -150;
        uses--;
        System.out.println("using giftcard. $99 removed ");
        giftCard -=99; // giftCard = giftCard -99;
        uses--;
        System.out.println("gift card balance left $ "+giftCard);
        System.out.println("Number of time use gift card "+ uses);

    }
}
