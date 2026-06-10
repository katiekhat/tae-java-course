/**@author <Ketevan Khatiashvili>*/
package homework7;

import java.util.Arrays;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age,other.age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person[] people={
                new Person("Keti",25),
                new Person("Nino",44),
                new Person("Lana",33),
                new Person("Levani",99)

        };
        Arrays.sort(people);
        for (Person person:people){
            System.out.println(person.getName()+" (" +person.getAge()+")");
        }
    }
}
