package com.newtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Schedule_Module extends Capminds_BaseClass {
	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		///////////////// Schedule Calender ///////////////

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Clickonelement(pom.getschedloc().getMonth());

		// Click On Month Calender option
		Thread.sleep(4000);

//		Clickonelement(pom.getschedloc().getMonthcalender());
//
//		// Appointment Open Click Cancel
//
//		Clickonelement(pom.getschedloc().getCancel1());

		// Center Text Will Visible

		Thread.sleep(3000);

		gettext(pom.getschedloc().getVisibletext1());

		// Move To Workweek

		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getWorkweek());

		// Click On Calender

//		Clickonelement(pom.getschedloc().getWwcalender());
//
//		// Click Cancel Button
//
//		Clickonelement(pom.getschedloc().getCancel2());

		// Get Work Week Text

		Thread.sleep(2000);

		gettext(pom.getschedloc().getVisibletext2());

		// get week Option

		Clickonelement(pom.getschedloc().getweek());

		// get week text

		gettext(pom.getschedloc().getVisibletext3());

		// Clicl Calender

//		Clickonelement(pom.getschedloc().getwcalender());
//
//		// click Cancel
//
//		Clickonelement(pom.getschedloc().getCancel3());

		// click on Day option

		Clickonelement(pom.getschedloc().getDay());

		// Clcik On Day Calender

//		Clickonelement(pom.getschedloc().getDaycalender());
//
//		// Clcik On Cancel
//
//		Clickonelement(pom.getschedloc().getCancel4());

		// Visible Text Day

		gettext(pom.getschedloc().getVisibletext4());

		// Clcik On Center Calender

		Clickonelement(pom.getschedloc().getCenterCalender());

		// Click On Right

		Clickonelement(pom.getschedloc().getRight());

		// Clcik on Left

		Clickonelement(pom.getschedloc().getLeft());

		// Click Facility

		Clickonelement(pom.getschedloc().getFacilitySelect());

		// select facility
		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getSelectFacility());

		// Close Facility

		Clickonelement(pom.getschedloc().getFacilitySelectclo());

		Clickonelement(pom.getschedloc().getFacilitySelect());

		// Click Provider Select

		Clickonelement(pom.getschedloc().getProviderselect());

		// Select Provider

		Thread.sleep(3000);
		Clickonelement(pom.getschedloc().getselectProvider());

		// close Select

		Clickonelement(pom.getschedloc().getProviderselectclo());

		Clickonelement(pom.getschedloc().getProviderselect());
		// Visible Today

		gettext(pom.getschedloc().getTodayoption());

		//////////////// New Appointment ////////////

		// Get Appointment Option

		Clickonelement(pom.getschedloc().getAppointmentoption());

		// get Appointment Text
		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getAppointmentclick());

		// sele Type

		// Clickonelement(pom.getschedloc().getAppointtyp());

		// Clcik Patient

//		Thread.sleep(7000);

		// driver.manage().timeouts().implicitlyWait(12000, TimeUnit.MILLISECONDS);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement sera = wait2.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//div[normalize-space()='Search Patient'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sera);

		sendkeys(pom.getschedloc().getClcikpatient(), "Test");

		// Select Patient

		Clickonelement(pom.getschedloc().getSelectpatient());

		// Select Date
		Clickonelement(pom.getschedloc().getSelectdate());
		clear(pom.getschedloc().getSelectdate());

		sendkeys(pom.getschedloc().getSelectdate(), "06/02/2022");

		// Click Time
		Clickonelement(pom.getschedloc().getSelecttime());

		clear(pom.getschedloc().getSelecttime());

		sendkeys(pom.getschedloc().getSelecttime(), "1:20 PM");

		// Clickonelement(pom.getschedloc().getSelecttimeok());

		// Select Time

		// Clickonelement(na.getClickok());

		// Send Min

		sendkeys(pom.getschedloc().getSendmin(), "40");

		// Repeats Button

