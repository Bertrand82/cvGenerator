package bg.cv.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WritterWord implements IWritter{
	
	private final XWPFDocument document = new XWPFDocument();

	private List<XWPFParagraph> listParagraphs = new ArrayList<XWPFParagraph>();

	private File dir =  GeneratorDoc.DIR;
	
	XWPFParagraph para;
	XWPFRun run ;
	
	public WritterWord() {
		para = document.createParagraph();
		para.setAlignment(ParagraphAlignment.LEFT);
		run = para.createRun();
	}
	
	
	public void print()  {
		
		try {
			File file = new File(dir, "cv_" + System.currentTimeMillis() + ".doc");
			FileOutputStream fout = new FileOutputStream(file);
			document.write(fout);
			document.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}


	public void debutParagraphe() {
		this.para =document.createParagraph();
		this.run = para.createRun();
	}


	public void finPAragraphe() {
		listParagraphs.add(para);
		
	}


	public void addLigne(Object text) {
		run.setText("" + text);
		run.addBreak();
		
	}


	public void addBreak() {
		// TODO Auto-generated method stub
		
	}


	public void addTitle1(String text) {
		run.setText("" + text.toUpperCase());
		run.addBreak();
	}


	public void addTitle2(String text) {
		run.setText("" + text.toUpperCase());
		run.addBreak();
		
	}


	public void addLignePuce(List<String> list) {
		for (String s : list) {
			addLigne(s);
		}
		
	}
	
	
}
