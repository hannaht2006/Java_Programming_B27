package day43_abstraction.homework.webelement;

public interface WebElement {
    public abstract void getText();
}
/*
create an interface WebElement
    abstract methods:
        getText()

create an interface Clickable
    abstract methods:
        click()

create an interface Input
    abstract methods:
        sendKeys()

create a class Button
    implement the WebElement & Clickable interface
    override all abstract methods

create a class Link
    implement the WebElement & Clickable interface
    override all abstract methods

create a class InputField
    implement the Webelement & Clickable & Input interfaces
    override all abstract methods
 */
