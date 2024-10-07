package com.morfotech;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestAalf2 {

    private AppiumDriver<MobileElement> driver2;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps2 = new DesiredCapabilities();
        caps2.setCapability("deviceName", "POCO X5 5G");
        caps2.setCapability("udid", "192.168.99.7:5656");
        caps2.setCapability("platformName", "android");
        caps2.setCapability("appPackage", "com.morfo.sipandaunik_dev");
        caps2.setCapability("appActivity", "com.morfo.sipandaunik.MainActivity");
        caps2.setCapability("automationName", "uiautomator2");
        caps2.setCapability("noReset", "true");

        driver2 = new AndroidDriver<>(new URL("http://127.0.0.1:4725/wd/hub"), caps2);
    }

    @Test
    public void testDeviceTwo() throws InterruptedException {
        System.out.println("Running test on Device Two");

        //Login Valid
        MobileElement inputEmail = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfEmailLogin"));
        inputEmail.sendKeys("go");
        Thread.sleep(2000);

        MobileElement inputPassword = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputPassword.sendKeys("go");
        Thread.sleep(2000);

        MobileElement buttonLogin = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonLogin.click();
        Thread.sleep(2000);

        //Login invalid
        MobileElement navbarOther = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewOther"));
        navbarOther.click();
        Thread.sleep(2000);

        MobileElement buttonLogout = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogout"));
        buttonLogout.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmLogout = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmLogout.click();
        Thread.sleep(2000);

        MobileElement inputInvalidPassword = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputInvalidPassword.sendKeys("samudra");
        Thread.sleep(2000);

        MobileElement buttonInvalidLogin = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonInvalidLogin.click();
        Thread.sleep(2000);

        //Tab Dashboard Employee
        MobileElement clearInvalidPassword = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        clearInvalidPassword.clear();
        Thread.sleep(2000);

        MobileElement inputValidPassword = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputValidPassword.sendKeys("go");
        Thread.sleep(2000);

        MobileElement buttonLoginValid = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonLoginValid.click();
        Thread.sleep(2000);

        MobileElement tabDashboardEmployee = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtDashboardEmployee"));
        tabDashboardEmployee.click();
        Thread.sleep(2000);

        //Tab Dashboard HO
        MobileElement tabDashboardHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtDashboardHO"));
        tabDashboardHo.click();
        Thread.sleep(2000);

        //Tab Total HO Dashboard HO
        MobileElement tabTotalHoDashboardHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewTotalHO"));
        tabTotalHoDashboardHo.click();
        Thread.sleep(2000);

        //Tab HO On Progress Dashboard HO
        MobileElement buttonBackListTotalHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListTotalHo.click();
        Thread.sleep(2000);

        MobileElement tabHoOnProgress = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewProgressHO"));
        tabHoOnProgress.click();
        Thread.sleep(2000);

        //Tab HO Completed Dashboard HO
        MobileElement buttonBackListOnProgressHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListOnProgressHo.click();
        Thread.sleep(2000);

        MobileElement tabHoCompleted = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewCompletedHO"));
        tabHoCompleted.click();
        Thread.sleep(2000);

        //Tab Total Task Dashboard HO
        MobileElement buttonBackListCompletedHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListCompletedHo.click();
        Thread.sleep(2000);

        MobileElement tabTotalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTotalTask"));
        tabTotalTask.click();
        Thread.sleep(2000);

        //Tab Task Has Not Proceeded Dashboard HO
        MobileElement buttonBackListTotalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListTotalTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskHasNotProceeded = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedProceedTask"));
        tabTaskHasNotProceeded.click();
        Thread.sleep(2000);

        //Tab Task Need Approval JP Dashboard HO
        MobileElement buttonBackListNotProceededTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNotProceededTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskNeedApprovalJp = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalJPTask"));
        tabTaskNeedApprovalJp.click();
        Thread.sleep(2000);

        //Tab Task Need Approval Partner Dashboard HO
        MobileElement buttonBackListNeedApprovalJpTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedApprovalJpTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskNeedApprovalPartner = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalPartnerTask"));
        tabTaskNeedApprovalPartner.click();
        Thread.sleep(2000);

        //Tab Task Finished Dashboard HO
        MobileElement buttonBackListNeedApprovalPartnerTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedApprovalPartnerTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskFinished = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtFinishedTask"));
        tabTaskFinished.click();
        Thread.sleep(2000);

        //Tab Total Activity Dashboard HO
        MobileElement buttonBackListFinishedTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListFinishedTask.click();
        Thread.sleep(2000);

        MobileElement tabTotalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTotalActivity"));
        tabTotalActivity.click();
        Thread.sleep(2000);

        //Tab Activity Need Revision Dashboard HO
        MobileElement buttonBackListTotalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListTotalActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedRevision = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedRevisionActivity"));
        tabActivityNeedRevision.click();
        Thread.sleep(2000);

        //Tab Activity Need Approval JP Dashboard HO
        MobileElement buttonBackListNeedRevisionActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedRevisionActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedApprovalJp = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalJPActivity"));
        tabActivityNeedApprovalJp.click();
        Thread.sleep(2000);

        //Tab Activity Need Approval Partner Dashboard HO
        MobileElement buttonBackListNeedApprovalJpActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedApprovalJpActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedApprovalPartner = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalPartnerActivity"));
        tabActivityNeedApprovalPartner.click();
        Thread.sleep(2000);

        //Tab Activity Finished Dashboard HO
        MobileElement buttonBackListNeedApprovalPartnerActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListNeedApprovalPartnerActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityFinished = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtFinishedActivity"));
        tabActivityFinished.click();
        Thread.sleep(2000);

        //List Overdue Deadline Task Dashboard HO
        MobileElement buttonBackListFinishedActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListFinishedActivity.click();
        Thread.sleep(2000);

        var action = new TouchAction(driver2);
        action.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement listOverdueDeadline = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtSeeAllOverdue"));
        listOverdueDeadline.click();
        Thread.sleep(2000);

        var action1 = new TouchAction(driver2);
        action1.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 10))
                .release()
                .perform();

        var action2 = new TouchAction(driver2);
        action2.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 10))
                .release()
                .perform();

        //Proceed Overdue Deadline Task Dashboard HO
        MobileElement cardOverdueDeadlineTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardOverdue6"));
        cardOverdueDeadlineTask.click();
        Thread.sleep(2000);

        MobileElement dateStartDateProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        dateStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDateStartDateProceedTheTaskOverdue = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[24]/android.widget.Button"));
        selectDateStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartDateProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement timeStartDateProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeStart"));
        timeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeStartDateProceedTheTaskOverdue = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"11 hours\"]"));
        selectHourTimeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeStartDateProceedTheTaskOverdue = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"15 minutes\"]"));
        selectMinuteTimeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeStartDateProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement dateEndDateProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        dateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDateEndDateProceedTheTaskOverdue = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[25]/android.widget.Button"));
        selectDateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndDateProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement timeEndDateProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeEnd"));
        timeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeEndDateProceedTheTaskOverdue = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"20 hours\"]"));
        selectHourTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeEndDateProceedTheTaskOverdue = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"45 minutes\"]"));
        selectMinuteTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeEndDateProceedTheTaskOverdue = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
        buttonConfirmTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        var action3 = new TouchAction(driver2);
        action3.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonUploadPhotoReportProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btUploadPhoto"));
        buttonUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonGalleryUploadPhotoReportProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewGallery"));
        buttonGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement iconGalleryUploadPhotoReportProceedTheTaskOverdue = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/com.android.internal.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView"));
        iconGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue = driver2.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, October 4, 2024 14:53:41\"]/android.widget.FrameLayout/android.widget.TextView"));
        selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentReportProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentReportProceedTheTaskOverdue = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout/android.widget.LinearLayout"));
        selectDocumentUploadDocumentReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonSubmitProceedTheTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSubmit"));
        buttonSubmitProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmCompleteTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmCompleteTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonOkCompleteTaskOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkCompleteTaskOverdue.click();
        Thread.sleep(2000);
        
        //Create HO
        MobileElement buttonBackListOverdue = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackListOverdue.click();
        Thread.sleep(2000);

        MobileElement tabHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewHO"));
        tabHo.click();
        Thread.sleep(2000);

        MobileElement buttonCreateHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btCreateHO"));
        buttonCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonAddHandlingCompany = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetCompany"));
        buttonAddHandlingCompany.click();
        Thread.sleep(2000);

        MobileElement selectHandlingCompany = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardCompany1"));
        selectHandlingCompany.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentQuotation = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewDocumentQuotation"));
        buttonUploadDocumentQuotation.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentQuotation = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout"));
        selectDocumentUploadDocumentQuotation.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentConfirmationLetter = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewDocumentConfirmation"));
        buttonUploadDocumentConfirmationLetter.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentConfirmationLetter = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout"));
        selectDocumentUploadDocumentConfirmationLetter.click();
        Thread.sleep(2000);

        MobileElement buttonAddNameOfClient = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardClient1"));
        buttonAddNameOfClient.click();
        Thread.sleep(2000);

        MobileElement inputCaseName = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfCaseName"));
        inputCaseName.sendKeys("Pengetesan Automation mobile");
        Thread.sleep(2000);

        MobileElement chooseTypeOfClient = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        chooseTypeOfClient.click();
        Thread.sleep(2000);

        MobileElement selectTypeOfClient = driver2.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]"));
        selectTypeOfClient.click();
        Thread.sleep(2000);

        var action5 = new TouchAction(driver2);
        action5.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement inputTotalHours = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTotalHours"));
        inputTotalHours.sendKeys("35");
        Thread.sleep(2000);

        MobileElement startPeriodDateCreateHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        startPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement selectStartPeriodDateCreateHo = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[2]/android.widget.Button"));
        selectStartPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartPeriodDateCreateHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement endPeriodDateCreateHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        endPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement selectEndPeriodDateCreateHo = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[23]/android.widget.Button"));
        selectEndPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndPeriodDateCreateHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonAddNameOfTeam = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetTeam"));
        buttonAddNameOfTeam.click();
        Thread.sleep(2000);

        MobileElement selectNameOfTeam1 = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeamHO2"));
        selectNameOfTeam1.click();
        Thread.sleep(2000);

        MobileElement selectNameOfTeam2 = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeamHO3"));
        selectNameOfTeam2.click();
        Thread.sleep(2000);

        MobileElement buttonSelectTeamCreateHo = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonSelectTeamCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonSaveCreateHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveCreateHo.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveCreateHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveCreateHo.click();
        Thread.sleep(2000);
    }
}