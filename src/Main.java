import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class Main {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		// TODO Auto-generated method stub

		// Loading an existing document
		File file = new File("D:\\Development\\EclipseProjects\\Workspace\\PDFReader\\TEST\\Test1.pdf");
		PDDocument document = PDDocument.load(file);

		// Instantiate PDFTextStripper class
		PDFTextStripper pdfStripper = new PDFTextStripper();
		
		// Retrieving text from PDF document
		String text = pdfStripper.getText(document);
		System.out.println(text);

		// Closing the document
		document.close();


		
	}

}
