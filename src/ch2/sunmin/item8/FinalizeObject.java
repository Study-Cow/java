package ch2.sunmin.item8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinalizeObject {
	
    private BufferedReader reader;

    public FinalizeObject() throws FileNotFoundException {    	
    	
        String file ="src/ch2/sunmin/item8/file.txt";
        
        this.reader = new BufferedReader(new FileReader(file));
    }

    public String readFirstLine() throws IOException {
        String firstLine = reader.readLine();
        return firstLine;
    }

	@Override
	public void finalize() {
	    try {
	        reader.close();
	        System.out.println("Closed BufferedReader in the finalizer");
	    } catch (IOException e) {
    		//
	    }
	}
}
