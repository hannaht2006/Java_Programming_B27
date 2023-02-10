package day43_abstraction.homework.webelement;

public class InputField implements WebElement, Clickable, Input{
    @Override
    public void click() {
        System.out.println("Click at the field");
    }

    @Override
    public void sendKeys() {
        System.out.println("Send the keys");

    }

    @Override
    public void getText() {
        System.out.println("Receive the info");

    }
}
