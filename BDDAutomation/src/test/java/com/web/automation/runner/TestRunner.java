package com.web.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", 
				 monochrome=true,
				 dryRun=false,
				 glue="com.web.automation.stepdefinition",
				 plugin= {"html:target/cucumber-reports/",
						 "json:target/cucumber.json",
						 "pretty:target/cucumber-pretty.txt",
						 "junit:target/cucumber-results.xml",
						 "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"}  //Generating default report
				 )
public class TestRunner {
	
	@BeforeClass
	public static void setReportConfiguration()
	{
		ExtentProperties property = ExtentProperties.INSTANCE;
		property.setReportPath("./Reports/Reports.html");
	}
	
	@AfterClass
	public static void setConfiguration()
	{
		Reporter.loadXMLConfig("./ConfigFiles/extent-config.xml");
	}
	
}
