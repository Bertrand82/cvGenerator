package bg.cv.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class WritterPdf implements IWritter{
	File dir = GeneratorDoc.DIR;
	final private Document document = new Document();
	
	
	
	Font font = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);
	Font fontBold =  FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);
	Paragraph paragraph = new Paragraph("",font);
	
	public WritterPdf() {
		try {			
			System.out.println(FontFactory.HELVETICA_BOLD);
			System.out.println(FontFactory.HELVETICA);
			File fileOut = new File(dir, "cv.pdf");
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

	public void addTitle1(String text ) {
		addTitle(text, Element.ALIGN_CENTER);
	}
	public void addTitle(String text , int alignement) {
		try {
			if(! paragraph.isEmpty()) {
				document.add(paragraph);
			}
			this.paragraph=new Paragraph("",fontBold);
			this.paragraph.setAlignment(alignement);
			paragraph.add(text+"\n");
			document.add(paragraph);
			this.paragraph=new Paragraph("",font);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addTitle2(String text) {
		addTitle(text, Element.ALIGN_LEFT);
	}

	public void addLignePuce(List<String> list) {
		try {
			if(! paragraph.isEmpty()) {
				document.add(paragraph);
			}
			this.paragraph=new Paragraph("",font);
			com.itextpdf.text.List lPdf =  new com.itextpdf.text.List();
			list.forEach(s->lPdf.add(s));			
			document.add(lPdf);
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
