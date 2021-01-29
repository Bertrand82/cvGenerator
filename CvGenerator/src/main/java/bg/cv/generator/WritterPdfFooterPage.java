
package bg.cv.generator;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class WritterPdfFooterPage extends PdfPageEventHelper {

	private BaseFont font;
	private PdfTemplate template;
	
	public WritterPdfFooterPage() throws Exception{
		this(BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED));
	}

	public WritterPdfFooterPage(BaseFont font) {
		this.font = font;
		
	}

	@Override
	public void onOpenDocument(PdfWriter writer, Document document) {
		super.onOpenDocument(writer, document);
		template = writer.getDirectContent().createTemplate(50, 50);
		
	}

	@Override
	public void onEndPage(PdfWriter writer, Document document) {

		PdfContentByte contentByte = writer.getDirectContent();
		contentByte.beginText();
		try {
			Rectangle pageSize = document.getPageSize();
			contentByte.setFontAndSize(font, 8);
			contentByte.setColorFill(BaseColor.GRAY);
			int margeGauche = (int) pageSize.getWidth() - 100;
			contentByte.setTextMatrix(pageSize.getLeft(margeGauche), pageSize.getBottom(15));
			String s = "Page " + writer.getPageNumber() + "/";
			contentByte.showText(s);
			contentByte.addTemplate(template, pageSize.getLeft(margeGauche) + font.getWidthPoint(s, 8), pageSize.getBottom(15));
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		contentByte.endText();
	}

	@Override
	public void onCloseDocument(PdfWriter writer, Document document) {
		super.onCloseDocument(writer, document);

		template.beginText();
		try {
			template.setFontAndSize(font, 8);
			template.setTextMatrix(0f, 0f);
			template.showText("" + writer.getPageNumber());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		template.endText();
	}

}