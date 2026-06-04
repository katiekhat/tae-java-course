/**@author <Ketevan Khatiashvili>*/
package homework6;

public class Calculator {

    public double calculate(double a,double b, char op){
        switch (op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b==0) {
                    return Double.NaN;
                }
                return a/b;

            default:
                System.out.println("არასწორი ოპერატორი");
                return Double.NaN;
        }


    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        double result= calculator.calculate(10,0,'/');
        System.out.println(result);

    }
}
