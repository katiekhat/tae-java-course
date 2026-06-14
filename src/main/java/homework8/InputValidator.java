/**@author <Ketevan Khatiashvili>*/
package homework8;

public class InputValidator {
    public static int processAge(String input) throws NumberFormatException,IllegalArgumentException{
        int age=Integer.parseInt(input);
        if (age<0){
            throw new IllegalArgumentException("არასწორი ასაკი: "+age);
        }
        return age*12;

    }

    public static void main(String[] args) {
        try {
            System.out.println(processAge("12"));
            System.out.println(processAge("-12"));
            System.out.println(processAge("bbab"));

        }catch (NumberFormatException e){
            System.out.println("არასწორი რიცხვი");
        }catch (IllegalArgumentException e){
            System.out.println("უარყოფითი რიცხვი");

        }
    }
}
