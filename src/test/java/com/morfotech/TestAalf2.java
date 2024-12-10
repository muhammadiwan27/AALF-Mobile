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
        caps2.setCapability("udid", "192.168.99.40:5656");
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

        MobileElement selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue = driver2.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, October 4, 2024 14:53:41, Indonesia, Daerah Khusus Ibukota Jakarta\"]/android.widget.FrameLayout/android.widget.TextView"));
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

        Thread.sleep(9000);
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

        var action4 = new TouchAction(driver2);
        action4.press(PointOption.point(500, 1500))
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

        //Add Task HO
        MobileElement hoCard = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardHO0"));
        hoCard.click();
        Thread.sleep(2000);

        MobileElement buttonAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/FloatActionButtonTaskCreate"));
        buttonAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonNextAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonSelectSowAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSow"));
        buttonSelectSowAddTask.click();
        Thread.sleep(2000);

        MobileElement selectLitigasiSowAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW1"));
        selectLitigasiSowAddTask.click();
        Thread.sleep(2000);

        MobileElement selectPidanaSowAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW6"));
        selectPidanaSowAddTask.click();
        Thread.sleep(2000);

        MobileElement selectKehadiranSidangSowAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW1"));
        selectKehadiranSidangSowAddTask.click();
        Thread.sleep(2000);

        MobileElement selectPembuktianAktifSidangSowAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW2"));
        selectPembuktianAktifSidangSowAddTask.click();
        Thread.sleep(2000);

        MobileElement inputNoteAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfNote"));
        inputNoteAddTask.sendKeys("Pengetesan Automation mobile");
        Thread.sleep(2000);

        MobileElement buttonDateDeadlineAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDate"));
        buttonDateDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement selectDateDeadlineAddTask = driver2.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[31]/android.widget.Button"));
        selectDateDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateDeadlineAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonTimeDeadlineAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTime"));
        buttonTimeDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement selectHourDeadlineAddTask = driver2.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[19]"));
        selectHourDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement selectMinuteDeadlineAddTask = driver2.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[9]"));
        selectMinuteDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeDeadlineAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonUploadTaskPhotoAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btUploadPhoto"));
        buttonUploadTaskPhotoAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonGalleryUploadTaskPhotoAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewGallery"));
        buttonGalleryUploadTaskPhotoAddTask.click();
        Thread.sleep(2000);

        MobileElement selectPhotoUploadTaskPhotoAddTask = driver2.findElement(By.id("com.miui.gallery:id/pick_num_indicator"));
        selectPhotoUploadTaskPhotoAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonUploadTaskDocumentAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadTaskDocumentAddTask.click();
        Thread.sleep(2000);

        MobileElement tabDocumentsUploadTaskDocumentAddTask = driver2.findElement(By.id("com.google.android.documentsui:id/search_chip_group"));
        tabDocumentsUploadTaskDocumentAddTask.click();
        Thread.sleep(2000);

        MobileElement selectDocumentsUploadTaskDocumentAddTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]"));
        selectDocumentsUploadTaskDocumentAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonAddPicAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetTeam"));
        buttonAddPicAddTask.click();
        Thread.sleep(2000);

        MobileElement selectPic1AddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam0"));
        selectPic1AddTask.click();
        Thread.sleep(2000);

        MobileElement selectPic2AddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam3"));
        selectPic2AddTask.click();
        Thread.sleep(2000);

        MobileElement buttonSelectTeamPicAddTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonSelectTeamPicAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonSaveAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveAddTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveAddTask.click();
        Thread.sleep(2000);

        //Add Activity
        MobileElement buttonAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/FloatActionButtonTaskCreate"));
        buttonAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonDropdownAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        buttonDropdownAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonDropdownSelectActivityAddActivity = driver2.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView"));
        buttonDropdownSelectActivityAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonNextAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextAddActivity.click();
        Thread.sleep(2000);

        MobileElement dateStartDateAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        dateStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectDateStartDateAddActivity = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[6]/android.view.View"));
        selectDateStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartDateAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement timeStartDateAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeStart"));
        timeStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeStartDateAddActivity = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"11 hours\"]"));
        selectHourTimeStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeStartDateAddActivity = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"15 minutes\"]"));
        selectMinuteTimeStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeStartDateAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement dateEndDateAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        dateEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectDateEndDateAddActivity = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[27]/android.widget.Button"));
        selectDateEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndDateAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement timeEndDateAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeEnd"));
        timeEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeEndDateAddActivity = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"20 hours\"]"));
        selectHourTimeEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeEndDateAddActivity = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"45 minutes\"]"));
        selectMinuteTimeEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeEndDateAddActivity = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
        buttonConfirmTimeEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonSelectSowAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSow"));
        buttonSelectSowAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectCorporateSowAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW0"));
        selectCorporateSowAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectDraftingPerjanjianSowAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW0"));
        selectDraftingPerjanjianSowAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonUploadPhotoReportAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btUploadPhoto"));
        buttonUploadPhotoReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonGalleryUploadPhotoReportAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewGallery"));
        buttonGalleryUploadPhotoReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectPhotoUploadPhotoReportAddActivity = driver2.findElement(By.id("com.miui.gallery:id/pick_num_indicator"));
        selectPhotoUploadPhotoReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentReportAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement tabDocumentsUploadDocumentReportAddActivity = driver2.findElement(By.id("com.google.android.documentsui:id/search_chip_group"));
        tabDocumentsUploadDocumentReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectDocumentsUploadDocumentReportAddActivity = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]"));
        selectDocumentsUploadDocumentReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement inputNoteAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfNote"));
        inputNoteAddActivity.sendKeys("Pengetesan Automation mobile");
        Thread.sleep(2000);

        MobileElement buttonAddPicAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetTeam"));
        buttonAddPicAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectPic1AddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam0"));
        selectPic1AddActivity.click();
        Thread.sleep(2000);

        MobileElement selectPic2AddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam3"));
        selectPic2AddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonSelectTeamPicAddActivity = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonSelectTeamPicAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonSaveAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveAddActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveAddActivity.click();
        Thread.sleep(2000);

        //Edit Task
        MobileElement cardEditTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTask1"));
        cardEditTask.click();
        Thread.sleep(2000);

        MobileElement editInputNoteTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfNote"));
        editInputNoteTask.clear();
        Thread.sleep(2000);
        editInputNoteTask.sendKeys("Edit task Mobile");
        Thread.sleep(2000);

        var action5 = new TouchAction(driver2);
        action5.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonSaveEditTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveEditTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveEditTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveEditTask.click();
        Thread.sleep(2000);

        //Proceed The Task
        MobileElement buttonProceedTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonProceedTask.click();
        Thread.sleep(2000);

        MobileElement dateStartDateProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        dateStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectDateStartDateProceedTheTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[24]/android.widget.Button"));
        selectDateStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartDateProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement timeStartDateProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeStart"));
        timeStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeStartDateProceedTheTask = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"11 hours\"]"));
        selectHourTimeStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeStartDateProceedTheTask = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"15 minutes\"]"));
        selectMinuteTimeStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeStartDateProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement dateEndDateProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        dateEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectDateEndDateProceedTheTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[25]/android.widget.Button"));
        selectDateEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndDateProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement timeEndDateProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeEnd"));
        timeEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeEndDateProceedTheTask = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"20 hours\"]"));
        selectHourTimeEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeEndDateProceedTheTask = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"45 minutes\"]"));
        selectMinuteTimeEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeEndDateProceedTheTask= driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
        buttonConfirmTimeEndDateProceedTheTask.click();
        Thread.sleep(2000);

        var action6 = new TouchAction(driver2);
        action6.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonUploadPhotoReportProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btUploadPhoto"));
        buttonUploadPhotoReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonGalleryUploadPhotoReportProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewGallery"));
        buttonGalleryUploadPhotoReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectPhotoUploadPhotoReportProceedTheTask= driver2.findElement(By.id("com.miui.gallery:id/pick_num_indicator"));
        selectPhotoUploadPhotoReportProceedTheTask.click();
        Thread.sleep(3000);

        MobileElement buttonUploadDocumentReportProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectTabDocumentUploadDocumentReportProceedTheTask= driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[4]"));
        selectTabDocumentUploadDocumentReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentReportProceedTheTask= driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]"));
        selectDocumentUploadDocumentReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonSubmitProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSubmit"));
        buttonSubmitProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmProceedTheTask.click();
        Thread.sleep(2000);

        Thread.sleep(2000);

        MobileElement buttonOkProceedTheTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkProceedTheTask.click();
        Thread.sleep(2000);

        //JP Approval Task
        MobileElement tabListApprovalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewApproval"));
        tabListApprovalTask.click();
        Thread.sleep(2000);

        MobileElement buttonJpApprovalTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonJpApprovalTask.click();
        Thread.sleep(2000);

        var action7 = new TouchAction(driver2);
        action7.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApproveJpApprovalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApproveJpApprovalTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApproveJpApprovalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApproveJpApprovalTask.click();
        Thread.sleep(2000);

        //Revision Task
        MobileElement buttonJpApprovalForRevisionTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonJpApprovalForRevisionTask.click();
        Thread.sleep(2000);

        var action8 = new TouchAction(driver2);
        action8.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonRevisionJpApprovalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btRevise"));
        buttonRevisionJpApprovalTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmRevisionJpApprovalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmRevisionJpApprovalTask.click();
        Thread.sleep(2000);

        //Partner Approval Task
        var action9 = new TouchAction(driver2);
        action9.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonPartnerApprovalTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonPartnerApprovalTask.click();
        Thread.sleep(2000);

        var action10 = new TouchAction(driver2);
        action10.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApprovePartnerApprovalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApprovePartnerApprovalTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApprovePartnerApprovalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApprovePartnerApprovalTask.click();
        Thread.sleep(2000);

        //View Approved Task
        MobileElement tabListApprovedTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewApproved"));
        tabListApprovedTask.click();
        Thread.sleep(2000);

        MobileElement cardApprovedTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTask0"));
        cardApprovedTask.click();
        Thread.sleep(2000);

        MobileElement buttonBackViewApprovedTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/imgBack"));
        buttonBackViewApprovedTask.click();
        Thread.sleep(2000);

        //JP Approval Activity
        MobileElement tabListApprovalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewApproval"));
        tabListApprovalActivity.click();
        Thread.sleep(2000);

        MobileElement searchBarListApprovalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        searchBarListApprovalActivity.sendKeys("activity");
        Thread.sleep(2000);

        MobileElement buttonJpApprovalActivity = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonJpApprovalActivity.click();
        Thread.sleep(2000);

        MobileElement buttonApproveJpApprovalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApproveJpApprovalActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApproveJpApprovalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApproveJpApprovalActivity.click();
        Thread.sleep(2000);

        //Revision Activity
        MobileElement buttonJpApprovalForRevisionActivity = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonJpApprovalForRevisionActivity.click();
        Thread.sleep(2000);

        MobileElement buttonRevisionJpApprovalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btRevise"));
        buttonRevisionJpApprovalActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmRevisionJpApprovalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmRevisionJpApprovalActivity.click();
        Thread.sleep(2000);

        //Partner Approval Activity
        MobileElement searchBarListApprovalPartnerActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        searchBarListApprovalPartnerActivity.sendKeys("activity");
        Thread.sleep(2000);

        MobileElement buttonPartnerApprovalActivity = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonPartnerApprovalActivity.click();
        Thread.sleep(2000);

        var action11 = new TouchAction(driver2);
        action11.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApprovePartnerApprovalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApprovePartnerApprovalActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApprovePartnerApprovalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApprovePartnerApprovalActivity.click();
        Thread.sleep(2000);

        //Create Document RKPD
        MobileElement tabAdministrativeDocument = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtAdministrativeDocument"));
        tabAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement buttonAddAdministrativeDocument = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/FloatActionButtonDocumentAdmin"));
        buttonAddAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement buttonNextCreateAdministrativeDocument = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextCreateAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement buttonSelectSowRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSow"));
        buttonSelectSowRkpd.click();
        Thread.sleep(2000);

        MobileElement selectSowCorporateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW0"));
        selectSowCorporateRkpd.click();
        Thread.sleep(2000);

        MobileElement selectSowDueDiligenceRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW2"));
        selectSowDueDiligenceRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonSelectRegionRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetArea"));
        buttonSelectRegionRkpd.click();
        Thread.sleep(2000);

        MobileElement selectRegionDalamKotaRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardArea0"));
        selectRegionDalamKotaRkpd.click();
        Thread.sleep(2000);

        MobileElement inputLocationRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfLocation"));
        inputLocationRkpd.sendKeys("Senopati");
        Thread.sleep(2000);

        MobileElement buttonSelectAssignedMemberRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetTeam"));
        buttonSelectAssignedMemberRkpd.click();
        Thread.sleep(2000);

        MobileElement selectAssignedMember1Rkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam0"));
        selectAssignedMember1Rkpd.click();
        Thread.sleep(2000);

        MobileElement selectAssignedMember2Rkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam2"));
        selectAssignedMember2Rkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSelectedAssignedMemberRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonConfirmSelectedAssignedMemberRkpd.click();
        Thread.sleep(2000);

        MobileElement inputAgendaRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfAgenda"));
        inputAgendaRkpd.sendKeys("Rencana perjalanan sidang di dalam kota");
        Thread.sleep(2000);

        var action12 = new TouchAction(driver2);
        action12.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement dateStartDateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        dateStartDateRkpd.click();
        Thread.sleep(2000);

        MobileElement selectDateStartDateRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[9]/android.widget.Button"));
        selectDateStartDateRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartDateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartDateRkpd.click();
        Thread.sleep(2000);

        MobileElement timeStartDateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeStart"));
        timeStartDateRkpd.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeStartDateRkpd = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"9 hours\"]"));
        selectHourTimeStartDateRkpd.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeStartDateRkpd = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"20 minutes\"]"));
        selectMinuteTimeStartDateRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeStartDateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeStartDateRkpd.click();
        Thread.sleep(2000);

        MobileElement dateEndDateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        dateEndDateRkpd.click();
        Thread.sleep(2000);

        MobileElement selectDateEndDateRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[10]/android.widget.Button"));
        selectDateEndDateRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndDateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndDateRkpd.click();
        Thread.sleep(2000);

        MobileElement timeEndDateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeEnd"));
        timeEndDateRkpd.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeEndDateRkpd = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"13 hours\"]"));
        selectHourTimeEndDateRkpd.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeEndDateRkpd = driver2.findElement(By.xpath("//android.view.View[@content-desc=\"45 minutes\"]"));
        selectMinuteTimeEndDateRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeEndDateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeEndDateRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentRkpd.click();
        Thread.sleep(2000);

        MobileElement tabDocumentsUploadRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[4]"));
        tabDocumentsUploadRkpd.click();
        Thread.sleep(2000);

        MobileElement selectDocumentsUploadRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[4]"));
        selectDocumentsUploadRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonSaveCreateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveCreateRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveCreateRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveCreateRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonCancelDownloadRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btDismiss"));
        buttonCancelDownloadRkpd.click();
        Thread.sleep(2000);

        //JP Approval RKPD
        MobileElement buttonJpApprovalRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.Button"));
        buttonJpApprovalRkpd.click();
        Thread.sleep(2000);

        var action13 = new TouchAction(driver2);
        action13.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApproveJpApprovalRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApproveJpApprovalRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApproveJpApprovalRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApproveJpApprovalRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonOkSuccessfullyApproveJpApprovalRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkSuccessfullyApproveJpApprovalRkpd.click();
        Thread.sleep(2000);

        //Partner Approval RKPD
        MobileElement searchBarListApprovalPartnerRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfSearch"));
        searchBarListApprovalPartnerRkpd.sendKeys("Percobaan 19 februari");
        Thread.sleep(2000);

        MobileElement buttonPartnerApprovalRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
        buttonPartnerApprovalRkpd.click();
        Thread.sleep(2000);

        var action14 = new TouchAction(driver2);
        action14.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApprovePartnerApprovalRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApprovePartnerApprovalRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApprovePartnerApprovalRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApprovePartnerApprovalRkpd.click();

        MobileElement buttonOkSuccessfullyApprovePartnerApprovalRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkSuccessfullyApprovePartnerApprovalRkpd.click();
        Thread.sleep(2000);

        //Create Document Surat Tugas
        MobileElement buttonAddAdministrativeDocumentSuratTugas = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/FloatActionButtonDocumentAdmin"));
        buttonAddAdministrativeDocumentSuratTugas.click();
        Thread.sleep(2000);

        MobileElement dropdownAdministrativeDocument = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        dropdownAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement selectAdministrativeDocumentSuratTugas = driver2.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView"));
        selectAdministrativeDocumentSuratTugas.click();
        Thread.sleep(2000);

        MobileElement buttonNextCreateAdministrativeDocumentSuratTugas = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextCreateAdministrativeDocumentSuratTugas.click();
        Thread.sleep(2000);

        MobileElement buttonSelectIdRkpdSuratTugas = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetRKPD"));
        buttonSelectIdRkpdSuratTugas.click();
        Thread.sleep(2000);

        MobileElement selectIdRkpdSuratTugas = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardRKPD0"));
        selectIdRkpdSuratTugas.click();
        Thread.sleep(2000);

        var action15 = new TouchAction(driver2);
        action15.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement checklistHotelEstimatedExpendituresSuratTugas = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.CheckBox"));
        checklistHotelEstimatedExpendituresSuratTugas.click();
        Thread.sleep(2000);

        MobileElement buttonSaveCreateSuratTugas = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveCreateSuratTugas.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveCreateSuratTugas = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveCreateSuratTugas.click();
        Thread.sleep(2000);

        MobileElement buttonCancelDownloadSuratTugas = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btDismiss"));
        buttonCancelDownloadSuratTugas.click();
        Thread.sleep(2000);

        //Create Document LKPD
        MobileElement buttonAddAdministrativeDocumentLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/FloatActionButtonDocumentAdmin"));
        buttonAddAdministrativeDocumentLkpd.click();
        Thread.sleep(2000);

        MobileElement dropdownAdministrativeDocumentLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        dropdownAdministrativeDocumentLkpd.click();
        Thread.sleep(2000);

        MobileElement selectAdministrativeDocumentLkpd = driver2.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.TextView"));
        selectAdministrativeDocumentLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonNextCreateAdministrativeDocumentLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextCreateAdministrativeDocumentLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonSelectIdStLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetST"));
        buttonSelectIdStLkpd.click();
        Thread.sleep(2000);

        MobileElement selectIdStLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSuratTugas0"));
        selectIdStLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonChooseActivityMemberOnDuty1 = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSheetActivity0"));
        buttonChooseActivityMemberOnDuty1.click();
        Thread.sleep(2000);

        MobileElement chooseActivityMemberOnDuty1 = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTask0"));
        chooseActivityMemberOnDuty1.click();
        Thread.sleep(2000);

        MobileElement buttonChooseActivityMemberOnDuty2 = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSheetActivity1"));
        buttonChooseActivityMemberOnDuty2.click();
        Thread.sleep(2000);

        MobileElement chooseActivityMemberOnDuty2 = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTask2"));
        chooseActivityMemberOnDuty2.click();
        Thread.sleep(2000);

        var action16 = new TouchAction(driver2);
        action16.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonSaveCreateLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveCreateLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveCreateLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveCreateLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonCancelDownloadLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btDismiss"));
        buttonCancelDownloadLkpd.click();
        Thread.sleep(2000);

        //JP Approval LKPD
        MobileElement buttonFilterAdministrativeDocument = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[1]"));
        buttonFilterAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement dropdownFilterAdministrativeDocument = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/ddTypeDocument"));
        dropdownFilterAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement selectLkpdFilterAdministrativeDocument = driver2.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]"));
        selectLkpdFilterAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement buttonNextFilterAdministrativeDocument = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextFilterAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement buttonJpApprovalLkpd = driver2.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button"));
        buttonJpApprovalLkpd.click();
        Thread.sleep(2000);

        var action17 = new TouchAction(driver2);
        action17.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApproveJpApprovalLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApproveJpApprovalLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApproveJpApprovalLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApproveJpApprovalLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonOkSuccessfullyApproveJpApprovalLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkSuccessfullyApproveJpApprovalLkpd.click();
        Thread.sleep(2000);

        //Partner Approval LKPD
        MobileElement searchBarListApprovalPartnerLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfSearch"));
        searchBarListApprovalPartnerLkpd.sendKeys("Lorem ipsum");
        Thread.sleep(2000);

        MobileElement buttonPartnerApprovalLkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.Button"));
        buttonPartnerApprovalLkpd.click();
        Thread.sleep(2000);

        var action18 = new TouchAction(driver2);
        action18.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApprovePartnerApprovalLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApprovePartnerApprovalLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApprovePartnerApprovalLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApprovePartnerApprovalLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonOkSuccessfullyApprovePartnerApprovalLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkSuccessfullyApprovePartnerApprovalLkpd.click();
        Thread.sleep(2000);

        //Create Document Reimbursement RKPD
        MobileElement buttonAddAdministrativeDocumentReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/FloatActionButtonDocumentAdmin"));
        buttonAddAdministrativeDocumentReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement dropdownAdministrativeDocumentReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        dropdownAdministrativeDocumentReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement selectAdministrativeDocumentReimbursementRkpd = driver2.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]/android.widget.TextView"));
        selectAdministrativeDocumentReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonNextCreateAdministrativeDocumentReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextCreateAdministrativeDocumentReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonSelectIdLkpdReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetLKPD"));
        buttonSelectIdLkpdReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement selectIdLkpdReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/cardLKPD0"));
        selectIdLkpdReimbursementRkpd.click();
        Thread.sleep(2000);

        var action19 = new TouchAction(driver2);
        action19.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement checklistCourtMoneyEstimatedExpendituresReimbursementRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.CheckBox"));
        checklistCourtMoneyEstimatedExpendituresReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement checklistAllowanceEstimatedExpendituresReimbursementRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.CheckBox"));
        checklistAllowanceEstimatedExpendituresReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonSaveCreateReimbursementLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveCreateReimbursementLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveCreateReimbursementLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveCreateReimbursementLkpd.click();
        Thread.sleep(2000);

        MobileElement buttonCancelDownloadReimbursementLkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btDismiss"));
        buttonCancelDownloadReimbursementLkpd.click();
        Thread.sleep(2000);

        //JP Approval Reimbursement RKPD
        MobileElement buttonFilterAdministrativeDocumentReimbursementRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[1]"));
        buttonFilterAdministrativeDocumentReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement dropdownFilterAdministrativeDocumentReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/ddTypeDocument"));
        dropdownFilterAdministrativeDocumentReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement selectReimbursementRkpdFilterAdministrativeDocument = driver2.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]"));
        selectReimbursementRkpdFilterAdministrativeDocument.click();
        Thread.sleep(2000);

        MobileElement buttonNextFilterAdministrativeDocumentReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextFilterAdministrativeDocumentReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonJpApprovalReimbursementRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonJpApprovalReimbursementRkpd.click();
        Thread.sleep(2000);

        var action20 = new TouchAction(driver2);
        action20.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApproveJpApprovalReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApproveJpApprovalReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApproveJpApprovalReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApproveJpApprovalReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonOkSuccessfullyApproveJpApprovalReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkSuccessfullyApproveJpApprovalReimbursementRkpd.click();
        Thread.sleep(2000);

        //Partner Approval Reimbursement RKPD
        MobileElement searchBarListApprovalPartnerReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/tfSearch"));
        searchBarListApprovalPartnerReimbursementRkpd.sendKeys("agus");
        Thread.sleep(2000);

        MobileElement buttonPartnerApprovalReimbursementRkpd = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonPartnerApprovalReimbursementRkpd.click();
        Thread.sleep(2000);

        var action21 = new TouchAction(driver2);
        action21.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApprovePartnerApprovalReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApprovePartnerApprovalReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmApprovePartnerApprovalReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApprovePartnerApprovalReimbursementRkpd.click();
        Thread.sleep(2000);

        MobileElement buttonOkSuccessfullyApprovePartnerApprovalReimbursementRkpd = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkSuccessfullyApprovePartnerApprovalReimbursementRkpd.click();
        Thread.sleep(2000);

    }
}