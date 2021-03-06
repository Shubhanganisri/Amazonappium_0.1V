package Test.repository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Loginrepository {
		
		
		
		
		public Loginrepository(AndroidDriver<AndroidElement> driver) {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		//methods
		
		@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon")
		private MobileElement sideBar;
		public  MobileElement getSideBar() {
			return sideBar;
		}
		
		@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/sign_in_button")
		private MobileElement signInBtn;
		public  MobileElement getSignInBtn() {
			return signInBtn;
		}
		@AndroidFindBy(id="ap_email_login")
		private MobileElement enterUserId;
		public  MobileElement getEnterUserId() {
			return enterUserId;
		}
		@AndroidFindBy(id="continue")
		private MobileElement continueBtn;
		public  MobileElement getContinueBtn() {
			return continueBtn;
		}
		@AndroidFindBy(id="ap_password")
		private MobileElement enterPassword;
		public  MobileElement getEnterPassword() {
			return enterPassword;
		}
		
		@AndroidFindBy(id="signInSubmit")
		private MobileElement logInBtn;
		public  MobileElement getLogInBtn() {
			return logInBtn;
		}
		
		
	

}
