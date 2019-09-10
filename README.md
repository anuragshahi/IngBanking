# Tech Banking
A simple end to end banking application using latest technology stack


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
