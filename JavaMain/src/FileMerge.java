import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.Ostermiller.util.ConcatReader;

public class FileMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class FileMergeUtil {
		
		public void merge(String[] sourceFiles, String destinationFile) throws IOException {
			FileReader in;		
			ConcatReader concatReader = new ConcatReader();		
					
			for(int i=0; i< sourceFiles.length; i++) {
				in = new FileReader(sourceFiles[i]);
				concatReader.addReader(in);
			}
			
			concatReader.lastReaderAdded();
			
			FileWriter fw = new FileWriter(destinationFile); 
			
		    int c;
			while ((c = concatReader.read()) != -1) {
				fw.write((char)c);			
			}		
			fw.close();
			concatReader.close();
		}
}
}
