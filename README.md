# flamecloud_assignment

Overview

This repository contains the test artifacts and automation scripts for the Website Testing Project. It includes manual test cases, bug reports, test summaries, and automated test scripts using Selenium WebDriver with Java.

Project Structure

Website-Testing-Project/
│
├── Manual-Testing/
│   ├── Test-Plan.docx
│   ├── Test-Cases.xlsx
│   ├── Bug-Report.xlsx
│   └── Test-Summary-Report.docx
│
├── Automation-Testing/
│   ├── websiteTestAutomation.java
│   ├── README-Automation.md
│   └── pom.xml
│
├── Screenshots/
│   └── (Screenshots of test execution and bug reports)
│
└── README.md

Manual Testing

Test Plan

The Test Plan outlines the scope, objectives, and methodology for testing the website. It includes test environment details, test data, and risk analysis.

File: Test-Plan.docx

Test Cases

This document contains structured test scenarios covering key functionalities such as login, user dashboard, and navigation.

File: Test-Cases.xlsx

Bug Report

A detailed defect tracking sheet documenting identified issues, their priority, status, and reproduction steps.

File: Bug-Report.xlsx

Test Summary Report

Summarizes testing activities, executed test cases, defects found, and recommendations for further testing.

File: Test-Summary-Report.docx

Automation Testing

Selenium Automation Script

The websiteTestAutomation.java file contains Selenium WebDriver test scripts for automating login and core website functionalities.

File: Proxify.java

Prerequisites

Ensure the following are installed before running the automation tests:

Java (JDK 8 or later)

Maven

ChromeDriver (compatible with your Chrome browser version)

Selenium WebDriver dependencies (managed via pom.xml)


Navigate to the project directory:

cd Website-Testing-Project/Automation-Testing

Run the tests using Maven:

mvn test

Review test execution results and screenshots.

Screenshots

The Screenshots folder contains images capturing test execution and reported bugs.

Contribution Guidelines

Contributions are welcome! To contribute:

Fork the repository.

Create a feature branch (git checkout -b feature-branch).

Commit your changes (git commit -m "Description of changes").

Push to your branch (git push origin feature-branch).

Open a Pull Request with a detailed description.

License

This project is licensed under the MIT License. See the LICENSE file for details.


Notes:

Avoid hardcoding sensitive information such as login credentials. Use environment variables or configuration files instead.

Keep this README updated with any project changes.
