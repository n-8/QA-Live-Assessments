# N#8 QA Live Assessments

This project is intended at being an interactive Live Assessment for QA Automators with Interesting Challenges and to Evaluate the Use of Industry Standard QA Automator Techniques.

## Getting Started

This repository is a test project with challenges to give to candidates for the QA Automator role at [Number8](http://number8.com).  It consists of a Behavioral-Driven Delveopment project using Page Object Model (POM) to test the site application for a [Zoo Web App](https://qa.number8.com)

### Prerequisites

An Apple's MAC, Windows's PC, Linux's Computer, or Similar x64 bit processor machine with the instrustry average of CPU, Memory, and Disk Space.

## Installing and Running

These are step by step instructionns on how to get a development environment running.  There ar only two tools you need installed in your box and the last two practically come together and properly integrated (All three tools will be fully deployed and integreted soon asn Eclipse is the most popular Develpment Environment for Java):	
```	
Java Virtual Machine (JVM) version 8 or higher	
Eclipse IDE (MAC, Windows, etc.)	
Maven (Ideally comes integrated with Eclipse IDE)	
```


### Step 1:  Install and test JVM

1. Instal JVM and it's dependencies from it's original [Oracle's Java Download Site](https://www.java.com/download/). 
2. Follow installation insctructions or installation program until the end.
3. Open a MAC's Terminal, Window's Command Pront, or Linux Shell's window and type the following command:

```
    javac
```
4. Validate that this command brings a series of options to your screen

### Step 2:  Install and Run Eclipse IDE

1. Instal Eclipse Integrated Development Environment for Java  and it's dependencies from it's original [Eclipse Foundation's Downoload Site](https://www.eclipse.org/org/foundation/).
2. Follow installation insctructions or installation program ends.
3. Open Eclipse IDE using your most common method for running UI Applications
4. Verify Eclipse IDE runs without problems

### Step 3:  Make sure you can import a and install Maven Project

1. Open Eclipse IDE and select the option to "Import an Existing Project" 

![Start by Importing and Exiting Project](https://github.com/n-8/QA-Live-Assessments/blob/master/readme_images/1_import_existing_maven_project.png)

2. Select the Folder Named "TestZooJavaCandidateNumber8" and once it shows it contents press open 

![Start by Importing and Exiting Project](https://github.com/n-8/QA-Live-Assessments/blob/master/readme_images/2_import_existing_maven_project.png)

3. Make sure that your Project's "pom.xml is recognized and click Finish 

![Make Sure your pom.xml is Selected](https://github.com/n-8/QA-Live-Assessments/blob/master/readme_images/3_import_existing_maven_project.png)

4: Change to TestTheZooJavaCandidateNumber8\jars folder and start a Selnium hub and a Selenium node using the latest stand alone version we've included  (Challenge 0)

Hint: Re recommend you use localhost with a localport such as http://localhost:4444

5. Once imported, Right-Click on the project end execute "Run As->Maven Install"

![Run Maven Install](https://github.com/n-8/QA-Live-Assessments/blob/master/readme_images/5_run_as_maven_install.png)

6. The projects test will execute and it shouldn't matter if their pass or fail as long as a the end you get the MAVEN BUILD message a the end of the Install

![Verify Maven Install](https://github.com/n-8/QA-Live-Assessments/blob/master/readme_images/6_verify_maven_install.png)

## Running the tests (JUnit / Cucumber)

7. You will need JUnit (which installs during Maven Install) to run your tests.  Right click src/test/java/Cucumber.Java.TestTheZooNumber8.runTest.java and select Run As -> Junit

![Run tests as JUnit](https://github.com/n-8/QA-Live-Assessments/blob/master/readme_images/6_verify_maven_install.png)


## Time for the exam

We will interivew for an hour giving you a series of challenge.  Some examples of sample challenges are included here within code comment's but we will give you a set of written instructions with a limit for each one of them since completing each challenge with full test coverage and using the proper standard intrustry takes longer than one hour.  Please coordinate with HR and your recruiter for more instructions on applying to Number8.

## Authors

* *Andres de Vivanco [andresd24](https://github.com/andresd24)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Number8's trust to execute this project
* Inspiration
