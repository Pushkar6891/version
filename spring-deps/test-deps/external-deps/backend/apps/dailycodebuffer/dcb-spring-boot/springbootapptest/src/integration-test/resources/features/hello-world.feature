Feature: Cucumber Hello World Example

 Scenario: Greet User Successfully
    Given user passes a name
    |name|Ram|
    When sayHello method of HelloWorld.java is called
    Then it should return greeting message

   Given When user passes valid username and password
   |username|ganesh|
   |password|welcome|
   When User selects apple iphone from dashboard
   When User adds iphone to cart
   When User checkout is done
   Then Display success purchase message
