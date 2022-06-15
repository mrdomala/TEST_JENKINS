#Author: domala.rahul@mindtree.com

Feature: login_uspwd_en 
 
Scenario Outline: login_uspwd_en  
    
  	Given Browser is open
    When  User in home page
    Then  User click on the login option
    #And  User navigate to popup window
    Then  User click on the login on already registered
    #And  User navigate to login page
    And  User enter username as "<username>"
    Then  User enter password as "<password>"	
    And Click on Login
    Then  User enter OTP_0 as "<otp_0>"
    Then  User enter OTP_1 as "<otp_1>" 
    Then  User enter OTP_2 as "<otp_2>"
    Then  User enter OTP_3 as "<otp_3>"
    And Click on Submit
    
#Examples:
#|UserName|Shaik|
#|Password|Test123456|

    
     Examples:
     |username|password|otp_0|otp_1|otp_2|otp_3|
     |Shaik|Test123456|1|1|1|1|
     
   