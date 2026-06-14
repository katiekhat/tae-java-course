/**@author <Ketevan Khatiashvili>*/
package homework8;

public class NullCheck {
    public static int safeLength(String s){
        try {
            return s.length();
        }catch (NullPointerException e){
            System.out.println("null");
            return 0;

        }

    }

    public static void main(String[] args) {
        System.out.println(safeLength(null));
        System.out.println(safeLength("Hello Keti"));
    }
}
