public class Ebook extends Book {
    private String fileFormat;
    public Ebook(String title,String author,int ISBN,boolean availability,String fileFormat){
        super(title,author,ISBN,availability);
        this.fileFormat=fileFormat;
    }
    public String getFileFormat(){return fileFormat;}


}
