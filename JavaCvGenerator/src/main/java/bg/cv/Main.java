package bg.cv;

public class Main {

	private static String cvDefault = "cv_bg.xml";
	public static void main(String[] args) throws Exception{
		String s =cvDefault;
		if (args == null) {			
		}else if (args.length == 0) {			
		}else if (args.length > 0) {
			s = args[0];
		}
		if( s.trim().length()==0 ) {
			s = cvDefault;
		}
		ReaderXmlCvFile.parseFile(s);
	}

}
