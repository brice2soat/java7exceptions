package com.soat.articleException;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/**
 *
 * @author Brice Hugon
 */
public class TryWithResourcesSampleTest {
    
	    @Test(expected=FileNotFoundException.class)
	    public void noFile() throws FileNotFoundException, IOException{
	    	TryWithResourcesSample fileIO = new TryWithResourcesSample();
	        fileIO.readFile("thereIsNoFile");
	    }
    
    @Test
    public void fileExists() throws IOException{
    	TryWithResourcesSample fileIO = new TryWithResourcesSample();
        fileIO.readFile("fileToRead.txt");
        
    }
}
