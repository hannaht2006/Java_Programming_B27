package day43_abstraction.homework.webelement;

public class Button implements WebElement, Clickable{
    @Override
    public void click() {
        System.out.println("Click the button");
    }

    @Override
    public void getText() {
        System.out.println("get the text");

    }
}
