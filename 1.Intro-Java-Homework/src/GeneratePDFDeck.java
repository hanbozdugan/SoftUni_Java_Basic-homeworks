import java.io.*;
import com.pdfjet.*;
 
 
public class GeneratePDFDeck {
	public GeneratePDFDeck() throws Exception {
		 
		 
        PDF pdf = new PDF(
                new BufferedOutputStream(
                        new FileOutputStream("Deck.pdf")));
 
        Page page = new Page(pdf, A4.LANDSCAPE);
       
        Font f1 = new Font(pdf, "KozMinProVI-Regular", CodePage.UNICODE);
        f1.setSize(20f);
 
                String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
                String[] suites = {"\u2663", "\u2666", "\u2665", "\u2660"};
               
                for (int i = 0; i < faces.length; i++) {
                        for (int j = 0; j < suites.length; j++) {
                               
                                Box cardback = new Box();
                                cardback.setLocation((i + 1) * 65f - 55f, (j + 1) * 100f - 20f);
                                cardback.setSize(40f, 55f);
                                cardback.setColor(Color.black);
                                cardback.drawOn(page);
                               
                                TextLine face = new TextLine(f1,faces[i]);
                        face.setLocation((i + 1) * 65f -50f, (j + 1) * 100f);                  
                                TextLine suite = new TextLine(f1,suites[j]);
                        suite.setLocation((i + 1) * 65f - 30f, (j + 1) * 100f + 30f);
                        if (j == 1 || j == 2) {
                                        face.setColor(Color.red);
                                        suite.setColor(Color.red);
                                }
                        face.drawOn(page);
                        suite.drawOn(page);
                        }
                }
       
        pdf.close();
    }
       
        public static void main(String[] args) {
        try {
            new GeneratePDFDeck();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
               
        }
}

