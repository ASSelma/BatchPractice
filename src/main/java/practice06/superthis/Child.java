package practice06.superthis;

public class Child  extends Parent{


    public Child (){

        super(); //her zaman parent clasa ait super vardr ve görünmez
        System.out.println("Child class paremetresiz constructor");
    }

    public Child (int a){
        System.out.println("Child class tek parametreli constructor");
    }

    public Child (int a, int b){
        super(2,5);
        System.out.println("Child class iki parametreli constructor");
    }

    public static void main(String[] args) {

      //  Child obj1 = new Child();
       // Child obj2 = new Child(1);
        Child obj3 = new Child(1,2);

    }

}
