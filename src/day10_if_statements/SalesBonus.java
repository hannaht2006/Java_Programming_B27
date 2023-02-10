package day10_if_statements;

public interface SalesBonus {
    /*
    create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
     */

    public static void main(String[] args) {

      int sale  = 12000;
      int bonus = 0;

      if(sale>= 10000 && sale < 15000){
          bonus =5000;
          System.out.println("sale: "+sale+"\nyou get a bonus of "+bonus);
      }
      else if (sale>=15000){
          bonus =7000;
          System.out.println("sale: "+sale+"\nyou get a bonus of "+bonus);
      }
      else {
          System.out.println("sale: "+sale+"\nyou don't get any bonus");
      }

    }
}
