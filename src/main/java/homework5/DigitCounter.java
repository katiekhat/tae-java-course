/**@author <Ketevan Khatiashvili>   */
package homework5;

public class DigitCounter {
    public static int digitCounter(int n){
        n=Math.abs(n);
        int count =0;

        if (n == 0){
            return 1;
        }
        while ( n > 0){
            count++;
            n /=10;
        }
        return count;

    }
    public static void main(String[] args){
        System.out.println(digitCounter(2001));
        System.out.println(digitCounter(9));
        System.out.println(digitCounter(20019));
        System.out.println(digitCounter(-40));

    }
}
