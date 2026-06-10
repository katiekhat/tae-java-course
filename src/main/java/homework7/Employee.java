/**@author <Ketevan Khatiashvili>*/
package homework7;

public abstract class Employee {
    protected String name;
    public Employee(String name){
        this.name=name;
    }
    abstract double calculateSalary();
    public void printInfo(){
        System.out.println("Employee: " + name);
    }

    public static void main(String[] args) {
        Employee[] team={
                new FullTime("Keti",5000),
                new PartTime("Nona",40,50)
        };
        for (Employee e:team){
            e.printInfo();
            System.out.println(e.calculateSalary());

        }
    }
}
