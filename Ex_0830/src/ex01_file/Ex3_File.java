package ex01_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = MyPath.path;
		File f = new File(path);
		
		if( f.isDirectory() ) {
			File[] f2 = f.listFiles();
			
			for( int i = 0; i < f2.length; i++ ) {
				
				if( f2[i].isDirectory() ) {
					System.out.println( f2[i].getName() );
				}
				
			}//for
			
		}
		
	}//main
}
