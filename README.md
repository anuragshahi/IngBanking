# Tech Banking
A simple end to end banking application using latest technology stack


# Design Document

* Tables 

1) Customer 
  * Cust_id number 10
  * FirstName varchar 40
  * Last name varchar 40
  * Address varchar 100
2) Account
  * Acnt_no number 10
  * Cust_id number 10
  * Acnt_code_id number 10
3) AcntCodes
  * Code_id number 10
  * Code_val varchar 40
4) # Login
  * userid number 10
  * password varchar 10
  * customer_id number
  * email varchar50
5) # Transaction
  * Txn_id number 10
  * acnt_id 10
  * crdr_flag (credit 1 debit 2)
  * txn_amt number(10,2)

# Tasks
 * CRUD customer , account , login, acntcodes
 *  Only  Create, read on Transaction
 * Devops - create ci_cd pipe lines, automate tasks
 * Build gui and js validations 


# POC 1 BUILDING A MAVEN PIPELINE PROJECT IN LOCAL
*  Created a Spring Boot Project with github integration in STS.
*  Created a Maven job in jenkins.
*  Added a webhook with ngrok to connect github and local jenkins.
* Configured deployment and tested project on tomcat after packaging.

# POC 2 BUILDING A MAVEN PIPELINE PROJECT ON AWS
* Deployed Jenkins and tomcat on AWS EC2 instance.
* Added webhook with exposed ec2 jenkins link 
* Tested Jenkins running on http://18.217.104.198:8080/
* Tested Tomcat running on http://18.217.104.198:8082/banking/
