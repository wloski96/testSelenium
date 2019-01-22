Scenario: SelectDropDown
Given Firefox is automatically launched a third time
When We go to the site http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html
Then We click on the button
Then We check on the value Monday
Then It should be checked: Day selected :- Monday
Then Close the firefox 3