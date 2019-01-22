Scenario: GenerateFileToDownload
Given Firefox is automatically launched a fourth time
When We go to the site http://www.seleniumeasy.com/test/generate-file-to-download-demo.html
Then We click on the text field
Then We enter the text $txt
Then We click on the generate button
Then We click on the download button
When If you see the word Complete, you can download the file
Then Close the firefox 4