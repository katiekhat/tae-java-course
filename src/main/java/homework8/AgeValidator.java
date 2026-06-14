/**@author <Ketevan Khatiashvili>*/
package homework8;

public class AgeValidator {
    public static void validate(int age) throws InvalidAgeException{
        if (age<0 || age>150){
            throw new InvalidAgeException("არასწორი ასაკი: "+age);
        }
        System.out.println("ასაკი: "+age);
    }

    public static void main(String[] args) {
        try {
            validate(150);
            validate(44);
            validate(-4);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
