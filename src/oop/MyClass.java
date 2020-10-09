package oop;
enum MyEnum{
    ONCE;
    MyEnum(){
        System.out.println("constructing");
    }
}
public class MyClass {
    public static void main(String[] args) {
        MyEnum e1 = MyEnum.ONCE;
        MyEnum e2 = MyEnum.ONCE;

        System.out.println(e1 + " " + e2);
    }
}