/**@author <Ketevan Khatiashvili>*/
package homework6;

public class Counter {
     int count;
     int maxValue;
     public Counter(){
         count=0;
         maxValue=20;
     }

    public void increment(){
        if(count<maxValue){
            count++;
        }
    }
    public void reset(){
        count=0;
    }
    public void countTo(int target){
        for(int i=0; i<target;i++){
            increment();
        }
    }

    public static void main(String[] args) {
        Counter c =new Counter();
        c.countTo(21);
        System.out.println(c.count);
        c.reset();
        System.out.println(c.count);

    }
}

