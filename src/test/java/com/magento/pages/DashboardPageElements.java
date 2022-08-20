package com.magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.base.BaseClass;

public class DashboardPageElements extends BaseClass{

	@FindBy(id="menu_dashboard_index")
	public WebElement dashboard;
	
	public DashboardPageElements() {
		PageFactory.initElements(driver,this);
	}
	
}
