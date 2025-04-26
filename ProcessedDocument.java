public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println();

        Document pdf1 = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdf1.open();
        System.out.println("Type: " + pdf1.getType());

        System.out.println();

        Document text1 = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        text1.open();
        System.out.println("Type: " + text1.getType());

        System.out.println();

        Document sheet1 = registry.createSpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        sheet1.open();
        System.out.println("Type: " + sheet1.getType());

        System.out.println();

        Document pdf2 = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}
