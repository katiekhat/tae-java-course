/** @author <Ketevan Khatiashvili> */
package homework4;

public class GradeCalculator {
    public static void main(String[] args) {
        int month = 4;
        if (month == 12) {
            System.out.println("თვე:" + month + " -> შეფასება: A");
        } else if (month >= 9 && month <= 11) {
            System.out.println("თვე:" + month + " -> შეფასება: B");
        } else if (month >= 6 && month <= 8) {
            System.out.println("თვე:" + month + " -> შეფასება: C");
        } else if (month >= 3 && month <= 5) {
            System.out.println("თვე:" + month + " -> შეფასება: D");
        } else if (month >= 1 && month <= 2) {
            System.out.println("თვე:" + month + " -> შეფასება: F");
        } else {
            System.out.println("შეიყვანე რიცხვები 1-12 ჩათვლით");
        }
    }
}