package com.crm.qa.testcases;

import org.testng.TestNG;

public class TestRunner {
	
	static TestNG testNg;

	public static void main(String[] args) {
		
		//ExtendReportListener ext = new ExtendReportListener();


		
		testNg = new TestNG();
		
		testNg.setTestClasses(new Class[] {LoginPageTest.class});
		testNg.addListener(null);
		testNg.run();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
