package com.morfotech;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestAalf2 {

    private AppiumDriver<MobileElement> driver2;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps2 = new DesiredCapabilities();
        caps2.setCapability("deviceName", "POCO X5 5G");
        caps2.setCapability("udid", "192.168.99.43:5656");
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
        MobileElement navbarOther = driver2.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.widget.TextView");
        navbarOther.click();
        Thread.sleep(2000);

        MobileElement buttonLogout = driver2.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button");
        buttonLogout.click();
        Thread.sleep(2000);

        MobileElement buttonConfirmLogout = driver2.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
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
        MobileElement buttonBackListTotalHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListTotalHo.click();
        Thread.sleep(2000);

        MobileElement tabHoOnProgress = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewProgressHO"));
        tabHoOnProgress.click();
        Thread.sleep(2000);

        //Tab HO Completed Dashboard HO
        MobileElement buttonBackListOnProgressHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListOnProgressHo.click();
        Thread.sleep(2000);

        MobileElement tabHoCompleted = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/viewCompletedHO"));
        tabHoCompleted.click();
        Thread.sleep(2000);

        //Tab Total Task Dashboard HO
        MobileElement buttonBackListCompletedHo = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListCompletedHo.click();
        Thread.sleep(2000);

        MobileElement tabTotalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTotalTask"));
        tabTotalTask.click();
        Thread.sleep(2000);

        //Tab Task Has Not Proceeded Dashboard HO
        MobileElement buttonBackListTotalTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListTotalTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskHasNotProceeded = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedProceedTask"));
        tabTaskHasNotProceeded.click();
        Thread.sleep(2000);

        //Tab Task Need Approval JP Dashboard HO
        MobileElement buttonBackListNotProceededTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListNotProceededTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskNeedApprovalJp = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalJPTask"));
        tabTaskNeedApprovalJp.click();
        Thread.sleep(2000);

        //Tab Task Need Approval Partner Dashboard HO
        MobileElement buttonBackListNeedApprovalJpTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListNeedApprovalJpTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskNeedApprovalPartner = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalPartnerTask"));
        tabTaskNeedApprovalPartner.click();
        Thread.sleep(2000);

        //Tab Task Finished Dashboard HO
        MobileElement buttonBackListNeedApprovalPartnerTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListNeedApprovalPartnerTask.click();
        Thread.sleep(2000);

        MobileElement tabTaskFinished = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtFinishedTask"));
        tabTaskFinished.click();
        Thread.sleep(2000);

        //Tab Total Activity Dashboard HO
        MobileElement buttonBackListFinishedTask = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListFinishedTask.click();
        Thread.sleep(2000);

        MobileElement tabTotalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTotalActivity"));
        tabTotalActivity.click();
        Thread.sleep(2000);

        //Tab Activity Need Revision Dashboard HO
        MobileElement buttonBackListTotalActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListTotalActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedRevision = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedRevisionActivity"));
        tabActivityNeedRevision.click();
        Thread.sleep(2000);

        //Tab Activity Need Approval JP Dashboard HO
        MobileElement buttonBackListNeedRevisionActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListNeedRevisionActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedApprovalJp = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalJPActivity"));
        tabActivityNeedApprovalJp.click();
        Thread.sleep(2000);

        //Tab Activity Need Approval Partner Dashboard HO
        MobileElement buttonBackListNeedApprovalJpActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListNeedApprovalJpActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityNeedApprovalPartner = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalPartnerActivity"));
        tabActivityNeedApprovalPartner.click();
        Thread.sleep(2000);

        //Tab Activity Finished Dashboard HO
        MobileElement buttonBackListNeedApprovalPartnerActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListNeedApprovalPartnerActivity.click();
        Thread.sleep(2000);

        MobileElement tabActivityFinished = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtFinishedActivity"));
        tabActivityFinished.click();
        Thread.sleep(2000);

        //List Overdue Deadline Task Dashboard HO
        MobileElement buttonBackListFinishedActivity = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTitle"));
        buttonBackListFinishedActivity.click();
        Thread.sleep(2000);

        MobileElement listOverdueDeadline = driver2.findElement(By.id("com.morfo.sipandaunik_dev:id/txtSeeAllOverdue"));
        listOverdueDeadline.click();
        Thread.sleep(2000);

        //Proceed Overdue Deadline Task Dashboard HO
        MobileElement cardOverdueDeadlineTask = driver2.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView[1]"));
        cardOverdueDeadlineTask.click();
        Thread.sleep(2000);
    }

}