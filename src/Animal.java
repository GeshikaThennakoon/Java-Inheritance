public class Animal {

    String name;

    public void eat(){
        System.out.println("I can eat!");
    }
}

class Human extends Animal{
    public void show(){
        System.out.println("My name is " + name);
    }
}

class Test{
    public static void main(String[] args) {
         Human Kalana = new Human();
         Kalana.name = "Kalana";
         Kalana.show();
         Kalana.eat();
    }
}
