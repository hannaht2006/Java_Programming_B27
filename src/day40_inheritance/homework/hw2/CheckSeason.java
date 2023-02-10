package day40_inheritance.homework.hw2;

public class CheckSeason {
    public static void main(String[] args) {
        Winter  winter = new Winter (50.2, 5.7
        );
        System.out.println(winter);
        winter.activity();

        Summer summer = new Summer(100.5,77.6);
        summer.activity();
        System.out.println(summer);

        Fall fall = new Fall (88.4, 44.3);
        System.out.println(fall);
        fall.activity();
    }
}
