import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class OCR {

    private Tesseract tesseract;

    public OCR() {
        tesseract = new Tesseract();
        tesseract.setLanguage("tam1+eng+equ");
        tesseract.setDatapath("/usr/share/tesseract-ocr/tessdata");
//        tesseract.setOcrEngineMode(2);
    }

    public String doOCR(File file) throws TesseractException, IOException {


        String text = "";

        PDDocument document = PDDocument.load(file);
        PDFRenderer pdfRenderer = new PDFRenderer(document);
        for (int page = 0; page < document.getNumberOfPages(); ++page) {
            BufferedImage bim = pdfRenderer.renderImageWithDPI(page, 900, ImageType.BINARY);
            ImageIO.write(bim , "png", new File("/media/aj/Studies/OCR/Tests/TXT/123.png"));

//                System.out.println("page"+page );
//            text += tesseract.doOCR(bim);
//
//                System.out.println("OCR "+page );


        }
//        text=tesseract.doOCR(file);
        document.close();

        System.out.println("OCRed Successfully...");

        return text;
    }

}
