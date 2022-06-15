#Author: domala.rahul@mindtree.com

Feature: login_nidmb_ar
 
Scenario Outline: login_nidmb_ar 
    
    Given Browser open
    When  User is in home page
    And user click on the Arabic language hyperlink
    Then  User clicks on login option
    #And  User navigate to popup window
    Then  User clicks on login already registered
    #And  User navigate to login page
    Then Clicks on NationalID & MobileNumber
    And  User enters nationalid as "<nationalid>"
    Then  User enters mobileno as "<mobileno>" 
    And Click in login
    Then  User enter oTP_0 as "<otp_0>"
    Then  User enter oTP_1 as "<otp_1>" 
    Then  User enter oTP_2 as "<otp_2>"
    Then  User enter oTP_3 as "<otp_3>"
    And Clickss on submit
    
#Examples:
#|NationalID|2206104107|
#|MobileNo|533862687|
	Examples:
	|nationalid|mobileno|otp_0|otp_1|otp_2|otp_3|
	|2206104107|533862687|1|1|1|1|