/**@author <Ketevan Khatiashvili>*/
package homework7;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Shape s2=new Circle(3);
        System.out.println(s2.area());
    }
}
