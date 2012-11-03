package com.soat.articleException;

import java.io.EOFException;
import java.io.IOException;

import org.junit.Test;

/**
 *
 * @author Brice Hugon
 */
public class RethrowSampleTest {
    
    @Test(expected = IOException.class )
    public void doWeGetAnIOException() throws IOException{
            RethrowSample rs = new RethrowSample();
            rs.maMethode();
    }
    
    @Test(expected=EOFException.class)
    public void doWeGetAnException() throws IOException{
            RethrowSample rs = new RethrowSample();
            rs.maMethode();
    }
}
