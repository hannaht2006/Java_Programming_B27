package day43_abstraction.homework.webelement;

public class Link implements Clickable, WebElement{
    @Override
    public void click() {
        System.out.println("Click the link");
    }

    @Override
    public void getText() {
        System.out.println("Get the information");

    }
}
