package day40_inheritance;

public class Rules {

}
class A{
    public int getNum(){
        return 5;
    }

    String getName(){ //default access
        return "James";
    }

    public A get(){ //return type is A, the method should return an A object

        return new A(); //A obj = new A();
    }

}
class B extends A{
    @Override //can not change name or parameters
    public int getNum(){
        return 5;
    }

}
class C extends A{
    @Override//we are able to change the access modifier to more accessible if we want. in this example public or protected
    public String getName(){//default access
        return "James";
    }
}
class D extends A {
    @Override
    public D get(){
        return new D();

        //return null;// *** override : can keep the return type the same, or change to COVARIANT: sub class of that return type
    }
}
