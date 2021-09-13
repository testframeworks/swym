### Page Object Model as Architecture for Maven-Selenium Project
- Automation test suite for Swym Web Application

### Key Feature
1. Java 8
2. Maven
3. :fire: [Selnium 4.0 Webdriver]
4. Cross Browser Testing - Chrome & FF
5. [WebDriverManager]

### Setup Project on Machine for work 

- Install Any [IDE]
- Install [java]
- Install [jdk & jre]
- As it is a Maven project, no other dependencies need to download. All the dependencies that required for project is already added


### After setting up IDE & Java on your machine 

- Download and unzip it from https://github.com/testframeworks/swym
- Open IDE
- Import projects pop up will open, select maven
- Browse the project from your local machine.


### Run Project and Get a Report & logs

- Run TestNg.xml file
- wait till project run completly. Once it finished.
- Goto reports and view the  latestreport as per timestamp `report_13-09` being the latest, for updates

### Running test suites from the command line

- CD into the directory containing the test suite for the application you want. `cd com.swym`
- Run `mvn clean test -DsuiteFile=testng.xml`