//		Clickonelement(pom.getschedloc().getRepeat());
//
//		// Select Every
//
//		Clickonelement(pom.getschedloc().getSelectevery());
//
//		// Select Day
//
//		Clickonelement(pom.getschedloc().getSelectday());
//
//		// Select Day Wise
//
//		Clickonelement(pom.getschedloc().getDaywise());
//
//		// Select calender
//
//		Clickonelement(pom.getschedloc().getSelectcalender1());
//
//		// Select Weeks option
//
//		Clickonelement(pom.getschedloc().getSelectweek());
//
//		// Close Day Wise
//
//		Clickonelement(pom.getschedloc().getSelectDaywise2());
//

		// close repeats

		Clickonelement(pom.getschedloc().getRepeat());

		// sele
		Thread.sleep(5000);

		selectone(pom.getschedloc().getselec(), "every");

		// sele da

		selectone(pom.getschedloc().getselecda(), "workday");

		// cli day

		Clickonelement(pom.getschedloc().getdayw());

		// cli day

		Clickonelement(pom.getschedloc().getdayws());

		// cal sek

		sendkeys(pom.getschedloc().getcals(), "2022-07-06");
		// Select calender

		Clickonelement(pom.getschedloc().getcals());

		Clickonelement(pom.getschedloc().getRepeat());
		// Click Search Provider

//		Clickonelement(pom.getschedloc().getSearchProvider());
//
//		// Select Provider
//
//		Clickonelement(pom.getschedloc().getSelectprovider());

		// Click Profile

		Clickonelement(pom.getschedloc().getClickprofile());

		// Select Profile

		Clickonelement(pom.getschedloc().getSelectprofile());

		// Click Location

		Thread.sleep(2000);

//		Clickonelement(pom.getschedloc().getLocation());
//
//		// Select Loction
//
//		Clickonelement(pom.getschedloc().getSelectLocation());

		// Clcik Status

		Clickonelement(pom.getschedloc().getClickstatus());

		// select status

		Clickonelement(pom.getschedloc().getSelectstatus());

		// Click Save

		// Clickonelement(pom.getschedloc().getClicksave());

		// Save Or Close

		Clickonelement(pom.getschedloc().getClickclose());

		// Click Appointmentdashboard

		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

/////////// Appointment Dashboard ///////

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement apds = wait3.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//a[normalize-space()='Appointment Dashboard'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", apds);

		// Click Search Office

		Clickonelement(pom.getschedloc().getSearchoffice());

		// Select Test Facility
		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getSelecttestfac2());

		// Close Search Office

		Clickonelement(pom.getschedloc().getSearchoffice());

		// Click Calender

		sendkeys(pom.getschedloc().getClickcalender(), "2022-5-25");

		// Clickonelement(pom.getschedloc().getClickcalender());

		// Click on Update Filter

		Clickonelement(pom.getschedloc().getClickupdate());

		// Click Select none
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getSelectnone());

		// Click Select all

		Clickonelement(pom.getschedloc().getSelectall());

		// Click Select none

		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getSelectnone());

		// Click Search Office

		// Clickonelement(pom.getschedloc().getstatsh());

		// Click Search Office

		Clickonelement(pom.getschedloc().gettelehe());
		// Select Test Facility

//		Clickonelement(pom.getschedloc().getSelecttestfac2());
//
//		// Click on Update Filter
//
//		Clickonelement(pom.getschedloc().getClickupdate());

////////////////////Provider Availability //////////
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement proa = wait4.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Provider Availability')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", proa);

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Clickonelement(pom.getschedloc().getClickProvideravailability());

//Click On office Search
		Clickonelement(pom.getschedloc().getClickofficesearch());

//Select provider
		Thread.sleep(2000);
		Clickonelement(pom.getschedloc().getSelectprovider());

//Click Edit Optiom
		Clickonelement(pom.getschedloc().getClickedit());

//Search Provider
		Clickonelement(pom.getschedloc().getClickProvideravailability1());

//Select provider
		Clickonelement(pom.getschedloc().geteditselectprovider());

//Appointment category
		Clickonelement(pom.getschedloc().geteditappointment());

//select appointment
		Clickonelement(pom.getschedloc().geteditselectappointment());

//appointment status
		Clickonelement(pom.getschedloc().geteditappstatus());

//appintment select
		Clickonelement(pom.getschedloc().geteditappselect());

//date select
		sendkeys(pom.getschedloc().geteditappdate(), "2022-06-01");

////save
		sendkeys(pom.getschedloc().getclcicktime(), "09:00");

		Clickonelement(pom.getschedloc().geteditappsave());

//Close edit Custom Template
// Clickonelement(pom.getschedloc().getClosecustomedit());

//Create Provider

		Thread.sleep(4000);
		Clickonelement(pom.getschedloc().getclickaddprovider());

//Search Provider
		Clickonelement(pom.getschedloc().getSearchprovider());

//Select Provider
		Clickonelement(pom.getschedloc().getSelectprovider1());

