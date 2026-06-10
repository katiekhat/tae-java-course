/**@author <Ketevan Khatiashvili>*/
package homework7;

public class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand+" pedaling...");
    }

    public static void main(String[] args) {
        Bike bike=new Bike("Trek");
        bike.start();
        bike.stop();
    }
}
