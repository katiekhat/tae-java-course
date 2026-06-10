/**@author <Ketevan Khatiashvili>*/
package homework7;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title){
        this(title,"Unknown",0);
    }
    public Book(String title,String author){
        this(title,author,0);
    }
    public Book(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public void print(){
        System.out.println(title+" by "+author+" ("+year+")");
    }

    public static void main(String[] args) {
        Book book1=new Book("Java");
        book1.print();

        Book book2=new Book("Java","Bloch");
        book2.print();

        Book book3=new Book("Java","Bloch",2020);
        book3.print();


    }
}
