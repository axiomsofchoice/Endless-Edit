package com.np_compete.endless_edit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Basic unit test for Endless Edit.
 * 
 * @author axiomsofchoice
 */
public class EndlessEditTest {
	
	Collaboration collaboration ;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EndlessEditTest( String testName ) {
    }
    
    /**
     * Setup a common environment that makes it easier
     * to .
     */
    @Before
    public void setUp() {
    	collaboration = new Collaboration(10000) ;
    }

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        assertTrue( true );
    }
}
