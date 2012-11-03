package com.soat.articleException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brice Hugon
 */
public class MultiCatchSample {  
    
    private void generateNPE(){
        throw new NullPointerException();
    }
    
    private void generateArithmeticException(){
        throw new ArithmeticException();
    }
    
    public void tryingToCatchAnException(){
        try{
            generateNPE();
        }catch(NullPointerException | ArithmeticException ex){
            Logger.getLogger(MultiCatchSample.class.getName()).log(Level.SEVERE, ex.getClass().getName());
            throw ex;
        }
    }
    
    public void tryingToCatchAnOtherException(){
        try{
            generateArithmeticException();
        }catch(NullPointerException | ArithmeticException ex){
            Logger.getLogger(MultiCatchSample.class.getName()).log(Level.SEVERE, ex.getClass().getName());
            throw ex;
        }
    }
    
}
