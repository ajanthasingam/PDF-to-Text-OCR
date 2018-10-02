import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Writer {
//     ெசவ்வ ாய்க்கிழ ைம, பி.ப. 1.00 மணிக்கு
// வாய்ழூல வி ைடக்கான வின ாக்கள்

    public String edit(String text){
        text=text.replaceAll(" ","");
        text=text.replaceAll("ஈ", "ா");
        text=text.replaceAll(" ா", " ஈ");
        text=text.replaceAll("ழூ", "மூ");
        text=text.replaceAll("ஒ்", "ி");

        text=text.replaceAll(",ர்", ",- ");
        for (int i=0; i<text.length();i++){
            if( text.charAt(i)=='ே'||text.charAt(i)=='ெ'||text.charAt(i)=='ை' ){
                text=text.substring(0,i)+text.charAt(i+1)+text.charAt(i)+text.substring(i+2);
                i++;
            }
            else if( text.charAt(i)=='ன'&&  "கஙஹஷஸஷவழளலறரயமபனநதஞஜசடண".indexOf(text.charAt(i+1))!=-1 && "்ைேெூுீிாொோௌ".indexOf(text.charAt(i+2))==-1) {
                text=text.substring(0,i)+text.charAt(i+1)+"ை"+text.substring(i+2);
                i++;
            }
        }

//        text=text.replaceAll("டூ", " ே");
//        text=text.replaceAll("டு", " ெ");
//ே
//        text=text.replace("ேக", "கே");
//        text=text.replace("ேங", "ஙே");
//        text=text.replace("ேச", "சே");
//        text=text.replace("ேஜச", "ஜே");
//        text=text.replace("ேஞஜச", "ஞே");
//        text=text.replace("ேஞஜசட", "டே");
//        text=text.replace("ேஞஜசடண", "ணே");
//        text=text.replace("ேதஞஜசடண", "தே");
//        text=text.replace("ேநதஞஜசடண", "நே");
//        text=text.replace("ேனநதஞஜசடண", "னே");
//        text=text.replace("ேபனநதஞஜசடண", "பே");
//        text=text.replace("ேமபனநதஞஜசடண", "மே");
//        text=text.replace("ேயமபனநதஞஜசடண", "யே");
//        text=text.replace("ேரயமபனநதஞஜசடண", "ரே");
//        text=text.replace("ேறரயமபனநதஞஜசடண", "றே");
//        text=text.replace("ேலறரயமபனநதஞஜசடண", "லே");
//        text=text.replace("ேளலறரயமபனநதஞஜசடண", "ளே");
//        text=text.replace("ேழளலறரயமபனநதஞஜசடண", "ழே");
//        text=text.replace("ேவழளலறரயமபனநதஞஜசடண", "வே");
//        text=text.replace("ேஷவழளலறரயமபனநதஞஜசடண", "ஷே");
//        text=text.replace("ேஸஷவழளலறரயமபனநதஞஜசடண", "ஸே");
//        text=text.replace("ேஷஸஷவழளலறரயமபனநதஞஜசடண", "ஷே");
//        text=text.replace("ேஹஷஸஷவழளலறரயமபனநதஞஜசடண", "ஹே");

////ெ
//        text=text.replaceAll("ெக", " கெ");
//        text=text.replaceAll("ெங", "ஙெ");
//        text=text.replaceAll("ெச", "செ");
//        text=text.replaceAll("ெஜ", "ஜெ");
//        text=text.replaceAll("ெஞ", "ஞெ");
//        text=text.replaceAll("ெட", "டெ");
//        text=text.replaceAll("ெண", "ணெ");
//        text=text.replaceAll("ெத", "தெ");
//        text=text.replaceAll("ெந", "நெ");
//        text=text.replaceAll("ென", "னெ");
//        text=text.replaceAll("ெப", "பெ");
//        text=text.replaceAll("ெம", "மெ");
//        text=text.replaceAll("ெய", "யெ");
//        text=text.replaceAll("ெர", "ரெ");
//        text=text.replaceAll("ெற", "றெ");
//        text=text.replaceAll("ெல", "லெ");
//        text=text.replaceAll("ெள", "ளெ");
//        text=text.replaceAll("ெழ", "ழெ");
//        text=text.replaceAll("ெவ", "வெ");
//        text=text.replaceAll("ெஷ", "ஷெ");
//        text=text.replaceAll("ெஸ", "ஸெ");
//        text=text.replaceAll("ெஷ", "ஷெ");
//        text=text.replaceAll("ெஹ", "ஹெ");
////
        //ை
//        text=text.replaceAll("ைக", " கை");
//        text=text.replaceAll("ைங", "ஙை");
//        text=text.replaceAll("ைச", "சை");
//        text=text.replaceAll("ைஜ", "ஜை");
//        text=text.replaceAll("ைஞ", "ஞை");
//        text=text.replaceAll("ைட", "டை");
//        text=text.replaceAll("ைண", "ணை");
//        text=text.replaceAll("ைத", "தை");
//        text=text.replaceAll("ைந", "நை");
//        text=text.replaceAll("ைன", "னை");
//        text=text.replaceAll("ைப", "பை");
//        text=text.replaceAll("ைம", "மை");
//        text=text.replaceAll("ைய", "யை");
//        text=text.replaceAll("ைர", "ரை");
//        text=text.replaceAll("ைற", "றை");
//        text=text.replaceAll("ைல", "லை");
//        text=text.replaceAll("ைள", "ளை");
//        text=text.replaceAll("ைழ", "ழை");
//        text=text.replaceAll("ைவ", "வை");
//        text=text.replaceAll("ைஷ", "ஷை");
//        text=text.replaceAll("ைஸ", "ஸை");
//        text=text.replaceAll("ைஷ", "ஷை");
//        text=text.replaceAll("ைஹ", "ஹை");



        return text;
    }

    public void write(String text,String filepath) throws IOException {
        BufferedWriter outputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filepath)));
        outputStream.write(text);

        outputStream.close();
        System.out.println("Written to the file Successfully...");

    }
}
