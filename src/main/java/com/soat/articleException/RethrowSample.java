package com.soat.articleException;

import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brice Hugon
 */
public class RethrowSample {
    
    private void generateEOFException() throws EOFException{
        throw new EOFException();
    }
    
    public void maMethode() throws EOFException {
        try {
            generateEOFException();
        } catch (IOException ex) {
        	Logger.getLogger(RethrowSample.class.getName()).log(Level.SEVERE,ex.getClass().getName());
          throw ex;
        }
      }
}
