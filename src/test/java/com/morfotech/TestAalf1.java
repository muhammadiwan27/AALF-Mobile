package com.morfotech;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class TestAalf1 {

    private AppiumDriver<MobileElement> driver1;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps1 = new DesiredCapabilities();
        caps1.setCapability("deviceName", "Muhammad's S23 Ultra");
        caps1.setCapability("udid", "192.168.99.89:5657");
        caps1.setCapability("platformName", "android");
        caps1.setCapability("appPackage", "com.morfo.sipandaunik_dev");
        caps1.setCapability("appActivity", "com.morfo.sipandaunik.MainActivity");
        caps1.setCapability("automationName", "uiautomator2");
        caps1.setCapability("noReset", "true");

        driver1 = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps1);
    }

    @Test
    public void testDeviceOne() throws InterruptedException {
        System.out.println("Running test on Device One");

        //Login Valid
        MobileElement inputEmail = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfEmailLogin"));
        inputEmail.sendKeys("go");
        Thread.sleep(2000);

        MobileElement inputPassword = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputPassword.sendKeys("go");
        Thread.sleep(2000);

        MobileElement buttonLogin = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonLogin.click();
        Thread.sleep(2000);

        //Login invalid
        MobileElement navbarOther = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewOther"));
        navbarOther.click();
        Thread.sleep(2000);

        MobileElement buttonLogout = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogout"));
        buttonLogout.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmLogout = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmLogout.click();
        Thread.sleep(2000);

        MobileElement inputInvalidPassword = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputInvalidPassword.sendKeys("samudra");
        Thread.sleep(2000);

        MobileElement buttonInvalidLogin = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonInvalidLogin.click();
        Thread.sleep(2000);

        //Tab Dashboard Employee
        MobileElement clearInvalidPassword = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        clearInvalidPassword.clear();
        Thread.sleep(2000);

        MobileElement inputValidPassword = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputValidPassword.sendKeys("go");
        Thread.sleep(2000);

        MobileElement buttonLoginValid = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonLoginValid.click();
        Thread.sleep(2000);

        MobileElement tabDashboardEmployee = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtDashboardEmployee"));
        tabDashboardEmployee.click();
        Thread.sleep(2000);

        //Tab Dashboard HO
        MobileElement tabDashboardHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtDashboardHO"));
        tabDashboardHo.click();
        Thread.sleep(2000);

        //Tab Total HO Dashboard HO
        MobileElement tabTotalHoDashboardHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewTotalHO"));
        tabTotalHoDashboardHo.click();
        Thread.sleep(2000);

        //Tab HO On Progress Dashboard HO
        MobileElement buttonBackListTotalHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListTotalHo.click();
        Thread.sleep(2000);

        MobileElement tabHoOnProgress = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewProgressHO"));
        tabHoOnProgress.click();
        Thread.sleep(2000);

        //Tab HO Completed Dashboard HO
        MobileElement buttonBackListOnProgressHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListOnProgressHo.click();
        Thread.sleep(2000);

        MobileElement tabHoCompleted = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewCompletedHO"));
        tabHoCompleted.click();
        Thread.sleep(2000);

        //Tab Total Task Dashboard HO
        MobileElement buttonBackListCompletedHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListCompletedHo.click();
        Thread.sleep(2000);

        MobileElement tabTotalTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTotalTask"));
        tabTotalTask.click();
        Thread.sleep(2000);

        //Tab Task Has Not Proceeded Dashboard HO
        MobileElement buttonBackListTotalTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListTotalTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskHasNotProceeded = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedProceedTask"));
        tabTaskHasNotProceeded.click();
        Thread.sleep(2000);

        //Tab Task Need Approval JP Dashboard HO
        MobileElement buttonBackListNotProceededTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNotProceededTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskNeedApprovalJp = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalJPTask"));
        tabTaskNeedApprovalJp.click();
        Thread.sleep(2000);

        //Tab Task Need Approval Partner Dashboard HO
        MobileElement buttonBackListNeedApprovalJpTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedApprovalJpTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskNeedApprovalPartner = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalPartnerTask"));
        tabTaskNeedApprovalPartner.click();
        Thread.sleep(2000);

        //Tab Task Finished Dashboard HO
        MobileElement buttonBackListNeedApprovalPartnerTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedApprovalPartnerTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskFinished = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtFinishedTask"));
        tabTaskFinished.click();
        Thread.sleep(2000);

        //Tab Total Activity Dashboard HO
        MobileElement buttonBackListFinishedTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListFinishedTask.click();
        Thread.sleep(2000);

        MobileElement tabTotalActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTotalActivity"));
        tabTotalActivity.click();
        Thread.sleep(2000);

        //Tab Activity Need Revision Dashboard HO
        MobileElement buttonBackListTotalActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListTotalActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedRevision = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedRevisionActivity"));
        tabActivityNeedRevision.click();
        Thread.sleep(2000);

        //Tab Activity Need Approval JP Dashboard HO
        MobileElement buttonBackListNeedRevisionActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedRevisionActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedApprovalJp = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalJPActivity"));
        tabActivityNeedApprovalJp.click();
        Thread.sleep(2000);

        //Tab Activity Need Approval Partner Dashboard HO
        MobileElement buttonBackListNeedApprovalJpActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedApprovalJpActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedApprovalPartner = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalPartnerActivity"));
        tabActivityNeedApprovalPartner.click();
        Thread.sleep(2000);

        //Tab Activity Finished Dashboard HO
        MobileElement buttonBackListNeedApprovalPartnerActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedApprovalPartnerActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityFinished = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtFinishedActivity"));
        tabActivityFinished.click();
        Thread.sleep(2000);

        //List Overdue Deadline Task Dashboard HO
        MobileElement buttonBackListFinishedActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListFinishedActivity.click();
        Thread.sleep(2000);

        var action = new TouchAction(driver1);
        action.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement listOverdueDeadline = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtSeeAllOverdue"));
        listOverdueDeadline.click();
        Thread.sleep(2000);

        var action1 = new TouchAction(driver1);
        action1.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 10))
                .release()
                .perform();

        var action2 = new TouchAction(driver1);
        action2.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 10))
                .release()
                .perform();

        //Proceed Overdue Deadline Task Dashboard HO
        MobileElement cardOverdueDeadlineTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardOverdue5"));
        cardOverdueDeadlineTask.click();
        Thread.sleep(2000);

        MobileElement dateStartDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        dateStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDateStartDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[24]/android.widget.Button"));
        selectDateStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement timeStartDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeStart"));
        timeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeStartDateProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"14 hours\"]"));
        selectHourTimeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeStartDateProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"20 minutes\"]"));
        selectMinuteTimeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeStartDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement dateEndDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        dateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDateEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[25]/android.widget.Button"));
        selectDateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement timeEndDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeEnd"));
        timeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"9 hours\"]"));
        selectHourTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"50 minutes\"]"));
        selectMinuteTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
        buttonConfirmTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        var action4 = new TouchAction(driver1);
        action4.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonUploadPhotoReportProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btUploadPhoto"));
        buttonUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonGalleryUploadPhotoReportProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewGallery"));
        buttonGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement iconGalleryUploadPhotoReportProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.ImageView"));
        iconGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectAlbumGalleryUploadPhotoReportProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.FrameLayout"));
        selectAlbumGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue = driver1.findElement(By.xpath("(//android.widget.FrameLayout[@content-desc=\"Button\"])[12]/android.widget.FrameLayout[2]"));
        selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentReportProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentReportProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[2]/android.widget.LinearLayout"));
        selectDocumentUploadDocumentReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonSubmitProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSubmit"));
        buttonSubmitProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmCompleteTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmCompleteTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonOkCompleteTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkCompleteTaskOverdue.click();
        Thread.sleep(2000);

        //Create HO
        MobileElement buttonBackListOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListOverdue.click();
        Thread.sleep(2000);

        MobileElement tabHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewHO"));
        tabHo.click();
        Thread.sleep(2000);

        MobileElement buttonCreateHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btCreateHO"));
        buttonCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonAddHandlingCompany = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetCompany"));
        buttonAddHandlingCompany.click();
        Thread.sleep(2000);

        MobileElement selectHandlingCompany = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardCompany0"));
        selectHandlingCompany.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentQuotation = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewDocumentQuotation"));
        buttonUploadDocumentQuotation.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentQuotation = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[2]"));
        selectDocumentUploadDocumentQuotation.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentConfirmationLetter = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewDocumentConfirmation"));
        buttonUploadDocumentConfirmationLetter.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentConfirmationLetter = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[5]"));
        selectDocumentUploadDocumentConfirmationLetter.click();
        Thread.sleep(2000);

        MobileElement buttonAddNameOfClient = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetClient"));
        buttonAddNameOfClient.click();
        Thread.sleep(2000);

        MobileElement selectNameOfClient = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardClient1"));
        selectNameOfClient.click();
        Thread.sleep(2000);

        MobileElement inputCaseName = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfCaseName"));
        inputCaseName.sendKeys("Pengetesan Automation mobile");
        Thread.sleep(2000);

        MobileElement chooseTypeOfClient = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/ddClientType"));
        chooseTypeOfClient.click();
        Thread.sleep(2000);

        MobileElement selectTypeOfClient = driver1.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]"));
        selectTypeOfClient.click();
        Thread.sleep(2000);

        var action5 = new TouchAction(driver1);
        action5.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement inputTotalHours = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTotalHours"));
        inputTotalHours.sendKeys("267");
        Thread.sleep(2000);

        MobileElement startPeriodDateCreateHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        startPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement selectStartPeriodDateCreateHo = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[7]/android.widget.Button"));
        selectStartPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartPeriodDateCreateHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement endPeriodDateCreateHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        endPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement selectEndPeriodDateCreateHo = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[23]/android.widget.Button"));
        selectEndPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndPeriodDateCreateHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonAddNameOfTeam = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetTeam"));
        buttonAddNameOfTeam.click();
        Thread.sleep(2000);

        MobileElement selectNameOfTeam1 = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeamHO0"));
        selectNameOfTeam1.click();
        Thread.sleep(2000);

        MobileElement selectNameOfTeam2 = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeamHO2"));
        selectNameOfTeam2.click();
        Thread.sleep(2000);

        MobileElement inputSearchTeam = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfSearch"));
        inputSearchTeam.sendKeys("reza");
        Thread.sleep(2000);

        MobileElement selectNameOfTeam3 = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeamHO0"));
        selectNameOfTeam3.click();
        Thread.sleep(2000);

        MobileElement buttonSelectTeamCreateHo = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonSelectTeamCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonSaveCreateHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveCreateHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveCreateHo.click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        try {
            // Assuming the app allows the user to log out
            MobileElement navbarOther = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewOther"));
            navbarOther.click();
            Thread.sleep(2000);

            MobileElement buttonLogout = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogout"));
            buttonLogout.click();
            Thread.sleep(2000);

            MobileElement buttonConfirmLogout = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
            buttonConfirmLogout.click();
            Thread.sleep(2000);

            MobileElement buttonLoginAnotherAccount = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/txtLoginAnother"));
            buttonLoginAnotherAccount.click();
            Thread.sleep(2000);

        } catch (Exception e) {
            // In case the user was already logged out or the element doesn't exist
            System.out.println("User was already logged out or error occurred.");
        } finally {
            driver1.quit();
        }
    }
}