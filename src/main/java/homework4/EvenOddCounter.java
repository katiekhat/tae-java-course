/** @author <Ketevan Khatiashvili> */
package homework4;

public class EvenOddCounter {

    public static void main(String[] args) {

        int birthYear = 10;
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("ლუწი: ");
        for (int i = 1; i <= birthYear; i++) {
            if (i % 2 == 0) {
                evenCount++;
                System.out.print(i + " ");
            }
        }
        System.out.print("კენტი: ");
        for (int i = 1; i <= birthYear; i++) {
            if (i % 2 != 0) {
                oddCount++;
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("ლუწების რაოდენობა: " + evenCount);
        System.out.println("კენტების რაოდენობა: " + oddCount);

    }

}




