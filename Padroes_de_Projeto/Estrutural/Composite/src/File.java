
public class File implements Path {
	private Path dir;
	private String pathName;
	
	public String getPathName() {
		return pathName;
	}
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	public void setDir(Path dir) {
		this.dir = dir;
	}
	public Path getDir(){
		return this.dir;
	}
	@Override
	public String getPath() {
			return  dir.getPath() + "/" +  this.getPathName(); 
	}
}
