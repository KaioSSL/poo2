package templateexemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExportFileHTML extends ExportFile {
	private  static BufferedWriter out = null;
	public ExportFileHTML() {
		super();
		System.out.println(out);
	}
	protected  void geraArquivo() {
		String current = null;
        try {
            current = new java.io.File(".").getCanonicalPath();
            System.out.println(current);
            File file = new File(current + "\\src\\" + "index.html");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            out = new BufferedWriter(fw);
            out.write("<HTML><BODY>");
            System.out.println("Construiu");
        } catch (IOException ex) {
            Logger.getLogger(ExportFileHTML.class.getName()).log(Level.SEVERE, null, ex);
        }
	};
	protected  void escreve(String txt) {
        try {
            this.out.write("<BR>" + txt);
        } catch (IOException ex) {
            Logger.getLogger(ExportFileHTML.class.getName()).log(Level.SEVERE, null, ex);
        }
	};
	protected  void exporta(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            escreve((String)linhas);
        }   
        salva();		
	};
	protected  void salva() {
        try {
            out.write("</BODY>");
            out.write("</HTML>");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFileHTML.class.getName()).log(Level.SEVERE, null, ex);
        }
	};
}
