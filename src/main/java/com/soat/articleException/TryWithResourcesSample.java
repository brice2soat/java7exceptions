package com.soat.articleException;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brice Hugon
 */
public class TryWithResourcesSample {
    
    public void readFile(String filePath) throws  FileNotFoundException,IOException{
        try (   FileInputStream fis = new FileInputStream(filePath); 
    			DataInputStream in = new DataInputStream(fis); 
        		BufferedReader br = new BufferedReader(new InputStreamReader(in))){
          
        	String readedLine;
        	
        	while((readedLine = br.readLine()) != null)
        		Logger.getLogger(TryWithResourcesSample.class.getName()).log(Level.INFO,readedLine);
       
        }catch(Exception ex){
        	Logger.getLogger(TryWithResourcesSample.class.getName()).log(Level.SEVERE,ex.getMessage());
        	throw ex;
        }

    }
    
}
