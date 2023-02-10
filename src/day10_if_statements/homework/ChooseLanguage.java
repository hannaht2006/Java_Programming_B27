package day10_if_statements.homework;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose a number from 1-5 to select your language\n\t1) English\n\t2) Spanish\n\t3) Turkish\n\t4) Russian\n\t5) French");
        Scanner input = new Scanner (System.in);
        int option = input.nextInt();
        if(option==1){
            System.out.println("hello, thank for your call");
        }
        else if (option==2){
            System.out.println("hola, gracias para llamar") ;
        }
        else if (option==3){
            System.out.println("merhaba, aradiginiz icin tesekkurler") ;
        }
        else if (option==4){
            System.out.println("privet, spasibo za vash zvonok") ;
        }
        else if (option==5){
            System.out.println("Merci ,pour votre appel") ;
        }
        else {
            System.out.println("We will use English by default");
        }
    }
}
