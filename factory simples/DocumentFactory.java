// Abstract Product
abstract class Document {
    protected String name;
    
    public Document(String name) {
        this.name = name;
    }
    
    public abstract void open();
    public abstract void close();
}

// Concrete Products
class PDFDocument extends Document {
    public PDFDocument(String name) {
        super(name);
    }
    
    @Override
    public void open() {
        System.out.println("Opening PDF document: " + name);
    }
    
    @Override
    public void close() {
        System.out.println("Closing PDF document: " + name);
    }
}

class WordDocument extends Document {
    public WordDocument(String name) {
        super(name);
    }
    
    @Override
    public void open() {
        System.out.println("Opening Word document: " + name);
    }
    
    @Override
    public void close() {
        System.out.println("Closing Word document: " + name);
    }
}

// Creator (Factory)
abstract class DocumentFactory {
    // Factory Method
    public abstract Document createDocument(String name);
    
    // Template method
    public void processDocument(String name) {
        Document doc = createDocument(name);
        doc.open();
        doc.close();
    }
}

// Concrete Creators
class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String name) {
        return new PDFDocument(name);
    }
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String name) {
        return new WordDocument(name);
    }
}

// Main class to demonstrate the pattern
public class DocumentFactoryDemo {
    public static void main(String[] args) {
        // Create factories
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        DocumentFactory wordFactory = new WordDocumentFactory();
        
        // Process documents
        System.out.println("Processing PDF document:");
        pdfFactory.processDocument("report.pdf");
        
        System.out.println("\nProcessing Word document:");
        wordFactory.processDocument("report.docx");
    }
} 