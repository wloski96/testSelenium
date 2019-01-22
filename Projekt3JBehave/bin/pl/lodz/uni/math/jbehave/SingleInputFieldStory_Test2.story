Scenario: BasicFirstForm
Given Firefox is automatically launched a second time
When We go to the site http://www.seleniumeasy.com/test/basic-first-form-demo.html
Then We click on the TextBox
Then We should see $result
Then We enter the message $text
When We click on show button
Then At the end we should see $result2
Then Close the firefox 2