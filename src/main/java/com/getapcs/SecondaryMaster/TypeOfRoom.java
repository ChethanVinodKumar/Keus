package com.getapcs.SecondaryMaster;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


import com.getapcs.base.Testbase1;
import com.getapcs.home.login.HomePage;

public class TypeOfRoom extends Testbase1 {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	//Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
		@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
		WebElement threeLinesSideBarIcon;
		
		@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
		WebElement master1;
		
		@FindBy(xpath = "(//a[normalize-space()='Type Of Room'])[1]")
		WebElement typeOfRoom;
	
	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createtypeOfRoom;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Type Of Room Name'])[1]")
	WebElement typeOfRoomField;
	
	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;
	
	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;
	
	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;
	
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;
	
	public TypeOfRoom() {
	   
	    PageFactory.initElements(driver, this);
	}
	
	


	public HomePage TypeOfRoomCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub
		
		threeLinesSideBarIcon.click();
		master1.click();
		typeOfRoom.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", createtypeOfRoom);
		
		//1Verifying that  Nature of Relationship Name Text Field is Enabled or not
		boolean isEnabledAuditNatureOFRelationshipField = typeOfRoomField.isEnabled();
		assertTrue(isEnabledAuditNatureOFRelationshipField);
		boolean isDisabledNatureOFRelationshipTextFieldn = !typeOfRoomField.isEnabled(); 
		assertFalse(isDisabledNatureOFRelationshipTextFieldn);
		 
