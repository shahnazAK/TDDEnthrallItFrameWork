package pages;

import java.io.File;
//import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//we have to manually write it to get access of common Action
import static common.CommonActions.*;
import static common.CommonWaits.*;

import constants.Attribute;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

//WebElement logo of EnthrollIt
	@FindBy(xpath = "(//img[@alt='Enthrall IT'])[1]")
	WebElement logo;

	@FindBy(id = "login-link")
	WebElement logInFromTollber;

	// h2[normalize-space(text()=' Login into your account ') ]
	@FindBy(xpath = "//h2[normalize-space(text()='Login into  your account') ]")
	WebElement headerOfLogin;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userId;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passWordApplication;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement logInButton;
	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement headerOfDashboard;
	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;

	@FindBy(xpath = "//h1[text()='Automation']")
	WebElement headerOfAutomation;
	@FindBy(partialLinkText = "Enroll")
	WebElement enrollNow;

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement fName;
	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement mName;
	@FindBy(xpath = "//input[@id='id_l_name']")
	WebElement lName;
	@FindBy(xpath = "//select[@name='i_am']")
	WebElement iM;
	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> iMList;
	@FindBy(xpath = "//small[@id='i_am_error']")
	WebElement imErrorMassage;
	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']")
	WebElement course;
	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']/option")
	List<WebElement> courseOfList;

	@FindBy(xpath = "//input[@id='id_phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='id_email']")
	WebElement email;
	@FindBy(xpath = "//small[text()='Phone Number must be exactly 10 digits.']")
	WebElement PhoneNumberMustBeExactly10Digits;
	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement gender;
	@FindBy(xpath = "//input[@name='image']")
	WebElement personalImage;
	@FindBy(xpath = "//input[@name='photo_id']")
	WebElement photoId;
	@FindBy(xpath = "//select[@id='id_birth_year']")
	WebElement birthYear;
	@FindBy(xpath = "//select[@id='id_birth_month']")
	WebElement birthMonth;
	@FindBy(xpath = "//select[@id='id_birth_date']")
	WebElement birthDate;
	// input[@name='home_address_line_1']
	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement homeAddres1;
	// input[@name='home_address_line_2']
	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement homeAddres2;
	// input[@name='city']
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(xpath = "//select[@name='state']")
	WebElement state;
	// input[@name='zip_code']
	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCode;
	@FindBy(xpath = "//select[@id='id_immigration_status']")
	WebElement imergencyStatus;
	// input[@id='id_know_us']
	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement HowDidYouKnow;
	// input[@id='id_arrival_date']
	@FindBy(xpath = "//input[@id='id_arrival_date']")
	WebElement dateOfArrival;
	// select[@id='id_highest_education']
	@FindBy(xpath = "//input[@name='emergency_contact']")
	WebElement imergencyContact;
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement higherEducation;

	@FindBy(xpath = "//select[@class='form-control' and @name='country_of_origin']")
	WebElement country;

	@FindBy(xpath = "//select[@class='form-control' and @name='country_of_origin']/option")
	List<WebElement> setOfCountry;
	// input[@id='is_agree']

	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement checkBoxIagree;

	@FindBy(xpath = "//input[@name='sign_by_name']")
	WebElement signature;

	@FindBy(css = "select#id_primary_language")
	WebElement language;
	@FindBy(xpath = "//select[@id='id_primary_language']/option")
	List<WebElement> listOfLanguage;
	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submit;

	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement FirstNameErrorMassage;
	@FindBy(xpath = "//small[@id='f_name_error']")
	WebElement FirstNameMustAlphabeticCharecterErrorMassage;
	// small[@id='f_name_error']
	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lastNameOfErrorMassageLastNameIsARequiredField;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement lNameErrorMustBeAlphabeticCharacters;
	@FindBy(xpath = "//small[@id='i_am_error']")
	WebElement iAmOfErrorMassage;

	@FindBy(xpath = "//small[text()='Course Wish to Enroll is a required field.']")

	WebElement courseOfErrorMassage;

	@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
	WebElement phoneNumberIsARequiredField;

	@FindBy(xpath = "//small[text()='Email Address is a required field.']")
	WebElement emailAddressOfErrorMassage;

	@FindBy(xpath = "//span[text()='Password is a required field.']")
	WebElement passwordOfErrorMassage;

	@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
	WebElement photoIdOfErrorMassage;
	@FindBy(xpath = "//span[text()='Must contain a minimum of 8 characters.']")
	WebElement passWordMustContainAMinimumOf8Characters;
	@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
	WebElement personalImageOfErrorMassage;

	@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
	WebElement birthYearOfErrorMassage;

	@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
	WebElement birthMonthOfErrorMassage;

	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement birthDateOfErrorMassage;

	@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
	WebElement homeAdressOfErrorMassage;

	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement cityOfErrorMassage;

	@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
	WebElement howDidYouKnowOfErrorMassage;

	@FindBy(xpath = "//span[@id='stateerror']")
	WebElement stateOfErrorMassage;

	@FindBy(xpath = "//span[@id='zip_code_error']")
	WebElement zipCodeOfErrorMassage;

	@FindBy(xpath = "//span[text()='Signature is a required field.']")
	WebElement signatureOfErrorMassage;

	@FindBy(xpath = "//a[text()='Back']")
	WebElement backButton;

	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelButton;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;

	public void clickLogInFromTollber() {
		clickElement(logInFromTollber);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
		userId.sendKeys("shhnzaktr@gmail.com");
		pause(4000);
		passWord.sendKeys("Allah@12");
		pause(3000);
		logInButton.click();
		pause(4000);
		automation.click();
		pause(3000);
		clickElement(enrollNow);
		pause(3000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("AllwindowHandles" + allWindowHandles);
		System.err.println("AllwindowHandles" + allWindowHandles);
		// Extract Parent and child window from all window handles
		String parent = (String) allWindowHandles.toArray()[0];
		String child = (String) allWindowHandles.toArray()[1];
		driver.switchTo().window(child);
		pause(3000);
		// switching 1stwindow to 2nd window
//		 for (String eachWin : AllWindowHandles) {
//			System.out.println("eachWin");
		// driver.switchTo().window(eachWin);
//		pause(3000);
//		inputText(fName, "Tasnim");
//		pause(3000);
//		inputText(imergencyContact, "6092332201");
	}

	public void firstNameValidation() {
		pause(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		verifyLengthOfTheFieldContent(fName, Attribute.MAX_LENGTH, "20");
		pause(3000);
		inputTextThenClickTab(fName, "$$^&@$(");
		pause(3000);
		verifyErrorMessageUnderTheField(FirstNameMustAlphabeticCharecterErrorMassage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(fName);
		inputTextThenClickTab(fName, " ");
		verifyErrorMessageUnderTheField(FirstNameErrorMassage, Attribute.INNER_HTML, "First Name is a required field.");
		pause(3000);
		inputTextThenClickTab(fName, "176351245");
		pause(3000);
		clearTextFromTheField(fName);
		verifyErrorMessageUnderTheField(FirstNameMustAlphabeticCharecterErrorMassage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		inputTextThenClickEnter(fName, "Tasnim");
	}

	public void personalImageAndPhotoIdValidation() {
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(5000);
        File file = new File("./image/personalImage.png");
		personalImage.sendKeys(file.getAbsolutePath());
		pause(5000);
		File file01 = new File("./image/photoId.jpg");
		photoId.sendKeys(file01.getAbsolutePath());
		pause(3000);
	}

	public void OppenApplicationPageandClickSubmitButton() {
		pause(3000);
		//driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		pause(3000);
		inputText(fName, "Shahnaz");
		pause(4000);
		inputText(mName, "");
		pause(4000);
		inputText(lName, "Akter");
		// selectElelementFromDropdownOnebyOne(iM, iMList);
		pause(3000);
		selectDropdown(iM, "a Student");
		pause(3000);
		// selectElelementFromDropdownOnebyOne(course, courseOfList);
		pause(300);
		selectDropdown(course, "Python");
		pause(3000);
		inputText(phone, "6092332201");
		pause(3000);
		inputText(email, "shhnzaktr@gmail.com");
		pause(3000);
		inputText(passWordApplication, "Allah@12");
		pause(3000);
		selectDropdown(gender, "Female");
		pause(3000);

		uploadPhotoImage(personalImage, ".\\image\\personal.png");

		pause(3000);
		uploadPhotoImage(photoId, ".\\image\\photoId.png");
		pause(3000);
		selectDropdown(birthYear, "1987");
		pause(3000);
		selectDropdown(birthMonth, "June");
		pause(3000);
		selectDropdown(birthDate, "20");
		pause(3000);
		inputText(homeAddres1, "76 merrell avenue");
		inputTextThenClickEnter(homeAddres2, "");

		inputText(city, "stamford");
		inputText(state, "connecticut");
		inputText(zipCode, "06902");
		inputText(imergencyStatus, "Citizen");
		inputText(dateOfArrival, "2/2/2020");
		inputText(HowDidYouKnow, "Friend");
		selectDropdown(higherEducation, "Other");
		inputText(imergencyContact, "475 746 3104");
		pause(4000);
		selectDropdown(country, "Bangladesh");

		pause(4000);
		selectDropdown(language, "English");
		pause(4000);
		selectElelementFromDropdownOnebyOne(language, listOfLanguage);
		pause(3000);
		selectDropdown(language, "Bengali");
		pause(3000);
		// waitUntilConditionThenClick(driver, submit);
		inputText(signature, "Shahnaz Akter");
		clickElement(checkBoxIagree);
		pause(3000);
		clickElement(submitButton);
	}

	public void clickLogo() {
		logo.click();
	}

	public void sendKeysPassWord() {
		pause(3000);
		logInFromTollber.click();
		pause(3000);
		userId.sendKeys("tasnimchowdhury.qa@gmail.com");
		pause(4000);
		passWord.sendKeys("Darimee2010");
		pause(3000);
		logInButton.click();
	}

	public void clickLogInButton() {
		pause(3000);
		clickElement(logInFromTollber);
		pause(3000);
		elementDisplayed(headerOfLogin);
		validationOfHeader(headerOfLogin, "Login into your account");
		pause(3000);
		elementEnabled(userId);
		inputText(userId, "tasnimchowdhury.qa@gmail.com");
		pause(3000);
		elementEnabled(passWord);
		inputTextThenClickEnter(passWord, "Darimee2010");
		clickElement(logInButton);
	}

	public void logInButtonFromTober() {
		// click logInButtonFromTolber
		driver.findElement(By.cssSelector("input.btn.btn-lg.px-5")).click();
	}

	public void clickAutomation() {

		pause(6000);
		validationOfHeader(headerOfDashboard, "Dashboard");
		automation.click();
		validationOfHeader(headerOfAutomation, "Automation");

	}

	public void applicationOpen() {
		pause(3000);
		clickElement(logInFromTollber);
		pause(3000);
		elementDisplayed(userId);
		inputText(userId, "tasnimchowdhury.qa@gmail.com");
		pause(3000);
		elementDisplayed(passWord);
		inputText(passWord, "Darimee2010");
		pause(2000);
		elementEnabled(logInButton);
		clickElement(logInButton);
		pause(5000);
		// elementEnabled(automation);
		clickElement(automation);
		pause(3000);
		clickElement(enrollNow);
		pause(3000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		// Extract Parent and child window from all window handles
		String parent = (String) allWindowHandles.toArray()[0];
		String child = (String) allWindowHandles.toArray()[1];
		driver.switchTo().window(child);
		pause(3000);
		inputText(fName, "Tasnim");
		pause(3000);
		inputText(imergencyContact, "6092332201");

	}

	public void use_of_explicity_waits() {
		pause(3000);
		waitUntilConditionThenClick(driver, submit);
	}

	public void openApplicationPageClickBackButton() {
		//driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(5000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, submit);
		pause(4000);
		elementEnabled(backButton);
		clickElement(backButton);
		pause(4000);
		// "https://enthrallit.com/accounts/login/?next=/dashboard/");
		// verifyCurrentUrl(driver,
		// "https://enthrallit.com/dashboard/dashboard/automation/");

	}

	public void openApplicationPageClickCancelButton() {
		//driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(4000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, submit);
		clickElement(cancelButton);
		pause(4000);
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/?next=/dashboard/");
	}

	public void enrollmentPageErrorMassa() {
		//driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(5000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, submit);
		pause(4000);
		elementEnabled(submit);
		clickElement(submit);
		verifyErrorMessageUnderTheField(FirstNameErrorMassage, Attribute.INNER_HTML, "First Name is a required field.");
		verifyErrorMessageUnderTheField(lastNameOfErrorMassageLastNameIsARequiredField, Attribute.INNER_HTML,
				"Last Name is a required field.");
		verifyErrorMessageUnderTheField(iAmOfErrorMassage, Attribute.INNER_HTML, "I'm is a required field.");
		verifyErrorMessageUnderTheField(courseOfErrorMassage, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field.");
		verifyErrorMessageUnderTheField(emailAddressOfErrorMassage, Attribute.INNER_HTML,
				"Email Address is a required field.");
		verifyErrorMessageUnderTheField(phoneNumberIsARequiredField, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		verifyErrorMessageUnderTheField(passwordOfErrorMassage, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		verifyErrorMessageUnderTheField(photoIdOfErrorMassage, Attribute.INNER_HTML, "Photo Id is a required field.");
		verifyErrorMessageUnderTheField(personalImageOfErrorMassage, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		verifyErrorMessageUnderTheField(birthMonthOfErrorMassage, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		verifyErrorMessageUnderTheField(birthDateOfErrorMassage, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		verifyErrorMessageUnderTheField(birthYearOfErrorMassage, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		verifyErrorMessageUnderTheField(homeAdressOfErrorMassage, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		verifyErrorMessageUnderTheField(cityOfErrorMassage, Attribute.INNER_HTML, "City is a required field.");
		verifyErrorMessageUnderTheField(stateOfErrorMassage, Attribute.ID, "State is a required field.");
		verifyErrorMessageUnderTheField(zipCodeOfErrorMassage, Attribute.ID, "ZIP Code is a required field.");
		verifyErrorMessageUnderTheField(howDidYouKnowOfErrorMassage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		verifyErrorMessageUnderTheField(signatureOfErrorMassage, Attribute.INNER_HTML,
				"Signature is a required field.");
	}

	public void lastNameValidation() {
		pause(4000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		verifyLengthOfTheFieldContent(lName, Attribute.MAX_LENGTH, "20");
		pause(3000);
		inputTextThenClickTab(lName, "$$^&@$(");
		pause(3000);
		verifyErrorMessageUnderTheField(lNameErrorMustBeAlphabeticCharacters, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(lName);
		inputTextThenClickEnter(lName, " ");
		verifyErrorMessageUnderTheField(lastNameOfErrorMassageLastNameIsARequiredField, Attribute.INNER_HTML,
				"Last Name is a required field.");
		pause(3000);
		inputTextThenClickTab(lName, "23456667");
		pause(3000);
		verifyErrorMessageUnderTheField(lNameErrorMustBeAlphabeticCharacters, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		inputTextThenClickEnter(lName, "Chowdhury");

	}

	public void imValidation() {
		pause(4000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		selectDropdown(iM, "Employed");
		pause(2000);
		selectDropdown(iM, "Select Profession");
		clickElementThenTab(iM);
		pause(3000);
		verifyErrorMessageUnderTheField(iAmOfErrorMassage, Attribute.INNER_HTML, "I'm is a required field.");

		pause(3000);
		selectDropdown(iM, "Employed");
	}

	public void verifyCourseWishToEnroll() {
		pause(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(4000);

		selectElelementFromDropdownOnebyOne(course, courseOfList);
		pause(4000);
		selectDropdown(course, "Python");
		pause(4000);
		selectDropdown(course, "Select Course");

		pause(4000);
		clickElementThenTab(course);
		pause(3000);
		verifyErrorMessageUnderTheField(courseOfErrorMassage, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field.");
		pause(3000);
	}

	public void verifyPhoneNumber() {
		pause(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(4000);
		inputTextThenClickEnter(phone, " ");
		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberIsARequiredField, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		pause(3000);
		inputTextThenClickTab(phone, "0234557899");
		pause(3000);

		verifyErrorMessageUnderTheField(PhoneNumberMustBeExactly10Digits, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		clearTextFromTheField(phone);
		pause(3000);
		inputTextThenClickEnter(phone, "123456");
		pause(3000);
		verifyErrorMessageUnderTheField(PhoneNumberMustBeExactly10Digits, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		pause(3000);
		clearTextFromTheField(phone);
		inputTextThenClickEnter(phone, "!@#$");
		pause(3000);

		verifyErrorMessageUnderTheField(PhoneNumberMustBeExactly10Digits, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
	}

	public void verifyPassword() {
		pause(3000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		pause(3000);
		verifyLengthOfTheFieldContent(passWord, Attribute.MAX_LENGTH, "74");
		pause(3000);
		inputTextThenClickEnter(passWord, " ");
		pause(3000);
		verifyErrorMessageUnderTheField(passwordOfErrorMassage, Attribute.INNER_HTML, "Password is a required field.");
		pause(3000);
		inputTextThenClickEnter(passWord, "asdfg");
		pause(3000);
		clearTextFromTheField(passWord);
		verifyErrorMessageUnderTheField(passWordMustContainAMinimumOf8Characters, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		inputTextThenClickEnter(passWord, "!@#$%$%");
		pause(3000);
		clearTextFromTheField(passWord);
		verifyErrorMessageUnderTheField(passWordMustContainAMinimumOf8Characters, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		pause(3000);
//	inputTextThenClickEnter(passWord, "1234567");
//	pause(3000);
//	clearTextFromTheField(passWord);
//	verifyErrorMessageUnderTheField(passWordMustContainAMinimumOf8Characters, Attribute.INNER_HTML, "Must contain a minimum of 8 characters.");
//	pause(3000);
//	inputTextThenClickEnter(passWord, "123456789");
//	pause(3000);
//	clearTextFromTheField(passWord);
//	verifyErrorMessageUnderTheField(passWordMustContainAMinimumOf8Characters, Attribute.INNER_HTML, "Must contain a minimum of 8 characters.");
//	pause(3000);
//	inputTextThenClickEnter(passWord, "12345678");
//	pause(3000);
//	
	}
}



