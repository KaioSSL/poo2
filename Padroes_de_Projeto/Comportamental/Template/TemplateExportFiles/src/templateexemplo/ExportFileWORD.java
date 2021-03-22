package templateexemplo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ExportFileWORD extends ExportFile {
	protected static FileOutputStream out1 = null;	
    protected static XWPFDocument document;

	public ExportFileWORD() {
		super();
	}
	
	public void geraArquivo() {
		String current = null;
		try {
            current = new java.io.File(".").getCanonicalPath();
            out1 = new FileOutputStream(new File(current + "\\src\\" + "word.docx"));
            document = new XWPFDocument();
            //Blank Document
        } catch (IOException ex) {
            Logger.getLogger(ExportFileWORD.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	protected void escreve(String txt) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(txt);
	}

	@Override
	protected void exporta(String txt) {
        String[] txtLinhas = txt.split("\n");
	   for(Object linhas : txtLinhas )
	   {
	       escreve((String)linhas);
	   }   
	   salva(); 
	}

	@Override
	protected void salva() {
        try {
            document.write(out1);
            out1.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFileWORD.class.getName()).log(Level.SEVERE, null, ex);
        }		
	}
}
