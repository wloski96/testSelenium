Scenario: CheckBoxStory
Given The firefox is automatically launched
When We go to the site http://www.seleniumeasy.com/test/basic-checkbox-demo.html
Then We click on the checkbox
Then It should be checked $result
Then Close the firefox