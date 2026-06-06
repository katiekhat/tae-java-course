/** @author <Ketevan Khatiashvili> */
package homework4;

public class PrimeCheck {
    public static void main(String[] args) {
        int number = 25;
        boolean isPrime = true;
        System.out.print(number + " -> ");
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("მარტივი რიცხვია");
        } else {
            System.out.print("არ არის მარტივი, იყოფა ");
            boolean first = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    first = false;
                }
            }
            System.out.println("-ზე");
        }
    }
}
