/**@author <Ketevan Khatiashvili>*/
package homework6;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age){
        this.age=age;
        this.email=email;
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }
    public void introduce(){
        System.out.println("გამარჯობა მე ვარ " + name + "," + age + " წლის.");
    }


    public static void main(String[] args) {
        Person person1= new Person("ქეთი", "Kkhatiasvhili@credo.ge",25);
        Person person2= new Person("ნინო", "nshiuka@credo.ge",55);

        person1.introduce();
        person2.introduce();

    }
}
