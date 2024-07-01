import java.util.ArrayList;

class book{
    public String name, author;

    public book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString(){
        return "Book{"+"name = '"+name+'\''+", author = '" +author+'\'' + '}';
        
    }
}

class MyLibrary{
    ArrayList<book> books;
    public MyLibrary(ArrayList<book> books){
        this.books = books;
    }

    public void addBook(book b){
        System.out.println("The Book has been added to Library management system");
        this.books.add(b);
    }
    
    public void issueBook(book i, String issued_to){
        System.out.println("The Book has been issued from Library to " + issued_to);
        this.books.remove(i);
    }

    public void returnBook(book r){
        System.out.println("The Book has been returned");
        this.books.add(r);
    }
}


public class ex7_lib_management_sys {
    public static void main(String[] args) {
        ArrayList<book> bk = new ArrayList<>();
        book b1 = new book("Algorithms1", "RSA1");
        bk.add(b1);
        book b2 = new book("Algorithms2", "RSA2");
        bk.add(b2);
        book b3 = new book("Algorithms3", "RSA3");
        bk.add(b3);
        book b4 = new book("Algorithms4", "RSA4");
        bk.add(b4);

        MyLibrary ml = new MyLibrary(bk);
        ml.addBook(new book("DSA", "CHC"));
        System.out.println(ml.books);

        
    }
}
