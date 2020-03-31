# Java UI Automation Framework using Frameworkium

An out of the box Selenium Webdriver test framework including all the desired capabilites of a test framework (screenshot, logging, browser management, reporting etc). 
Uses [Frameworkium](https://frameworkium.github.io/) under the hood and includes some example tests to get up and running. 

# Prerequisites

[Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)\
[Apache Maven](https://maven.apache.org/)

# Installation

Open in an IDE and all dependencies will be imported or import using maven command line

# Running tests
To run, the entire suite of tests

```
mvn clean verify allure:report -Dbrowser=chrome -Denv=test
```
The above will execute all tests sequentially against the test environment.

Further documentation on runtime args can be viewed on the frameworkium website. 

# Reporting

Out of the box reporting is included using [Allure Reporting](http://allure.qatools.ru/). Once the above command has executed, navigate to target/site and open the file 'allure-maven-plugin.html' in a browser. Again, more docs can be found on frameworkium & allure sites
