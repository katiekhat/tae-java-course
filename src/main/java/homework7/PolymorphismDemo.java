/**@author <Ketevan Khatiashvili>*/
package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal [] animals={
                new Dog("Mimi"),
                new Dog("Mura"),
                new Cat("Luna"),
                new Cat("Sansa")
        };

        for(Animal animal:animals){
            if(animal instanceof Dog){
                System.out.print(((Dog) animal).name + "(Dog): ");
            } else if (animal instanceof Cat) {
                System.out.print(((Cat) animal).name + "(Cat): ");

            }
            animal.makeSound();
            animal.sleep();
        }
    }
}
