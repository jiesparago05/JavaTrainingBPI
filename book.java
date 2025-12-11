package module2Package1;

public class book {
    String title;
    String author;
    int year;
    
    public book(String title, String author, int year) {
    	this.title = title;
    	this.author = author;
    	this.year = year;
    }
    
    public void displayInfo() {
    	System.out.println(title + " - " + author + " - " + year);
    }
}
