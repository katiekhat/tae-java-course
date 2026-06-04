/**@author <Ketevan Khatiashvili>*/
package homework6;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
        @Override
        public double area(){
            return radius*radius*Math.PI;
        }

    public static void main(String[] args) {
        Circle circle=new Circle(3);
        System.out.println(circle.area());
    }
}
