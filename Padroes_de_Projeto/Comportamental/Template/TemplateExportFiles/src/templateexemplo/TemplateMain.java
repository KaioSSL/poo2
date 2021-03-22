
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      ExportFileHTML export = new ExportFileHTML();
      export.exporta(texto);
      ExportFileWORD teste = new ExportFileWORD();
      teste.exporta(texto);
    }
    
}
