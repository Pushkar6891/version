####API
http://localhost:8080/test/message?user=Pushkar

####springbootapptest : cucumber report generation and jacoco report generation
clean install verify site -Pintegration-test

####springbootmultimoduleparent : cucumber report generation and jacoco report generation
clean install verify site -Pintegration-test

####Arguments:
-DCUCUMBER_PUBLISH_ENABLED=true

####Link
https://www.baeldung.com/maven-integration-test
https://github.com/eugenp/tutorials/blob/master/maven-modules/maven-integration-test/pom.xml
https://github.com/johan974/spring_unittest_or_integrationtest_findbugs_jacoco
https://www.youtube.com/watch?v=Sw-PyulH1Jg
https://github.com/chargeahead?tab=repositories

####Main Parent Project
mvn clean package -Pfailsafe

####Run Integration Test : reports/cucumber-reports
mvn verify -Pfailsafe

####Jacoco Code Coverage Report : ${project.build.directory}/coverage-reports/jacoco
Step 1 : clean install -Pdev -Pintegration-test or mvn clean install
Step 2 : verify
Step 3 : site

### Surefire Findbugs Jacoco

This simple Maven/Java project with only 1 Domain class shows the basic features for testing and code quality. 
The following plugins are used: 
* Surefire and Failsafe - Unit or Integration testing
* Findbugs - Code inspector
* Jacoco - Test coverage

Results: 
* Scenario 1: 
  * mvn clean install -Pdev               ==> performs the unit test
  * mvn site                              ==> test coverage ... of 30%
* Scenario 2: 
  * mvn clean install -Pintegration       ==> performs the INTEGRATION test
  * mvn site                              ==> test coverage ... of 60%
  
Where are the Jacoco results? 
After testing and running 'mvn clean', you can find the results in 'target/site/jacoco/index.html'. Open this file in the browser.

