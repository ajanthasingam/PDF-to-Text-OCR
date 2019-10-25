
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.IOException;


public class test {

    public static void main(String[] args) throws TesseractException, IOException {
        String inputfolder= "/mnt/Studies/pdf/www.auditorgeneral.gov.lk/web/images/audit-reports";
        String outputfolder="/mnt/Studies/pdf/www.auditorgeneral.gov.lk/web/images/audit-reports";

        String[] filenames ={"Agalawatta-PS-2011-T.pdf" , "Agrarian Development Fund T.pdf" , "AgrarianDevelopmentFund-T.pdf" , "Agricultural   and Agrarian Insurance Board  -T.pdf" , "Airport and Aviation Services Sri Lanka Limited T.pdf" , "Akuressa Pradeshiya Sabha T.pdf" , "Alaiyadivembu Pradeshiya Sabha T.pdf" , "Angunukolapalessa Pradeshiya Sabha T.pdf" , "Api Wenuven Api Fund -T.pdf" , "Aranayaka Pradeshiya SabhaT.pdf" , "Attalaichchenai Pradeshiya Sabha T.pdf" , "Attanagalla Pradeshiya Sabha T.pdf" , "Ayurvedic Medical Council T.pdf" , "Batticaloa M. C T.pdf" , "Board of Investment of Sri Lanka-T.pdf" , "Hanguranketha-Pradeshiya-SabhaT.pdf" , "NationalDangerousDrugsControlBoard-T.pdf" , "Title Insurance Fund - T.pdf" , "Universities Pension Fund - T.pdf"};


        for (String filename:filenames
             ) {
            File file=new File(inputfolder+"/"+filename);
            OCR ocr=new OCR();
            String text=ocr.doOCR(file);
            Writer writer=new Writer();
            writer.write(writer.edit(text),outputfolder+"/"+filename.substring(0,filename.length()-3)+"txt");

        }
//2




    }
}



