package _package1;

public class InstanceOfDemo {

    public static void main(String[] args){

        Parent obj1 = new Parent();
        Parent obj2 = new Child();
    }
}

class Parent{} // class is a blueprint to create objects
class Child extends Parent implements MyInterface {} //extends will inheritance child to parent
interface MyInterface {} // interface is a contract