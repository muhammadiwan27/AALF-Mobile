package com.morfotech;

import java.net.MalformedURLException;
import java.net.URL;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestAalf {
    AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Muhammad's S23 Ultra");
        dc.setCapability("udid", "192.168.99.89:5037");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.morfo.sipandaunik_dev");
        dc.setCapability("appActivity", "com.morfo.sipandaunik.MainActivity");
        dc.setCapability("automationName", "uiautomator2");
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(url, dc);
    }

    @Test
    public void cekLogin() throws InterruptedException {


        //Login Valid
        MobileElement inputEmail =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/tfEmailLogin"));
        inputEmail.sendKeys("go");
        Thread.sleep(1000);

        MobileElement inputPassword =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputPassword.sendKeys("go");
        Thread.sleep(1000);

        MobileElement buttonLogin =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonLogin.click();
        Thread.sleep(1000);

        //Login invalid
        MobileElement navbarOther = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.widget.TextView");
        navbarOther.click();
        Thread.sleep(1000);

        MobileElement buttonLogout = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button");
        buttonLogout.click();
        Thread.sleep(1000);

        MobileElement buttonConfirmLogout = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        buttonConfirmLogout.click();
        Thread.sleep(1000);

        MobileElement inputInvalidPassword =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputInvalidPassword.sendKeys("samudra");
        Thread.sleep(1000);

        MobileElement buttonInvalidLogin =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonInvalidLogin.click();
        Thread.sleep(1000);

        //Tab Dashboard Employee
        MobileElement clearInvalidPassword =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        clearInvalidPassword.clear();
        Thread.sleep(1000);

        MobileElement inputValidPassword =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/tfPasswordLogin"));
        inputValidPassword.sendKeys("go");
        Thread.sleep(1000);

        MobileElement buttonLoginValid =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/btLogin"));
        buttonLoginValid.click();
        Thread.sleep(1000);

        MobileElement tabDashboardEmployee =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTabs1"));
        tabDashboardEmployee.click();
        Thread.sleep(1000);

        //Tab Dashboard HO
        MobileElement tabDashboardHo =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTabs0"));
        tabDashboardHo.click();
        Thread.sleep(1000);

        //Tab Total HO Dashboard HO
        MobileElement tabTotalHoDashboardHo =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/viewTotalHO"));
        tabTotalHoDashboardHo.click();
        Thread.sleep(1000);

        //Tab HO On Progress Dashboard HO
        MobileElement buttonBackListTotalHo = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListTotalHo.click();
        Thread.sleep(1000);

        MobileElement tabHoOnProgress =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/viewProgressHO"));
        tabHoOnProgress.click();
        Thread.sleep(1000);

        //Tab HO Completed Dashboard HO
        MobileElement buttonBackListOnProgressHo = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListOnProgressHo.click();
        Thread.sleep(1000);

        MobileElement tabHoCompleted =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/viewCompletedHO"));
        tabHoCompleted.click();
        Thread.sleep(1000);

        //Tab Total Task Dashboard HO
        MobileElement buttonBackListCompletedHo = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListCompletedHo.click();
        Thread.sleep(1000);

        MobileElement tabTotalTask =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTotalTask"));
        tabTotalTask.click();
        Thread.sleep(1000);

        //Tab Task Has Not Proceeded Dashboard HO
        MobileElement buttonBackListTotalTask = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListTotalTask.click();
        Thread.sleep(1000);

        MobileElement tabTaskHasNotProceeded =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedProceedTask"));
        tabTaskHasNotProceeded.click();
        Thread.sleep(1000);

        //Tab Task Need Approval JP Dashboard HO
        MobileElement buttonBackListNotProceededTask = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListNotProceededTask.click();
        Thread.sleep(1000);

        MobileElement tabTaskNeedApprovalJp =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalJPTask"));
        tabTaskNeedApprovalJp.click();
        Thread.sleep(1000);

        //Tab Task Need Approval Partner Dashboard HO
        MobileElement buttonBackListNeedApprovalJpTask = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListNeedApprovalJpTask.click();
        Thread.sleep(1000);

        MobileElement tabTaskNeedApprovalPartner =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalPartnerTask"));
        tabTaskNeedApprovalPartner.click();
        Thread.sleep(1000);

        //Tab Task Finished Dashboard HO
        MobileElement buttonBackListNeedApprovalPartnerTask = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListNeedApprovalPartnerTask.click();
        Thread.sleep(1000);

        MobileElement tabTaskFinished =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtFinishedTask"));
        tabTaskFinished.click();
        Thread.sleep(1000);

        //Tab Total Activity Dashboard HO
        MobileElement buttonBackListFinishedTask = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListFinishedTask.click();
        Thread.sleep(1000);

        MobileElement tabTotalActivity =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtTotalActivity"));
        tabTotalActivity.click();
        Thread.sleep(1000);

        //Tab Activity Need Revision Dashboard HO
        MobileElement buttonBackListTotalActivity = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListTotalActivity.click();
        Thread.sleep(1000);

        MobileElement tabActivityNeedRevision =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedRevisionActivity"));
        tabActivityNeedRevision.click();
        Thread.sleep(1000);

        //Tab Activity Need Approval JP Dashboard HO
        MobileElement buttonBackListNeedRevisionActivity = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListNeedRevisionActivity.click();
        Thread.sleep(1000);

        MobileElement tabActivityNeedApprovalJp =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalJPActivity"));
        tabActivityNeedApprovalJp.click();
        Thread.sleep(1000);

        //Tab Activity Need Approval Partner Dashboard HO
        MobileElement buttonBackListNeedApprovalJpActivity = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListNeedApprovalJpActivity.click();
        Thread.sleep(1000);

        MobileElement tabActivityNeedApprovalPartner =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtNeedApprovalPartnerActivity"));
        tabActivityNeedApprovalPartner.click();
        Thread.sleep(1000);

        //Tab Activity Finished Dashboard HO
        MobileElement buttonBackListNeedApprovalPartnerActivity = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListNeedApprovalPartnerActivity.click();
        Thread.sleep(1000);

        MobileElement tabActivityFinished =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtFinishedActivity"));
        tabActivityFinished.click();
        Thread.sleep(1000);

        //List Overdue Deadline Task Dashboard HO
        MobileElement buttonBackListFinishedActivity = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
        buttonBackListFinishedActivity.click();
        Thread.sleep(1000);

        MobileElement listOverdueDeadline =driver.findElement(By.id("com.morfo.sipandaunik_dev:id/txtSeeAllOverdue"));
        listOverdueDeadline.click();
        Thread.sleep(1000);

        //Proceed Overdue Deadline Task Dashboard HO
        MobileElement cardOverdueDeadlineTask =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.TextView[1]"));
        cardOverdueDeadlineTask.click();
        Thread.sleep(1000);
    }
}