/** @author <Ketevan Khatiashvili> */
package homework4;

public class Calculator {
    public static void main(String[] args){
        double number1 = 20;
        double number2 = 25;
        char op = '$';

        switch (op){
            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                if(number2 !=0){
                    System.out.println(number1/number2);
                } else {
                    System.out.println("ნულზე გაყოფა აკრძალულია");
                }
                break;
            default:
                System.out.println("უცნობი ოპერატორი");

        }

    }
}