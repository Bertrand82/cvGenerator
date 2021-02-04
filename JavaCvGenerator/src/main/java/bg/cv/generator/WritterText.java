package bg.cv.generator;

import java.io.File;
import java.io.PrintStream;
import java.util.List;

public class WritterText implements IWritter{

	
	private String text=""; 
	File dir = GeneratorDoc.DIR;
	public void print() {
		try {
			File file = new File(dir, "cv_" + ".txt");
			PrintStream ps = new PrintStream(file);
			ps.println(text);
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void debutParagraphe() {
		
		
	}

	public void finPAragraphe() {
		text +="\n";
		
	}

	public void addLigne(Object line) {
		text += ""+line+"\n";
		
	}

	public void addTitle1(String s) {
		text += "\n\t\t"+s.toUpperCase()+"\n";
		
	}

	public void addTitle2(String s) {
		text += "\t"+s.toUpperCase()+"\n";
		
	}

	public void addBreak() {
		text+="\n";
		
	}

	public void addLignePuce(List<String> list) {
		list.forEach((s)->{text+="\t - "+s+"\n";});
		
	}

}
