/**@author <Ketevan Khatiashvili>   */
package homework5;

public class PasswordChecker {

public static boolean isStrong(String password){
    boolean hasDigit=false;
    boolean isUppercase=false;
    if(password.length() < 8){
        return false;
    }

    for (int i=0;i<password.length();i++){
        char ch=password.charAt(i);
        if(Character.isDigit(ch)){
            hasDigit=true;
        }
        if (Character.isUpperCase(ch)){
            isUppercase=true;
        }
    }
    return  hasDigit&&isUppercase;

}


    public static void main(String[] args){
    System.out.println("Strong: " + isStrong("Hello123"));
    System.out.println("Strong: " + isStrong("Hello"));
    System.out.println("Strong: " + isStrong("HELLO123"));

    }

    }
