Feature: Zoo different sub pages content
  The content of each of the main subsections that are loaded by the NavBar

  Scenario: Validate the title of the Animals Subsection
  
		Given The user opens a Browser and navigates to the Zoo app root URL
		Then Validate that the Welcome Page loads correctly
    When The user clicks on Animals option of the Navigaion Bar
		And The user closes the browser session
     
     
Scenario:  Validate Button that Appears After Delay    
 		Given The user opens a Browser and navigates to the Zoo app root URL
		Then Validate that the Welcome Page loads correctly
		When The user navigates to the Store page from the NavBar
 		Given The user sends constant string 'ABC' to an input box that shows a button after a delay
# implement challenge 2
 		And The user closes the browser session
    
 		