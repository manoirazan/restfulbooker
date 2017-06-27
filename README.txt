Requirements:
Java JRE
Maven

Run all tests using Maven by typing the following on the command line:

mvn clean verify serenity:aggregate -Dwebdriver.driver=chrome


WebDriver: The test is setup to run on Chrome browser, 
therefore chrome driver must be located in the same location specified in "serenity.properties" 
in the root of the test repository. If chrome driver location is different, update serenity.properties. 