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


public class TestAalf1 {

    private AppiumDriver<MobileElement> driver1;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps1 = new DesiredCapabilities();
        caps1.setCapability("deviceName", "Muhammad's S23 Ultra");
        caps1.setCapability("udid", "192.168.99.34:5657");
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
        MobileElement cardOverdueDeadlineTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardOverdue6"));
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

        MobileElement selectHourTimeStartDateProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"11 hours\"]"));
        selectHourTimeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeStartDateProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"15 minutes\"]"));
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

        MobileElement selectHourTimeEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"20 hours\"]"));
        selectHourTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"45 minutes\"]"));
        selectMinuteTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
        buttonConfirmTimeEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        var action3 = new TouchAction(driver1);
        action3.press(PointOption.point(500, 1500))
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

        MobileElement selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue = driver1.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, October 4, 2024 14:53:41, Indonesia, Daerah Khusus Ibukota Jakarta\"]/android.widget.FrameLayout/android.widget.TextView"));
        selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentReportProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentReportProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout/android.widget.LinearLayout"));
        selectDocumentUploadDocumentReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonSubmitProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSubmit"));
        buttonSubmitProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmCompleteTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmCompleteTaskOverdue.click();
        Thread.sleep(6000);

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

        MobileElement selectHandlingCompany = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardCompany1"));
        selectHandlingCompany.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentQuotation = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewDocumentQuotation"));
        buttonUploadDocumentQuotation.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentQuotation = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout"));
        selectDocumentUploadDocumentQuotation.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentConfirmationLetter = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewDocumentConfirmation"));
        buttonUploadDocumentConfirmationLetter.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentConfirmationLetter = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout"));
        selectDocumentUploadDocumentConfirmationLetter.click();
        Thread.sleep(2000);

        MobileElement buttonAddNameOfClient = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardClient1"));
        buttonAddNameOfClient.click();
        Thread.sleep(2000);

        MobileElement inputCaseName = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfCaseName"));
        inputCaseName.sendKeys("Pengetesan Automation mobile");
        Thread.sleep(2000);

        MobileElement chooseTypeOfClient = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        chooseTypeOfClient.click();
        Thread.sleep(2000);

        MobileElement selectTypeOfClient = driver1.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]"));
        selectTypeOfClient.click();
        Thread.sleep(2000);

        var action4 = new TouchAction(driver1);
        action4.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement inputTotalHours = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTotalHours"));
        inputTotalHours.sendKeys("35");
        Thread.sleep(2000);

        MobileElement startPeriodDateCreateHo = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        startPeriodDateCreateHo.click();
        Thread.sleep(2000);

        MobileElement selectStartPeriodDateCreateHo = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[2]/android.widget.Button"));
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

        MobileElement selectNameOfTeam1 = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeamHO2"));
        selectNameOfTeam1.click();
        Thread.sleep(2000);

        MobileElement selectNameOfTeam2 = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeamHO3"));
        selectNameOfTeam2.click();
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

        //Add Task HO
        MobileElement hoCard = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardHO0"));
        hoCard.click();
        Thread.sleep(2000);

        MobileElement buttonAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/FloatActionButtonTaskCreate"));
        buttonAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonNextAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonSelectSowAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSow"));
        buttonSelectSowAddTask.click();
        Thread.sleep(2000);

        MobileElement selectLitigasiSowAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW1"));
        selectLitigasiSowAddTask.click();
        Thread.sleep(2000);

        MobileElement selectPidanaSowAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW6"));
        selectPidanaSowAddTask.click();
        Thread.sleep(2000);

        MobileElement selectKehadiranSidangSowAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW1"));
        selectKehadiranSidangSowAddTask.click();
        Thread.sleep(2000);

        MobileElement selectPembuktianAktifSidangSowAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW2"));
        selectPembuktianAktifSidangSowAddTask.click();
        Thread.sleep(2000);

        MobileElement inputNoteAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfNote"));
        inputNoteAddTask.sendKeys("Pengetesan Automation mobile");
        Thread.sleep(2000);

        MobileElement buttonDateDeadlineAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDate"));
        buttonDateDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement selectDateDeadlineAddTask = driver1.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[31]/android.widget.Button"));
        selectDateDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateDeadlineAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonTimeDeadlineAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTime"));
        buttonTimeDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement selectHourDeadlineAddTask = driver1.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[19]"));
        selectHourDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement selectMinuteDeadlineAddTask = driver1.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View[9]"));
        selectMinuteDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeDeadlineAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeDeadlineAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonUploadTaskPhotoAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btUploadPhoto"));
        buttonUploadTaskPhotoAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonGalleryUploadTaskPhotoAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewGallery"));
        buttonGalleryUploadTaskPhotoAddTask.click();
        Thread.sleep(2000);

        MobileElement selectPhotoUploadTaskPhotoAddTask = driver1.findElement(By.id("com.miui.gallery:id/pick_num_indicator"));
        selectPhotoUploadTaskPhotoAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonUploadTaskDocumentAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadTaskDocumentAddTask.click();
        Thread.sleep(2000);

        MobileElement tabDocumentsUploadTaskDocumentAddTask = driver1.findElement(By.id("com.google.android.documentsui:id/search_chip_group"));
        tabDocumentsUploadTaskDocumentAddTask.click();
        Thread.sleep(2000);

        MobileElement selectDocumentsUploadTaskDocumentAddTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]"));
        selectDocumentsUploadTaskDocumentAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonAddPicAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetTeam"));
        buttonAddPicAddTask.click();
        Thread.sleep(2000);

        MobileElement selectPic1AddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam0"));
        selectPic1AddTask.click();
        Thread.sleep(2000);

        MobileElement selectPic2AddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam3"));
        selectPic2AddTask.click();
        Thread.sleep(2000);

        MobileElement buttonSelectTeamPicAddTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonSelectTeamPicAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonSaveAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveAddTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveAddTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveAddTask.click();
        Thread.sleep(2000);

        //Add Activity
        MobileElement buttonAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/FloatActionButtonTaskCreate"));
        buttonAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonDropdownAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/"));
        buttonDropdownAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonDropdownSelectActivityAddActivity = driver1.findElement(By.xpath("/hierarchy/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.TextView"));
        buttonDropdownSelectActivityAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonNextAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btNext"));
        buttonNextAddActivity.click();
        Thread.sleep(2000);

        MobileElement dateStartDateAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        dateStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectDateStartDateAddActivity = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[6]/android.view.View"));
        selectDateStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartDateAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement timeStartDateAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeStart"));
        timeStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeStartDateAddActivity = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"11 hours\"]"));
        selectHourTimeStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeStartDateAddActivity = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"15 minutes\"]"));
        selectMinuteTimeStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeStartDateAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeStartDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement dateEndDateAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        dateEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectDateEndDateAddActivity = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[27]/android.widget.Button"));
        selectDateEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndDateAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement timeEndDateAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeEnd"));
        timeEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeEndDateAddActivity = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"20 hours\"]"));
        selectHourTimeEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeEndDateAddActivity = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"45 minutes\"]"));
        selectMinuteTimeEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeEndDateAddActivity = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
        buttonConfirmTimeEndDateAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonSelectSowAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSow"));
        buttonSelectSowAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectCorporateSowAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW0"));
        selectCorporateSowAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectDraftingPerjanjianSowAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardSOW0"));
        selectDraftingPerjanjianSowAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonUploadPhotoReportAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btUploadPhoto"));
        buttonUploadPhotoReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonGalleryUploadPhotoReportAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewGallery"));
        buttonGalleryUploadPhotoReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectPhotoUploadPhotoReportAddActivity = driver1.findElement(By.id("com.miui.gallery:id/pick_num_indicator"));
        selectPhotoUploadPhotoReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentReportAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement tabDocumentsUploadDocumentReportAddActivity = driver1.findElement(By.id("com.google.android.documentsui:id/search_chip_group"));
        tabDocumentsUploadDocumentReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectDocumentsUploadDocumentReportAddActivity = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]"));
        selectDocumentsUploadDocumentReportAddActivity.click();
        Thread.sleep(2000);

        MobileElement inputNoteAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfNote"));
        inputNoteAddActivity.sendKeys("Pengetesan Automation mobile");
        Thread.sleep(2000);

        MobileElement buttonAddPicAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewSheetTeam"));
        buttonAddPicAddActivity.click();
        Thread.sleep(2000);

        MobileElement selectPic1AddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam0"));
        selectPic1AddActivity.click();
        Thread.sleep(2000);

        MobileElement selectPic2AddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTeam3"));
        selectPic2AddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonSelectTeamPicAddActivity = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonSelectTeamPicAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonSaveAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveAddActivity.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveAddActivity = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveAddActivity.click();
        Thread.sleep(2000);

        //Edit Task
        MobileElement cardEditTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/cardTask1"));
        cardEditTask.click();
        Thread.sleep(2000);

        MobileElement editInputNoteTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfNote"));
        editInputNoteTask.clear();
        Thread.sleep(2000);
        editInputNoteTask.sendKeys("Edit task Mobile");
        Thread.sleep(2000);

        var action5 = new TouchAction(driver1);
        action5.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonSaveEditTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSave"));
        buttonSaveEditTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmSaveEditTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmSaveEditTask.click();
        Thread.sleep(2000);

        //Proceed The Task
        MobileElement buttonProceedTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonProceedTask.click();
        Thread.sleep(2000);

        MobileElement dateStartDateProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        dateStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectDateStartDateProceedTheTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[24]/android.widget.Button"));
        selectDateStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartDateProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement timeStartDateProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeStart"));
        timeStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeStartDateProceedTheTask = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"11 hours\"]"));
        selectHourTimeStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeStartDateProceedTheTask = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"15 minutes\"]"));
        selectMinuteTimeStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeStartDateProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmTimeStartDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement dateEndDateProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateEnd"));
        dateEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectDateEndDateProceedTheTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[11]/android.widget.TextView[25]/android.widget.Button"));
        selectDateEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndDateProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tbOK"));
        buttonConfirmDateEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement timeEndDateProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfTimeEnd"));
        timeEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectHourTimeEndDateProceedTheTask = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"20 hours\"]"));
        selectHourTimeEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectMinuteTimeEndDateProceedTheTask = driver1.findElement(By.xpath("//android.view.View[@content-desc=\"45 minutes\"]"));
        selectMinuteTimeEndDateProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmTimeEndDateProceedTheTask= driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
        buttonConfirmTimeEndDateProceedTheTask.click();
        Thread.sleep(2000);

        var action6 = new TouchAction(driver1);
        action6.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonUploadPhotoReportProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btUploadPhoto"));
        buttonUploadPhotoReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonGalleryUploadPhotoReportProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewGallery"));
        buttonGalleryUploadPhotoReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement iconGalleryUploadPhotoReportProceedTheTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/android.widget.GridView/android.widget.LinearLayout[2]/android.widget.ImageView"));
        iconGalleryUploadPhotoReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectFolderGalleryUploadPhotoReportProceedTheTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]"));
        selectFolderGalleryUploadPhotoReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectPhotoUploadPhotoReportProceedTheTask= driver1.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Photo taken on Dec 6, 2024 16:29\"]"));
        selectPhotoUploadPhotoReportProceedTheTask.click();
        Thread.sleep(3000);

        MobileElement buttonUploadDocumentReportProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectTabDocumentUploadDocumentReportProceedTheTask= driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[4]"));
        selectTabDocumentUploadDocumentReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentReportProceedTheTask= driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        selectDocumentUploadDocumentReportProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonSubmitProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btSubmit"));
        buttonSubmitProceedTheTask.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmProceedTheTask.click();
        Thread.sleep(6000);

        Thread.sleep(2000);

        MobileElement buttonOkProceedTheTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonOkProceedTheTask.click();
        Thread.sleep(2000);

        //JP Approval Task
        MobileElement tabListApprovalTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewApproval"));
        tabListApprovalTask.click();
        Thread.sleep(6000);

        MobileElement buttonJpApprovalTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"));
        buttonJpApprovalTask.click();
        Thread.sleep(6000);

        var action7 = new TouchAction(driver1);
        action7.press(PointOption.point(500, 1500))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 300))
                .release()
                .perform();

        MobileElement buttonApproveJpApprovalTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btApprove"));
        buttonApproveJpApprovalTask.click();
        Thread.sleep(6000);

        MobileElement buttonConfirmApproveJpApprovalTask = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmApproveJpApprovalTask.click();
        Thread.sleep(6000);
    }
}