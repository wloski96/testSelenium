Scenario: RadioButton
Given Firefox is automatically launched a fifth time
When We go to the site http://www.seleniumeasy.com/test/basic-radiobutton-demo.html
Given Find the female button
When When you find, click on it
Then It should be checked Radio button 'Female' is checked
Then Close the firefox 5