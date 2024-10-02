package com.morfotech;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
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

        //Proceed Overdue Deadline Task Dashboard HO
        MobileElement cardOverdueDeadlineTask = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView[1]"));
        cardOverdueDeadlineTask.click();
        Thread.sleep(2000);

        MobileElement dateStartDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/tfDateStart"));
        dateStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDateStartDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[11]/android.widget.TextView[25]/android.widget.Button"));
        selectDateStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateStartDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/TextButtonOK"));
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

        MobileElement buttonConfirmTimeStartDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
        buttonConfirmTimeStartDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement dateEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
        dateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDateEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[11]/android.widget.TextView[28]/android.widget.Button"));
        selectDateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmDateEndDateProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/TextButtonOK"));
        buttonConfirmDateEndDateProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement timeEndDateProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
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

        var action1 = new TouchAction(driver1);
        action1.press(PointOption.point(500, 1500))
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

        MobileElement selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue = driver1.findElement(By.xpath("(//android.widget.FrameLayout[@content-desc=\"Button\"])[1]/android.widget.FrameLayout[1]/android.widget.ImageView"));
        selectPhotoGalleryUploadPhotoReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonUploadDocumentReportProceedTheTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/viewUploadDocument"));
        buttonUploadDocumentReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement selectDocumentUploadDocumentReportProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout"));
        selectDocumentUploadDocumentReportProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonSubmitProceedTheTaskOverdue = driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.Button"));
        buttonSubmitProceedTheTaskOverdue.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmCompleteTaskOverdue = driver1.findElement(By.id("com.morfo.sipandaunik_dev:id/btOk"));
        buttonConfirmCompleteTaskOverdue.click();
        Thread.sleep(2000);
    }
}