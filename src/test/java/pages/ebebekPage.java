package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ebebekPage {

    public ebebekPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//img[@class='ins-close-button-c2703']")
        public WebElement notificationText;


    @FindBy(xpath = "//input[@id='txtSearchBox']")
    public WebElement searchBox;

    @FindBy(xpath = "//h2[@class='product-item__brand']")
    public WebElement ilkUrun;

    @FindBy(xpath = "//button[@id='addToCartBtn']")
    public WebElement addToCart;

    @FindBy(xpath = "//a[text()='Sepeti Gör']")
    public WebElement seeTheCart;

    @FindBy(xpath = "//div[@class='basket-product-item']")
    public WebElement productInTheCart;

}

