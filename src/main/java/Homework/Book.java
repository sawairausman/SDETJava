package Homework;
//Create a base class Book with attributes like title, author, and ISBN.
//        Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link, and in PrintBook, add a property for number_of_copies.
//        Implement a method in each subclass that displays book details.
//        Instantiate objects from these classes and demonstrate the display functionality.
//OVERIDING

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void display(){
        System.out.println(title+" written by "+ author+", ISBN is "+ISBN+ " ");

    }
}

class EBook extends Book{
    private String downloadLink;

    public EBook(String title, String author, String ISBN, String downloadLink ) {
        super(title, author, ISBN);
        this.downloadLink = downloadLink;
    }

    @Override
    public void display(){
        System.out.println();
       super.display();
        System.out.println("DownloadLink is "+downloadLink);
        System.out.println();
    }
}

class PrintBook extends Book{
    private int noOfCopies;
    public PrintBook(String title, String author, String ISBN, int noOfCopies ) {
        super(title, author, ISBN);
        this.noOfCopies= noOfCopies;
    }

    @Override
    public void display(){
        super.display();
        System.out.print("No of Copies available for PrintBook is "+ noOfCopies);
        System.out.println();

    }

}

class BookTester{
    public static void main(String[] args) {
        new Book("Animal Stories", "Maria Hoey","975-1-60309-502-0").display();
        new EBook("The Delicacy", "James Henson","963-1-562125-452-1","www.download.com/TheDelicay").display();
        new PrintBook("Cosmic Cadet", "Mimi Alves","637-1-365112-552-2",100).display();
    }
}