		//Verifying that  Nature of Relationship Name Text Field is displayed or hidden.
		boolean isDisplayedNatureOFRelationshipTextField = typeOfRoomField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipTextField);
		boolean isHiddenNatureOFRelationshipTextField = !typeOfRoomField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipTextField);
		
		//Verifying that  Nature of Relationship Name Text Field is Selected or unselected
		boolean isSelectedNatureOFRelationshipTextField = typeOfRoomField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipTextField);
		boolean isDeselectedNatureOFRelationshipTextField = !typeOfRoomField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipTextField);
		
		//Verifying the Placeholder which is present in  Nature of Relationship Name text field.
		String displayedTextInNatureOFRelationship = typeOfRoomField.getAttribute("placeholder");
		
		String expected_placeholder3 = "Enter Type Of Room Name";
		
		assertEquals(displayedTextInNatureOFRelationship, expected_placeholder3);
		
		//3Verifying that  Nature of Relationship Description Field is Enabled or not
		boolean isEnabledNatureOFRelationshipDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledNatureOFRelationshipDescriptionField);
		boolean isDisabledNatureOFRelationshipDescriptionField = !descriptionTextField.isEnabled(); 
		assertFalse(isDisabledNatureOFRelationshipDescriptionField);
		 
		//Verifying that  Nature of Relationship  Description Field is displayed or hidden.
		boolean isDisplayedNatureOFRelationshipDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipDescriptionField);
		boolean isHiddenNatureOFRelationshipDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipDescriptionField);
			
		//Verifying that  Nature of Relationship  Description Field is Selected or unselected
		boolean isSelectedNatureOFRelationshipDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipDescriptionField);
		boolean isDeselectedNatureOFRelationshipDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipDescriptionField);
		
		//Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");
		
		String expected_placeholder = "Enter Description";
		
		assertEquals(displayedTextInDescription, expected_placeholder);
		
		//3Verifying that  Nature of Relationship Remarks Field is Enabled or not
		boolean isEnabledNatureOFRelationshipRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledNatureOFRelationshipRemarksField);
		boolean isDisabledNatureOFRelationshipRemarksField = !remarksTextField.isEnabled(); 
		assertFalse(isDisabledNatureOFRelationshipRemarksField);
		 
		//Verifying that  Nature of Relationship Remarks Field is displayed or hidden.
		boolean isDisplayedNatureOFRelationshipRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipRemarksField);
		boolean isHiddenNatureOFRelationshipRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipRemarksField);
			
		//Verifying that  Nature of Relationship Remarks Field is Selected or unselected
		boolean isSelectedNatureOFRelationshipRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipRemarksField);
		boolean isDeselectedNatureOFRelationshipRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipRemarksField);
		
		//Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");
		
		String expected_placeholder1 = "Enter Remarks";
		
		assertEquals(displayedTextInRemarks, expected_placeholder1);
		
		//Verifying the HeightSize and Width Size of DescriptionField and RemarksField
		int DescriptionfieldHeightSize = descriptionTextField.getSize().getHeight();
		int DescriptionfieldWidthSize = descriptionTextField.getSize().getWidth();
		
		int RemarksFieldHightSize = remarksTextField.getSize().getHeight();
		int RemarksFieldWidthSize = remarksTextField.getSize().getWidth();
		
		assertEquals(DescriptionfieldHeightSize, RemarksFieldHightSize);
		assertEquals(DescriptionfieldWidthSize, RemarksFieldWidthSize);
		
		//Verifying that Payload Text is displayed or not in Description field.
		
		//6verifying that Save Button is Enabled or disabled.
		boolean isEnabledSaveButton = saveButton.isEnabled();
		assertTrue(isEnabledSaveButton,"SaveButton is enabled");
		boolean isDisabledSaveButton = !saveButton.isEnabled(); 
		assertFalse(isDisabledSaveButton, "SaveButton is not enabled");
		 
		//verifying that Save Button is displayed or hidden.
		boolean isDisplayedSaveButton = saveButton.isDisplayed();
		assertTrue(isDisplayedSaveButton);
		boolean isHiddenSaveButton = !saveButton.isDisplayed();
		assertFalse(isHiddenSaveButton);
		
		typeOfRoomField.clear();
		typeOfRoomField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}
	public HomePage TypeOfRoomEdit( String description, String remarks) {
		// TODO Auto-generated method stub
		
		threeLinesSideBarIcon.click();
		master1.click();
		typeOfRoom.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", editButton);
		
			
		//3Verifying that  Nature of Relationship Description Field is Enabled or not
		boolean isEnabledNatureOFRelationshipDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledNatureOFRelationshipDescriptionField);
		boolean isDisabledNatureOFRelationshipDescriptionField = !descriptionTextField.isEnabled(); 
		assertFalse(isDisabledNatureOFRelationshipDescriptionField);
		 
		//Verifying that  Nature of Relationship  Description Field is displayed or hidden.
		boolean isDisplayedNatureOFRelationshipDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipDescriptionField);
		boolean isHiddenNatureOFRelationshipDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipDescriptionField);
			
		//Verifying that  Nature of Relationship  Description Field is Selected or unselected
		boolean isSelectedNatureOFRelationshipDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipDescriptionField);
		boolean isDeselectedNatureOFRelationshipDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipDescriptionField);
		
		//Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");
		
		String expected_placeholder = "Enter Description";
		
		assertEquals(displayedTextInDescription, expected_placeholder);
		
		//3Verifying that  Nature of Relationship Remarks Field is Enabled or not
		boolean isEnabledNatureOFRelationshipRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledNatureOFRelationshipRemarksField);
		boolean isDisabledNatureOFRelationshipRemarksField = !remarksTextField.isEnabled(); 
		assertFalse(isDisabledNatureOFRelationshipRemarksField);
		 
		//Verifying that  Nature of Relationship Remarks Field is displayed or hidden.
		boolean isDisplayedNatureOFRelationshipRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipRemarksField);
		boolean isHiddenNatureOFRelationshipRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipRemarksField);
			
		//Verifying that  Nature of Relationship Remarks Field is Selected or unselected
		boolean isSelectedNatureOFRelationshipRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipRemarksField);
		boolean isDeselectedNatureOFRelationshipRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipRemarksField);
		
		//Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");
		
		String expected_placeholder1 = "Enter Remarks";
		
		assertEquals(displayedTextInRemarks, expected_placeholder1);
		
		//Verifying the HeightSize and Width Size of DescriptionField and RemarksField
		int DescriptionfieldHeightSize = descriptionTextField.getSize().getHeight();
		int DescriptionfieldWidthSize = descriptionTextField.getSize().getWidth();
		
		int RemarksFieldHightSize = remarksTextField.getSize().getHeight();
		int RemarksFieldWidthSize = remarksTextField.getSize().getWidth();
		
		assertEquals(DescriptionfieldHeightSize, RemarksFieldHightSize);
		assertEquals(DescriptionfieldWidthSize, RemarksFieldWidthSize);
		
		//Verifying that Payload Text is displayed or not in Description field.
		
		//6verifying that Save Button is Enabled or disabled.
		boolean isEnabledSaveButton = saveButton.isEnabled();
		assertTrue(isEnabledSaveButton,"SaveButton is enabled");
		boolean isDisabledSaveButton = !saveButton.isEnabled(); 
		assertFalse(isDisabledSaveButton, "SaveButton is not enabled");
		 
		//verifying that Save Button is displayed or hidden.
		boolean isDisplayedSaveButton = saveButton.isDisplayed();
		assertTrue(isDisplayedSaveButton);
		boolean isHiddenSaveButton = !saveButton.isDisplayed();
		assertFalse(isHiddenSaveButton);
		

		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);
		js.executeScript("arguments[0].click();", yesButton);

		return new HomePage();
	}
}
