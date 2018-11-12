package com.sparta.jas;

import com.sparta.jas.bbcSite.BbcSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TECH-W92\\Documents\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        BbcSite bbcSite = new BbcSite(chromeDriver);

        bbcSite.getBbcLoginPage().goToLoginPage();
        bbcSite.getBbcLoginPage().typeUsername("test@email.com");
        bbcSite.getBbcLoginPage().typePassword("Hell0_Th3r3");
        bbcSite.getBbcLoginPage().clickSubmitButton();
        System.out.println(bbcSite.getBbcLoginPage().getPasswordErrorText());

//        bbcSite.bbcHomePage().goToHomepage();
//        bbcSite.bbcHomePage().clickSignInLink();
    }
}
