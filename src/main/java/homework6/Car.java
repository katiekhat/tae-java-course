/**@author <Ketevan Khatiashvili>*/
package homework6;

public class Car extends Vehicle{
    int doors;

    public Car(String brand, int year,int doors) {
        super(brand, year);
        this.doors=doors;
    }
    @Override
    public void info(){
        System.out.println( brand + "," +year+ "," +doors+ " doors.");

    }

    public static void main(String[] args) {
        Car car1=new Car("Toyota",2021,4);
        car1.info();

    }
}
