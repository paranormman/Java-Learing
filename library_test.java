// package vestachrono;

class library{
        String[] book;
        int no_of_books;
        library(){
            this.book = new String[100];
            this.no_of_books = 0;
        }

        void addBook(String book){
            this.book[no_of_books] = book;
            no_of_books++;
            System.out.println(book + " has been added!");
        }

        void showAvailableBook(){
            System.out.println("The available books are");
            for (String book : this.book) {
                if(book == null){
                    continue;
                }
                System.out.println("* " + book);
            }
        }

        void issueBook(String book){

            for (int i = 0; i < this.book.length; i++){
                if(this.book[i].equals(book)){
                System.out.println("The books has been issued");
                this.book[i] = null;
                return;
                }
            }   
            System.out.println("This book does not exists");
        }

        void returnBook(String book){
            addBook(book);
        }
        

}

public class library_test {
    public static void main(String[] args) {
        
        library centralLibrary = new library();
        centralLibrary.addBook("Rich Dad Poor Dad");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");

        centralLibrary.showAvailableBook();
        centralLibrary.issueBook("Algorithms");
        centralLibrary.showAvailableBook();
        centralLibrary.addBook("Algorithms");
        centralLibrary.showAvailableBook();
    }
}
