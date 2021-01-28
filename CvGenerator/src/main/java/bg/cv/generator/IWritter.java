package bg.cv.generator;

public interface IWritter {

	
	public void print();

	public void debutParagraphe();

	public void finPAragraphe();

	public void addLigne(Object text);

	public void addBreak();

	public void addTitle1(String text);

	public void addTitle2(String text);
}
