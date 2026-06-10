/**@author <Ketevan Khatiashvili>*/
package homework7;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Cat c=new Cat("Neo");
        c.makeSound();
        c.sleep();
    }
}
