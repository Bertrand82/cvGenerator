package bg.cv.generator;

import java.io.File;
import java.io.PrintStream;

public class WritterText implements IWritter{

	
	private String text; 
	File dir = GeneratorDoc.DIR;
	public void print() {
		try {
			File file = new File(dir, "cv_" + System.currentTimeMillis() + ".txt");
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

	public void addBreak() {
		text+="\n";
		
	}

}
