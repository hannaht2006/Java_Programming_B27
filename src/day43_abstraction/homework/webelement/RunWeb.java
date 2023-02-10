package day43_abstraction.homework.webelement;

public class RunWeb {
    public static void main(String[] args) {
        Button a = new Button();
        a.click();
        a.getText();
        Link b = new Link();
        b.click();
        b.getText();
        InputField c = new InputField();
        c.click();
        c.sendKeys();
        c.getText();

    }
}
