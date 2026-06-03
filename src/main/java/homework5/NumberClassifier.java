/**@author <Ketevan Khatiashvili>   */
package homework5;

public class NumberClassifier {

    public static String classify(int n){
        if(n>0){
            return "Positive";
                    
        } else if (n<0) {
            return "Negative";
            
        }else{
            return "Zero";
        }
    }
    public static String classify(double n){
        String result;
        if(n>0){
            result="Positive";
        } else if (n<0) {
            result="Negative";
        }else {
            result="Zero";
        }
        if(n%1==0){
            return result + " Whole Double";

        }else {
            return result + " Decimal";
        }

    }



    public static void main(String[] args){
        System.out.println(classify(-6));
        System.out.println(classify(200));
        System.out.println(classify(3.14));
        System.out.println(classify(0));
        System.out.println(classify(8.0));
        System.out.println(classify(-8.0));



    }
}
