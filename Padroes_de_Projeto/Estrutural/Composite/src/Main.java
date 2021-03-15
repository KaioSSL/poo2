
public class Main {
	public static void main(String[] args) {
		//Root, armazena todos os diretorios
		Dir root = new Dir();
		root.setPathName("root");
		
		//Dir 1
		Dir dir1 = new Dir();
		dir1.setPathName("imagens");
		
		//Dir 2
		Dir dir2 = new Dir();
		dir2.setPathName("familia");
		
		//Dir3
		Dir dir3 = new Dir();
		dir3.setPathName("Aniversário 15 Anos");
		
		//Dir 4
		Dir dir4 = new Dir();
		dir4.setPathName("Tio Zeca");
		
		//Files
		File f1 = new File();
		f1.setPathName("foto1.png");
		
		File f2 = new File();
		f2.setPathName("foto2.png");

		File f3 = new File();
		f3.setPathName("foto3.png");
		
		File f4 = new File();
		f4.setPathName("foto4.png");
		
		
		//Encadeando os Diretórios.
		root.addDir(dir1);
		dir1.addDir(dir2);
		dir1.addDir(dir3);
		dir2.addDir(dir4);
		
		dir3.addFile(f1);
		dir2.addFile(f2);
		dir4.addFile(f3);
		root.addFile(f4);
		
		System.out.println(f1.getPath());
		System.out.println(f2.getPath());
		System.out.println(f3.getPath());
		System.out.println(f4.getPath());
	}

}
