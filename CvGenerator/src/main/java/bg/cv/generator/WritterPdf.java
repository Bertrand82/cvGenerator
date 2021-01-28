package bg.cv.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class WritterPdf implements IWritter{
	File dir = GeneratorDoc.DIR;
	final private Document document = new Document();
	Font font = FontFactory.getFont(FontFactory.COURIER, 12, BaseColor.BLACK);
	Paragraph paragraph = new Paragraph("",font);
	
	public WritterPdf() {
		try {			
			
			File fileOut = new File(dir, "cv_"+System.currentTimeMillis()+".pdf");
			PdfWriter.getInstance(document, new FileOutputStream(fileOut));
			document.open();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

	public void debutParagraphe() {
		 paragraph = new Paragraph("",font);
		
	}
	public void finPAragraphe() {
		try {
			document.add(paragraph);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		paragraph = new Paragraph("",font);
		
	}
	public void addLigne(Object text) {
		paragraph.add(text+"\n");
		
	}
	public void addBreak() {
		paragraph.add(Chunk.NEWLINE);
	}
	
	public void print() {
		try {	
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
