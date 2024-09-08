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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://medium.com/')

WebUI.click(findTestObject('Object Repository/Page_Medium Read and write stories/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Medium Read and write stories/a_Sign in with X'))

WebUI.setText(findTestObject('Object Repository/Page_Twitter  Authorize an application/input_Log in to Twitter_sessionusername_or_email'), 
    'rakhacimano')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Twitter  Authorize an application/input_Log in to Twitter_sessionpassword'), 
    '/8PG73wC/EaRPSXmU+0koQ==')

WebUI.click(findTestObject('Object Repository/Page_Twitter  Authorize an application/input_Sign in to Medium using your account_allow'))

WebUI.click(findTestObject('Object Repository/Page_Medium/div_Write'))

WebUI.setText(findTestObject('Object Repository/Page_New story  Medium/div_Publish_editor_7'), 'Understanding Grid in Web Design: A Key to Creating Structured and Balanced Layouts')

WebUI.setText(findTestObject('Object Repository/Page_New story  Medium/span_Tell your story'), 'In the world of web design, a grid system plays a crucial role in organizing content and maintaining a structured visual flow. By offering a consistent framework for designers, grids ensure that elements are placed harmoniously on the page, enhancing both the aesthetic appeal and functionality of a website. This article delves into the importance of the grid in web design, how it works, and its benefits for creating a seamless user experience.\n\nWhat is a Grid in Web Design?\nA grid is a system of intersecting horizontal and vertical lines that help designers arrange and align content on a webpage. It serves as a visual guide to position text, images, buttons, and other UI elements in a way that feels balanced and coherent. These grids can vary in complexity, from simple column layouts to more intricate modular grids that divide the page into multiple rows and columns.\n\nGrids are particularly effective in responsive design, where content needs to be displayed consistently across devices of different sizes. By using a flexible grid system, designers can ensure that the website looks structured whether it\'s viewed on a desktop, tablet, or mobile device.\n\nTypes of Grid Systems\nThere are several grid systems used in web design, each offering a different level of control and flexibility:\n\nColumn Grids Column grids are one of the most widely used grid systems. They divide the page into vertical sections, or columns, with equal spacing between them, called gutters. This layout is ideal for arranging text-heavy content, as it allows designers to align paragraphs, images, and other elements with precision.\n\nModular Grids A modular grid divides the page into both rows and columns, creating a more complex structure for organizing content. This type of grid is commonly used for web pages that require a lot of visual elements or data, such as e-commerce websites or portfolio pages. The modular approach allows for greater flexibility and creativity while maintaining alignment.\n\nHierarchical Grids Hierarchical grids are less structured than column or modular grids, providing more freedom for placing elements in a way that aligns with the content\'s importance. This type of grid allows designers to highlight key sections of the page, such as headlines or feature images, while keeping other elements neatly aligned.\n\nBaseline Grids A baseline grid focuses on maintaining consistent vertical spacing, particularly in typography. It helps ensure that the text across different sections of a page aligns properly, giving the content a unified appearance. This grid system is essential for improving readability and enhancing the user experience.\n\nHow to Implement a Grid in Web Design\nImplementing a grid in web design is simpler than it might seem, especially with the rise of CSS Grid Layout, a powerful layout system in modern web development. Here are a few basic steps to get started:\n\nDefine Your Columns and Gutters Decide how many columns you want on your page and the width of the gutters between them. A common choice for web design is a 12-column grid, as it offers flexibility for various screen sizes.\n\nUse CSS Grid or Flexbox Both CSS Grid and Flexbox are layout models that help designers create responsive grids. CSS Grid is a two-dimensional layout system perfect for building grids with both rows and columns, while Flexbox excels at organizing items in a single direction, either row or column.\n\nCreate Responsive Grids To make your grid responsive, use media queries to adjust the number of columns and the width of gutters based on the screen size. For example, you might have a 12-column grid for desktop but reduce it to a 4-column grid for mobile devices.\n\nAlign Content Consistently Once your grid is set up, ensure that all elements, such as images, text, and buttons, are aligned according to the grid lines. This will create a cohesive design that feels balanced and structured, no matter the complexity of the content.\n\nBenefits of Using a Grid in Web Design\nConsistency and Alignment The grid system promotes visual consistency throughout a website. By aligning elements along grid lines, designers can create layouts that feel organized and aesthetically pleasing. This consistency is essential for user experience, as visitors can easily navigate and understand the structure of the page.\n\nResponsive Design Grids make it easier to implement responsive design, ensuring that content is displayed properly across different devices. With a flexible grid system, you can adjust the number of columns or the layout without sacrificing the overall structure and flow of the content.\n\nImproved Readability Proper use of a grid system enhances readability by ensuring that text and other content are well-spaced and aligned. This is especially important for websites with a lot of textual information, as clear alignment and structure make it easier for users to follow the content.\n\nFaster Design Process Grids streamline the design process by providing a predefined structure. Designers can place elements within the grid without worrying about alignment, spacing, or proportions. This not only saves time but also ensures a high-quality, professional design.\n\nVisual Harmony The grid system contributes to the overall visual harmony of the website. When all elements are aligned and spaced correctly, the layout feels balanced, making it more appealing to users. A visually harmonious design often leads to better user engagement and retention.\n\nConclusion\nA grid system is an indispensable tool in web design, offering structure, balance, and consistency to layouts. Whether you\'re building a simple blog or a complex e-commerce platform, grids help create a cohesive user experience by ensuring that content is aligned and easy to navigate. With modern tools like CSS Grid and Flexbox, implementing grids has become more accessible, allowing designers to create flexible, responsive layouts that look great on any device.\n\nIncorporating grids into your web design process can elevate your projects, making them more user-friendly and visually appealing. By mastering grid systems, you’ll be able to craft designs that are not only functional but also aesthetically harmonious—ultimately leading to a more satisfying user experience.')

WebUI.click(findTestObject('Object Repository/Page_New story  Medium/button_Publish'))

WebUI.click(findTestObject('Object Repository/Page_New story  Medium/button_Publish now'))

