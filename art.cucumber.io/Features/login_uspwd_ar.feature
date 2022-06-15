#Author: domala.rahul@mindtree.com

Feature: login_uspwd_ar 
 
Scenario Outline: login_uspwd_ar  
    
  	Given open browser
  	When url is hitted
    And user clicks on the Arabic language hyperlink
    Then  User clicks login option
    #And  User navigate to popup window
    Then  User clicks login on already registered
    #And  User navigate to login page
    And  User enter uname as "<username>"
    Then  User enter pword as "<password>"	
    And Clicks Loginn
    Then  User enters Otp_0 as "<otp_0>"
    Then  User enters Otp_1 as "<otp_1>" 
    Then  User enters Otp_2 as "<otp_2>"
    Then  User enters Otp_3 as "<otp_3>"
    And Click Submit
    
#Examples:
#|UserName|Shaik|
#|Password|Test123456|

    
     Examples:
     |username|password|otp_0|otp_1|otp_2|otp_3|
     |Shaik|Test123456|1|1|1|1|
     
   