//Click Office
		Clickonelement(pom.getschedloc().getSelectOffice());

//Select provider
		Clickonelement(pom.getschedloc().getSelectoffice1());

//click appointment
		Clickonelement(pom.getschedloc().getSelectappointmentcategory());

//select category
		Clickonelement(pom.getschedloc().getSelectcategory());

//click appointment status
		Clickonelement(pom.getschedloc().getAppointmentstatus());

//select appointment status
		Clickonelement(pom.getschedloc().getAppointmentstatusselect());

//Select Date

// Clickonelement(pom.getschedloc().getappcalender());

		sendkeys(pom.getschedloc().getappcalender(), "2022-06-08");

//select time
// Clickonelement(pom.getschedloc().getapptimer());

//send time
		sendkeys(pom.getschedloc().getapptimer(), "15:56");

//duration
		sendkeys(pom.getschedloc().getduration(), "40");

//Click repeat
		Clickonelement(pom.getschedloc().getapprepeat());

//click every
		Clickonelement(pom.getschedloc().getappevery());

//clcik day
		Clickonelement(pom.getschedloc().getappday());

//click calender
		Clickonelement(pom.getschedloc().getappcal());

//click daywise
		Clickonelement(pom.getschedloc().getappdaywise());

//click on calender
		Clickonelement(pom.getschedloc().getappcal());

//click deselect
		Clickonelement(pom.getschedloc().getappdaywisedesele());

//click on calender
		Clickonelement(pom.getschedloc().getappcal());

//repeat deselect
		Clickonelement(pom.getschedloc().getapprepeat());

//Select Date

// sendkeys(pom.getschedloc().getappcal(), "2022-02-25");

//Save or Close
		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getAppsave());

//Close

// Clickonelement(pom.getschedloc().getAppclose());

///////////////////////// Click Appointment profile

		Thread.sleep(4000);

		Clickonelement(pom.getschedloc().getAppointmentprofile());

//click sort button

		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getclicksort());

//click sort release
		Clickonelement(pom.getschedloc().getclicksortrelease());

//click footer
		Thread.sleep(3000);

// Clickonelement(pom.getschedloc().getclickfooter());

//Click delete
// Thread.sleep(3000);

// Clickonelement(pom.getschedloc().getclickdelete());

//click dismiss

// alertdismiss(driver);

//Click new add new profile
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getaddnewprofile());

//Send names
		Thread.sleep(2000);

		sendkeys(pom.getschedloc().getaddname(), "xyz");

//send resean for visit
		sendkeys(pom.getschedloc().getaddresonforvisit(), "coldfever");

//send color
		sendkeys(pom.getschedloc().getaddcolor(), "#A51718");

//send duration
		sendkeys(pom.getschedloc().getaddduration(), "40");

//send billing profile
		Clickonelement(pom.getschedloc().getbillingprofile());

//payment profile
		Clickonelement(pom.getschedloc().getbillingprofile1());

// clickpaymentprofile
		Clickonelement(pom.getschedloc().getclickpaymentprofile());

//selectpaymentprofile
		Clickonelement(pom.getschedloc().getselectpaymentprofile());

//click save
// Clickonelement(pom.getschedloc().getsaveap());

//click close
		Clickonelement(pom.getschedloc().getClose());

//Click Billing Profile
		Clickonelement(pom.getschedloc().getclcikbillingprofile());

//click sort
		Clickonelement(pom.getschedloc().getclicksort1());

//Click Sort
		Clickonelement(pom.getschedloc().getclicksort2());

//click add new profile
		Clickonelement(pom.getschedloc().getclickaddnewprofile());

//send profile name
		sendkeys(pom.getschedloc().getprofilename(), "xyz");

//sendicd9
		sendkeys(pom.getschedloc().getsendicd9(), "v");

//click icd
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getclcicksendicd9());

//sendicd10
		sendkeys(pom.getschedloc().getsendicd10(), "v");

//click icd
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getselectsendicd10());

//senddia
		sendkeys(pom.getschedloc().getclickCpt(), "v");

//click icd
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getselectCpt());

//senddia
		sendkeys(pom.getschedloc().getclickHCPCS(), "v");

//click icd
		Thread.sleep(3000);

		Clickonelement(pom.getschedloc().getselectHCPCS());

//senddia
		sendkeys(pom.getschedloc().getclickcustom(), "9090");

//click icd
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getselectcustom());

//click save
		Thread.sleep(2000);

		Clickonelement(pom.getschedloc().getclicksave());

	}

}
