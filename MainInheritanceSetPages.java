// Base Class
class PrintJob {
    int numberOfPages;

    PrintJob(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Method to be overridden
    int estimateTime() {
        return 0; // Default implementation (will be overridden)
    }
}

// Subclass for Photo Print
class PhotoPrint extends PrintJob {
    PhotoPrint(int numberOfPages) {
        super(numberOfPages);
    }

    @Override
    int estimateTime() {
        return numberOfPages * 5; // 5 seconds per page
    }
}

// Subclass for Text Print
class TextPrint extends PrintJob {
    TextPrint(int numberOfPages) {
        super(numberOfPages);
    }

    @Override
    int estimateTime() {
        return numberOfPages * 2; // 2 seconds per page
    }
}

// Subclass for Document Print
class DocumentPrint extends PrintJob {
    DocumentPrint(int numberOfPages) {
        super(numberOfPages);
    }

    @Override
    int estimateTime() {
        return numberOfPages * 3; // 3 seconds per page
    }
}

// Main Class
public class PrintSystem {
    // Method to process print job
    static void processPrint(PrintJob p) {
        System.out.println("Estimated Time: " + p.estimateTime() + " seconds");
    }

    public static void main(String[] args) {
        PrintJob photo = new PhotoPrint(4);
        PrintJob text = new TextPrint(10);
        PrintJob document = new DocumentPrint(7);

        processPrint(photo);
        processPrint(text);
        processPrint(document);
    }
}
