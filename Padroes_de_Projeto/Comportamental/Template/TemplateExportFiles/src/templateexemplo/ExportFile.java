package templateexemplo;


public abstract class ExportFile {
	public ExportFile() {
		geraArquivo();
	}
	protected abstract void geraArquivo() ;
	protected abstract void escreve(String txt);
	protected abstract void exporta(String txt);
	protected abstract void salva();
}
