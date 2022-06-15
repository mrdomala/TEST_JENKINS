#Author: domala.rahul@mindtree.com

Feature: login_nidmb_en
 
Scenario Outline: login_nidmb_en 
    
    Given Browser opens
    When  User in home pages
    Then  User click on login option
    #And  User navigate to popup window
    Then  User click on login already registered
    #And  User navigate to login page
    Then Click on NationalID & MobileNumber
    And  User enter nationalid as "<nationalid>"
    Then  User enter mobileno as "<mobileno>" 
    And Click login
    Then  User enter otp_0 as "<otp_0>"
    Then  User enter otp_1 as "<otp_1>" 
    Then  User enter otp_2 as "<otp_2>"
    Then  User enter otp_3 as "<otp_3>"
    And Click on submit
    
#Examples:
#|NationalID|2206104107|
#|MobileNo|533862687|
	Examples:
	|nationalid|mobileno|otp_0|otp_1|otp_2|otp_3|
	|2206104107|533862687|1|1|1|1|