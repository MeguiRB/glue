package display;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class DisplayPDF implements IDisplay {

    @Override
    public void display(String output){

        String fileName = "/Output" + ".pdf";
        String filePath = System.getProperty("user.dir") + fileName;

        try {
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            document.add(new Paragraph(output));
            document.close();
            writer.close();
        }
        catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
