package company;

class Monkey{
    void jump(){
        System.out.println("jumping monkey");
    }
    void bite(){
        System.out.println("the monkey hurts");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("you can eat!!");
    }

    @Override
    public void sleep() {
        System.out.println("you can sleep..!!");
    }
}
public class animal {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();

        BasicAnimal ba = new Human();
        ba.sleep();
    }

}
