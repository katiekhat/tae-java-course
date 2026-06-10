/**@author <Ketevan Khatiashvili>*/
package homework6;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name,int[] grades){
            this.name=name;
            this.grades=grades;
    }
    public double averageGrade(){
        if (grades.length ==0){
            return 0;
        }
        int sum=0;
        for (int grade:grades){
            sum+=grade;
        }
        return (double) sum/grades.length;
    }

    public String getStatus(){
        double avg = averageGrade();
        if(avg>=60){
            return "Pass";
            
        } else {
            return "Fail";
        }
            

    }

    public static void main(String[] args) {
        int[] grades={91,40,50,20};
        Student student1=new Student("Mariam",grades);

        System.out.println(student1.averageGrade());
        System.out.println(student1.getStatus());
    }

}
