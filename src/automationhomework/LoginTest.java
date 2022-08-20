package automationhomework;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String BaseUrl = "http://automationexercise.com";


    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);

    }

    @Test
    public void LoginUserwithCorrectEmailandPassword()
    {

        // 3.Verify that home page is visible successfully
        WebElement VerifyText = driver.findElement(By.xpath("//header[@id='header']"));
        String actualText = VerifyText.getText();
        String expectedText = "Home\n" +
                "\uE8F8 Products\n" +
                "Cart\n" +
                "Signup / Login\n" +
                "Test Cases\n" +
                "API Testing\n" +
                "Video Tutorials\n" +
                "Contact us";
        Assert.assertEquals(expectedText,actualText);
        //4. Click on 'Signup / Login' button
        WebElement ClickLogin =driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        ClickLogin.click();

        //5. Verify 'Login to your account' is visible

        WebElement VerifyText3 = driver.findElement(By.xpath("//div[@class='login-form']"));
        String actualText1 = VerifyText3.getText();
        String expectedText1 = "Login to your account";
        Assert.assertEquals(expectedText,actualText);

        //6. Enter correct email address and password
        WebElement username = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        username.sendKeys("test1we23@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        password.sendKeys("test1234");

        //7. Click 'login' button
        WebElement ClickLogin1 = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        ClickLogin1.click();

        //8. Verify that 'Logged in as username' is visible
        /* WebElement VerifyText2 = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        String actualText2 = VerifyText2.getText();
        String expectedText2 = "Email Address";
        Assert.assertEquals(expectedText,actualText); */

        //9. Click 'Delete Account' button
        WebElement deleteClick = driver.findElement(By.xpath("//i[@class='fa fa-trash-o']"));
        deleteClick.click();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        /* WebElement VerifyText4 = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']"));
        String actualText4 = VerifyText4.getText();
        String expectedText4 = " Logout";
        Assert.assertEquals(expectedText,actualText);*/

    }

    @Test
    public void LoginUserWithIncorrectEmailandPassword()
    {

        //3. Verify that home page is visible successfully
        WebElement VerifyText = driver.findElement(By.xpath("//header[@id='header']"));
        String actualText = VerifyText.getText();
        String expectedText = "Home\n" +
                "\uE8F8 Products\n" +
                "Cart\n" +
                "Signup / Login\n" +
                "Test Cases\n" +
                "API Testing\n" +
                "Video Tutorials\n" +
                "Contact us";
        Assert.assertEquals(expectedText,actualText);
        //4. Click on 'Signup / Login' button
        WebElement ClickLogin =driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        ClickLogin.click();

        //5. Verify 'Login to your account' is visible

        WebElement VerifyText3 = driver.findElement(By.xpath("//div[@class='login-form']"));
        String actualText1 = VerifyText3.getText();
        String expectedText1 = "Login to your account";
        Assert.assertEquals(expectedText,actualText);
        //6. Enter incorrect email address and password
        WebElement username = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        username.sendKeys("test12we23@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        password.sendKeys("test123456");

        //7. Click 'login' button
        WebElement ClickLogin1 = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        ClickLogin1.click();

        //8. Verify error 'Your email or password is incorrect!' is visible
        WebElement VerifyText5 = driver.findElement(By.xpath("//p[@style='color: red;']"));
        String actualText5 = VerifyText5.getText();
        String expectedText5 = "Your email or password is incorrect!";
        Assert.assertEquals(expectedText,actualText);


    }

    @Test
    public void LogoutUser()
    {
        //3. Verify that home page is visible successfully
        WebElement VerifyText = driver.findElement(By.xpath("//header[@id='header']"));
        String actualText = VerifyText.getText();
        String expectedText = "Home\n" +
                "\uE8F8 Products\n" +
                "Cart\n" +
                "Signup / Login\n" +
                "Test Cases\n" +
                "API Testing\n" +
                "Video Tutorials\n" +
                "Contact us";
        Assert.assertEquals(expectedText,actualText);

        //4. Click on 'Signup / Login' button
        WebElement ClickLogin =driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        ClickLogin.click();

        //5. Verify 'Login to your account' is visible

        WebElement VerifyText3 = driver.findElement(By.xpath("//div[@class='login-form']"));
        String actualText1 = VerifyText3.getText();
        String expectedText1 = "Login to your account";
        Assert.assertEquals(expectedText,actualText);

        //6. Enter correct email address and password
        WebElement username = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        username.sendKeys("test1we23@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        password.sendKeys("test1234");

        //7. Click 'login' button
        WebElement ClickLogin1 = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        ClickLogin1.click();

        //8. Verify that 'Logged in as username' is visible
        /* WebElement VerifyText2 = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        String actualText2 = VerifyText2.getText();
        String expectedText2 = "Email Address";
        Assert.assertEquals(expectedText,actualText); */

        //9. Click 'Logout' button
        WebElement Logoutclick = driver.findElement(By.xpath("//a[@href='/logout']"));
        Logoutclick.click();

        //10. Verify that user is navigated to login page
        WebElement VerifyText6 =driver.findElement(By.xpath("//section[@id='form']"));
        String actualText5 = VerifyText6.getText();
        String expectedText5 = "Login to your account\n" +
                "Login\n" +
                "OR\n" +
                "New User Signup!\n" +
                "Signup";
        Assert.assertEquals(expectedText5,actualText5);

    }

    @Test
    public void RegisterUserWithExitingEmail()
    {
        // 3.Verify that home page is visible successfully
        WebElement VerifyText = driver.findElement(By.xpath("//header[@id='header']"));
        String actualText = VerifyText.getText();
        String expectedText = "Home\n" +
                "\uE8F8 Products\n" +
                "Cart\n" +
                "Signup / Login\n" +
                "Test Cases\n" +
                "API Testing\n" +
                "Video Tutorials\n" +
                "Contact us";
        Assert.assertEquals(expectedText,actualText);
        //4. Click on 'Signup / Login' button
        WebElement ClickLogin =driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        ClickLogin.click();

        //5. Verify 'New User Signup!' is visible
        /* WebElement VerifyNewUser = driver.findElement(By.linkText("New User Signup!"));
        String actualTextUser = VerifyNewUser.getText();
        String expectedTextUser = "New User Signup!";
        Assert.assertEquals(expectedTextUser,actualTextUser); */

        //6. Enter name and already registered email address

        WebElement name =driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        name.sendKeys("da");

        WebElement regemail =driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        regemail.sendKeys("test1we23@gmail.com");

        //7. Click 'Signup' button
        WebElement signUp = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        signUp.click();

        //8. Verify error 'Email Address already exist!' is visible

        WebElement VerifyErrorMsg = driver.findElement(By.xpath("//p[@style='color: red;']"));
        String actualTextMsg = VerifyErrorMsg.getText();
        String expectedTextMsg = "Email Address already exist!";
        Assert.assertEquals(expectedTextMsg,actualTextMsg);

    }

    @Test
    public void VerifyTestCasesPage()
    {
        // 3.Verify that home page is visible successfully
        WebElement VerifyText = driver.findElement(By.xpath("//header[@id='header']"));
        String actualText = VerifyText.getText();
        String expectedText = "Home\n" +
                "\uE8F8 Products\n" +
                "Cart\n" +
                "Signup / Login\n" +
                "Test Cases\n" +
                "API Testing\n" +
                "Video Tutorials\n" +
                "Contact us";
        Assert.assertEquals(expectedText,actualText);

        //4. Click on 'Test Cases' button
        WebElement ClickTestCases = driver.findElement(By.xpath("//a[@style='color: orange;']"));
        ClickTestCases.click();

        //5. Verify user is navigated to test cases page successfully
        WebElement NavigateCase = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String actualTextCase = NavigateCase.getText();
        String expectedTextCase = "FEATURES ITEMS";
        Assert.assertEquals(expectedTextCase,actualTextCase);

    }

    @Test
    public void VerifyAllProductsAndProductDetailPage()
    {
        //3. Verify that home page is visible successfully
        WebElement VerifyText = driver.findElement(By.xpath("//header[@id='header']"));
        String actualText = VerifyText.getText();
        String expectedText = "Home\n" +
                "\uE8F8 Products\n" +
                "Cart\n" +
                "Signup / Login\n" +
                "Test Cases\n" +
                "API Testing\n" +
                "Video Tutorials\n" +
                "Contact us";
        Assert.assertEquals(expectedText,actualText);

        //4. Click on 'Products' button
        WebElement Clickproduct = driver.findElement(By.xpath("//a[@href='/products']"));
        Clickproduct.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProducts = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String actualTextCase = allProducts.getText();
        String expectedTextCase = "ALL PRODUCTS";
        Assert.assertEquals(expectedTextCase,actualTextCase);
        //6. The products list is visible
        WebElement allProductsList = driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']"));
        String actualTextList = allProductsList.getText();
        String expectedTextList = "ALL PRODUCTS LIST";
        Assert.assertEquals(expectedTextCase,actualTextCase);
        //7. Click on 'View Product' of first product
       /* WebElement ViewProductClick = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        ViewProductClick.click(); */

        //8. User is landed to product detail page
        /* WebElement detailPage = driver.findElement(By.xpath("//img[@class='newarrival']"));
        String actualTextPage = detailPage.getText();
        String expectedTextPage = "Blue Top";
        Assert.assertEquals(expectedTextPage,actualTextPage); */

        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        /* WebElement AlldetailPage = driver.findElement(By.xpath("//div[@class='product-information']"));
        String actualTextAllPage = AlldetailPage.getText();
        String expectedTextAllPage = "product-information";
        Assert.assertEquals(expectedTextAllPage,actualTextAllPage); */
    }

    @Test
    public void SearchProduct()
    {
        //3. Verify that home page is visible successfully
        WebElement VerifyText = driver.findElement(By.xpath("//header[@id='header']"));
        String actualText = VerifyText.getText();
        String expectedText = "Home\n" +
                "\uE8F8 Products\n" +
                "Cart\n" +
                "Signup / Login\n" +
                "Test Cases\n" +
                "API Testing\n" +
                "Video Tutorials\n" +
                "Contact us";
        Assert.assertEquals(expectedText,actualText);

        //4. Click on 'Products' button
        WebElement Clickproduct = driver.findElement(By.xpath("//a[@href='/products']"));
        Clickproduct.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProducts = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String actualTextCase = allProducts.getText();
        String expectedTextCase = "ALL PRODUCTS";

        //6. Enter product name in search input and click search button
        WebElement SearchProduct = driver.findElement(By.xpath("//input[@id='search_product']"));
        SearchProduct.sendKeys("Blue Top");

        WebElement SearchClick = driver.findElement(By.xpath("//button[@id='submit_search']"));
        SearchClick.click();

        //7. Verify 'SEARCHED PRODUCTS' is visible
        WebElement VerifySerachProduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String actualTextProduct = VerifySerachProduct.getText();
        String expectedTextProduct = "Searched Products";
        Assert.assertEquals(expectedText,actualText);

        //8. Verify all the products related to search are visible
        WebElement VerifyAllProduct = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String actualTextAllProduct = VerifyAllProduct.getText();
        String expectedTextAllProduct = "Searched Products";
        Assert.assertEquals(expectedText,actualText);


    }
    @After
    public void closeBrowser()
    {
        //driver.quit();

    }

}
