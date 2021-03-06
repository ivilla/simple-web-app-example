package com.aeromexico.example.modulea.unit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.log4j.Logger;
import com.aeromexico.example.modulea.*;

/**
 *
 * @author Ivan Villa
 */

public class ExampleModuleaTest
    extends TestCase
{
  	final static Logger logger = Logger.getLogger(ExampleModuleaTest.class);

    public ExampleModuleaTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( ExampleModuleaTest.class );
    }

    public void testApp()
    {
      logger.debug("++++++ Unit Test AeroMexico Module A Example...");
    	String user = "Aldo";
      ExampleModuleA example = new ExampleModuleA();
      assertTrue( example.whoAreYou(user) );

    }
}
