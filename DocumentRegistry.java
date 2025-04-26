public class DocumentRegistry {
    private final PdfDocument pdfPrototype;
    private final TextDocument textDocumentPrototype;
    private final SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }

    public Document createPdfDocument(String fileName, String author, int pageCount) {
        PdfDocument pdf = (PdfDocument) pdfPrototype.clone();
        pdf.fileName = fileName;
        pdf.author = author;
        pdf.pageCount = pageCount;
        return pdf;
    }

    public Document createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument text = (TextDocument) textDocumentPrototype.clone();
        text.filePath = filePath;
        text.encoding = encoding;
        text.wordCount = wordCount;
        return text;
    }

    public Document createSpreadsheetDocument(String name, int rows, int columns) {
        SpreadsheetDocument sheet = (SpreadsheetDocument) spreadsheetPrototype.clone();
        sheet.spreadsheetName = name;
        sheet.rowCount = rows;
        sheet.columnCount = columns;
        return sheet;
    }
}
