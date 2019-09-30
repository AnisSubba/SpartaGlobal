package _package1;

public class InstanceOfDemo {

    public static void main(String[] args){

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 is an instance of Parent : " + (obj1 instanceof Parent));
        System.out.println("obj1 is an instance of Child : " + (obj1 instanceof Child));
        System.out.println("obj1 is an instance of MyInterface : " + (obj1 instanceof MyInterface));

        System.out.println("obj2 is an instance of Parent : " + (obj2 instanceof Parent));
        System.out.println("obj2 is an instance of Child : " + (obj2 instanceof Child));
        System.out.println("obj2 is an instance of MyInterface : " + (obj2 instanceof MyInterface));
    }
}

class Parent{} // class is a blueprint to create objects
class Child extends Parent implements MyInterface {} //extends will inheritance child to parent
interface MyInterface {} // interface is a contract