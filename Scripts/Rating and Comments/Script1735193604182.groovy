import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import java.util.Random
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.WebDriver
import java.time.Duration
import org.openqa.selenium.WebDriver
import org.openqa.selenium.JavascriptExecutor

Random random = new Random()

int randomNumber = random.nextInt(1000)

String username = "user$randomNumber"

String email = 'CR7@gmail.com'

String password = '123'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://page-rhythm-front-end.onrender.com')

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/input_login_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/input_login_password'), password)

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/button_Login'))

WebUI.waitForPageLoad(100)
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PageRhythm/list_Bookitem'), 100)

List<WebElement> bookItems = DriverFactory.getWebDriver().findElements(By.xpath("//div[contains(@class, 'home-page-book-list-item')]"))

if (bookItems.size() > 0) {
	println("Tổng số sách hiển thị: " + bookItems.size())
	
	Random rand = new Random()
	int randomIndex = rand.nextInt(bookItems.size())
	WebElement randomBook = bookItems.get(randomIndex)
	
	WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", Arrays.asList(randomBook))
	WebUI.delay(1)
	
	randomBook.click()
	println("Đã chọn quyển sách thứ: " + (randomIndex + 1))
	
} else {
	KeywordUtil.markFailed('Không tìm thấy sách nào trên trang. Dừng Test Case.')
	WebUI.closeBrowser()
	return
}

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon_1'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon_1_2'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon_1_2'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/img_Write a comment_star-icon_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/button_Write a comment'))

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/textarea_f'), 'f')

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/button_Submit'))

WebUI.closeBrowser()


//WebUI.delay(3)
//
//List<WebElement> comments = DriverFactory.getWebDriver().findElements(By.xpath("//div[contains(@class, 'comment')]"))
//
//// Kiểm tra xem có bình luận nào không
//if (comments.size() > 0) {
//	println("Tổng số bình luận: " + comments.size())
//	
//	// Chọn ngẫu nhiên một bình luận
//	Random rand = new Random()
//	int randomIndex = rand.nextInt(comments.size())
//	WebElement selectedComment = comments.get(randomIndex)
//	
//	WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", Arrays.asList(selectedComment))
//	WebUI.delay(2)
//	
//	WebElement commentContentElement = selectedComment.findElement(By.cssSelector("div.comment-content"))
//    String commentContent = commentContentElement.getText()
//    println("📝 **Nội dung comment được chọn:** " + commentContent)
//	
//	WebDriver driver = DriverFactory.getWebDriver()
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10))
//	
////	WebElement replyButton = wait.until(ExpectedConditions.elementToBeClickable(
////		selectedComment.findElement(By.xpath(".//div[contains(@class, 'comment')]//button[contains(@class, 'book-details-page-reply-button')]"))
////	))
//	
//	WebElement replyButton = selectedComment.findElement(By.xpath(".//button[contains(@class, 'book-details-page-reply-button') and text()='Reply comment']"))
////	WebElement replyButton = selectedComment.findElement(By.xpath(".//div[contains(@class, 'comment')]//button[contains(@class, 'book-details-page-reply-button')]"))
//	WebUI.delay(1)
//	
//	replyButton.click()
//	WebUI.delay(2)
//	WebUI.click(findTestObject('Object Repository/Page_PageRhythm/input_comment'))
//	WebUI.delay(2)
//	WebUI.sendKeys(findTestObject('Object Repository/Page_PageRhythm/input_comment'), 'This is an automated reply!')
//	
////	WebUI.setText(findTestObject('Object Repository/Page_PageRythm/input_comment'), 'This is an automated reply!')
//	WebUI.delay(2)
//	WebUI.click(findTestObject('Object Repository/Page_PageRhythm/button_Submit'))
//	println("Đã gửi bình luận trả lời.")
//	
//} else {
//	println('Không có bình luận nào để trả lời.')
//	WebUI.closeBrowser()
//	return
//}
