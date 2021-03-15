import java.util.ArrayList;

public class Dir implements Path{
	private Path previusDir;
	private String pathName;
	private ArrayList<File> files;
	private ArrayList<Path> dirs;
	
	public Dir() {
		this.files = new ArrayList<>();
		this.dirs = new ArrayList<>();
	}
	public void addFile(File f) {
		f.setDir(this);
		this.files.add(f);
	}
	public void getFile(Integer id) {
		this.files.get(id);
	}
	public void addDir(Path p) {
		Dir d = (Dir) p;
		d.setPreviusDir(this);
		this.dirs.add(p);
	}
	public void getDir(Integer id) {
		this.dirs.get(id);
	}
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	public String getPathName() {
		return this.pathName;
	}	
	public void setPreviusDir(Path previusDir) {
		this.previusDir = previusDir;
	}
	public Path getPreviusDir() {
		return this.previusDir;
	}
	public String getPath() {
		if(this.getPreviusDir()==null) {
			return this.getPathName();
		}
		else {
			return   this.getPreviusDir().getPath()+  "/"  + this.getPathName() ;
		}
	}
	

}
