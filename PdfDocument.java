public class PdfDocument implements Document {
    String fileName;
    String author;
    int pageCount;
    String name;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    @Override
    public Document clone() {
        try {
            return (PdfDocument) super.clone(); 
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() {
        return "PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
    }
}
