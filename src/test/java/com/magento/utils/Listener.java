package com.magento.utils;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.magento.base.BaseClass;

public class Listener  implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {//this listener executes when @Test method starts
		System.out.println("Test Started " + result.getName());
		BaseClass.test=BaseClass.report.createTest(result.getName());
	 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed " + result.getName());
		BaseClass.test.pass("Test Case pass "+result.getName());
		try {
			BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("passed/"+result.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed " + result.getName());
		BaseClass.test.fail("Test Case Failed "+result.getName());
		try {
			BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("failed/"+result.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
