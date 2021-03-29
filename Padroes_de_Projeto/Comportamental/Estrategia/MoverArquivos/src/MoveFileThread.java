import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class MoveFileThread implements Runnable{
	private static File listaFiles[] = null;
	@Override
	public void run(){
		try{
			listaFiles = MoveFile.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles
	        for(int i = 0; i < listaFiles.length; i++) {
	            File origem = new File(listaFiles[i].getAbsolutePath());
	            String destinationFile = listaFiles[i].getAbsolutePath();
	            destinationFile = destinationFile.replace("origem", "destino");
	            copyFile(origem, new File(destinationFile));
	        }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


    public static void main(String args[]) throws IOException, InterruptedException {
        final long startTime = System.currentTimeMillis();// tempo incial
        System.out.println("Iniciando copiar de arquivos");
        Runnable run1 = new MoveFileThread();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run1);
        t1.start();
        t2.start();
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
        System.out.println("Time:"+ elapsedTimeMillis);
    }
    public static synchronized File[] getSingleTonListaFiles() throws IOException
    {        
        if(listaFiles == null){
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\origem");
            listaFiles = file.listFiles();                      
        }
        return listaFiles;        
    }
    
   
    public static void copyFile(File sourceFile, File destFile) throws IOException {

        if (!sourceFile.exists()) {
            return;
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destination != null) {
            destination.close();
        }
    }   
}

