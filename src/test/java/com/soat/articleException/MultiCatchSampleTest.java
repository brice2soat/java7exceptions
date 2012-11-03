package com.soat.articleException;

import org.junit.Test;

/**
 *
 * @author Brice Hugon
 */
public class MultiCatchSampleTest {
    
    @Test(expected=RuntimeException.class)
    public void AreWeCatchingARuntimeException(){
        MultiCatchSample mcs = new MultiCatchSample();
        mcs.tryingToCatchAnException();
    }
    
    @Test(expected=ArithmeticException.class)
    public void AreWeCatchingAnArithmeticException(){
        MultiCatchSample mcs = new MultiCatchSample();
        mcs.tryingToCatchAnOtherException();
    }
    
    @Test(expected=NullPointerException.class)
    public void AreWeCatchingANullPointerException(){
        MultiCatchSample mcs = new MultiCatchSample();
        mcs.tryingToCatchAnException();
    }
}
