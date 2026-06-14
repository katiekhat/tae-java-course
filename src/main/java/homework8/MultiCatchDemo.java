/**@author <Ketevan Khatiashvili>*/
package homework8;

public class MultiCatchDemo {
    public static void processInput(String input){
        try {
            int result= Integer.parseInt(input);
            int[] arr={20,21,23};
            int answer=arr[result]/result;
            System.out.println(answer);
        }catch (NumberFormatException e){
            System.out.println("არასწორი რიცხვი");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ინდექსი არ არსებობს");
        }catch (ArithmeticException e){
            System.out.println("ნულზე გაყოფა");

        }

    }

    public static void main(String[] args) {
        processInput("abc");
        processInput("0");
        processInput("90");
        processInput("2");

    }

}
