/**@author <Ketevan Khatiashvili>   */
package homework5;

public class Fibonacci {
    public static long fib(int n){
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    long a=0;
    long b=1;
    for (int i=2;i<=n;i++){
        long sum=a+b;
        a=b;
        b=sum;
    }
    return b;
    }

    public static void main(String[] args){
        System.out.println(fib(3));
        System.out.println(fib(20));
        System.out.println(fib(25));

    }
}
