package org.junitsample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit {
	  @BeforeClass
	  public static void beforeclass() {
		System.out.println("Browser....");
	  }
	  @AfterClass
	  public static void Afterclass() {
		System.out.println("close/quit....");
	  }
	  @Before
	  public void beforeEachMethod() {
		System.out.println("start Time....");

	}
	  @After
	  public void afterEachMethod() {
		System.out.println("End time.....");

	}
	  @Test
	  public void tc4() {
    System.out.println("tc...4");
	}
	  @Test
	  public void tc5() {
		System.out.println("tc....5");
	}
	  @Test
	  public void tc1() {
		System.out.println("tc..1");

	}
	  @Ignore
	  @Test
	  public void tc2() {
		System.out.println("tc2....");

	}
	  @Test
	  public void tc3() {
		  System.out.println("tc3.....");
	  }
		

	}
	  


