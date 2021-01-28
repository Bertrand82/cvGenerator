package bg.cv;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import bg.cv.generator.GeneratorDoc;
import bg.cv.model.Cv;

public class ReaderXmlCvFile {

	public static void parseFile(String fileName) throws Exception {
		File file = new File(fileName);
		Cv cv  = parseCvXml(file);
		System.out.println("cv : "+cv);
		new GeneratorDoc(cv);
	}

	public static void parseFile(File file) throws Exception {
		System.out.println("Start Parsing File " + file.getName() + "  exists: " + file.exists());
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

		Document doc = dBuilder.parse(file);
	}
	
	public static Cv parseCvXml(File fileXml) throws Exception{
		JAXBContext jaxbContext     = JAXBContext.newInstance( Cv.class );
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		//Overloaded methods to unmarshal from different xml sources
		Cv cv = (Cv) jaxbUnmarshaller.unmarshal( fileXml );
		return cv;
	}

}
