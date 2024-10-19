public class PrintedBook extends Book {
    private int numPages;
    public PrintedBook(String title,String author,int ISBN,boolean availability,int numPages ){
        super(title,author,ISBN,availability);
        this.numPages=numPages;
    }
    public int getNumPages(){return numPages;}
}
