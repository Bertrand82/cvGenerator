package bg.cv.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WritterWord implements IWritter{
	
	private final XWPFDocument document = new XWPFDocument();

	private List<XWPFParagraph> listParagraphs = new ArrayList<XWPFParagraph>();

	private File dir =  GeneratorDoc.DIR;
	
	XWPFParagraph para;
	XWPFRun run ;
	
	public WritterWord() {
		
		initFooter();
		para = document.createParagraph();		
		para.setAlignment(ParagraphAlignment.LEFT);
		run = para.createRun();
	}
	
	
	private void initFooter() {
		XWPFFooter footer = document.createFooter(HeaderFooterType.DEFAULT);
		XWPFParagraph paragraph = footer.getParagraphArray(0);
		  if (paragraph == null) paragraph = footer.createParagraph();
		  paragraph.setAlignment(ParagraphAlignment.CENTER);

		  run = paragraph.createRun();  
		  run.setText(" Page ");
		  paragraph.getCTP().addNewFldSimple().setInstr("PAGE \\* MERGEFORMAT");
		  run = paragraph.createRun();  
		  run.setText(" of ");
		  paragraph.getCTP().addNewFldSimple().setInstr("NUMPAGES \\* MERGEFORMAT");
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
		finPAragraphe();
		debutParagraphe();
		run.setBold(true);
		run.setText("" + text.toUpperCase());
		//run.addBreak();
		finPAragraphe();
		debutParagraphe();
	}


	public void addTitle2(String text) {
		addTitle1(text);
		
	}


	public void addLignePuce(List<String> list) {
		list.forEach((s)->addLigne(s));
	}
	
	
}
