package InstaConcepts;

import java.io.File;

public class FileHandleDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHandle fh=new FileHandle();
		
		File fn=new File("text.CSV");
		fn.delete();
	}

}
