
package littlebookhaven;

public class Book {

    private int bookID;
    private String title;
    private String author;
    private int year;
    private String isbn; 
    private String publisher;
    private int categoryID; 
    private double price;
    private int stockQuantity;
    
    public Book() {}

    public Book(int bookID, String title, String author, int year, String isbn, String publisher, int categoryID, double price, int stockQuantity) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.categoryID = categoryID;
        this.price = price;
    }

    public Book(String title, String author, int year, String isbn, String publisher, int categoryID, double price, int stockQuantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.categoryID = categoryID;
        this.price = price;
    }

    public int getBookID() { return bookID; }
    public void setBookID(int bookID) { this.bookID = bookID; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public int getCategoryID() { return categoryID; }
    public void setCategoryID(int categoryID) { this.categoryID = categoryID; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public int getStockQuantity() { return stockQuantity; }
    public void setstockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
    
    @Override
    public String toString() {
        return "Book{" +
               "bookID=" + bookID +
               ", title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", year=" + year +
               ", isbn=" + isbn +
               ", publisher='" + publisher + '\'' +
               ", categoryID=" + categoryID +
               ", price=" + price +
               ", stockQuantity=" + stockQuantity +
               '}';
    }
}