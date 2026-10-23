# CS 320 Software Testing, Automation, and Quality Assurance

This repository contains selected work from CS 320: Software Testing, Automation, and Quality Assurance. The contact service files demonstrate my use of JUnit testing, validation, and requirement-driven development. The summary and reflections report explains the testing strategies I used throughout the course and how I approached software quality.

## How can I ensure that my code, program, or software is functional and secure?

I can help ensure that software is functional by testing it against clearly defined requirements instead of only checking whether it runs successfully. During this course, I used JUnit tests to verify both valid and invalid conditions, including null values, field-length limits, duplicate IDs, invalid phone numbers, and other edge cases. Automated testing and code coverage also helped confirm that important parts of the code were being exercised.

Security also requires thinking beyond normal use. Input validation, careful error handling, and limiting unexpected behavior can prevent many problems before they reach production. Testing should include situations where users provide invalid or unexpected input rather than assuming that the program will always be used correctly.

## How do I interpret user needs and incorporate them into a program?

I start by translating user needs and requirements into specific behaviors that the software must perform. Each requirement should be clear enough that it can be implemented and tested. In the contact service project, requirements such as maximum field lengths, unique IDs, and phone-number formatting became both validation rules in the program and test cases in JUnit.

This approach helps keep development focused on what the user actually needs instead of making assumptions about how the software should behave. Testing those requirements also provides evidence that they were implemented correctly.

## How do I approach designing software?

I approach software design by breaking a larger problem into smaller components with clear responsibilities. For the projects in this course, the data classes handled the information and validation rules, while the service classes handled operations such as adding, deleting, and updating records. Keeping these responsibilities separate made the code easier to understand and test.

I also try to design with testing in mind from the beginning. Small, focused classes and methods are easier to verify and maintain than code that combines too many responsibilities. My experience in this course reinforced the idea that software design, requirements, and testing should support each other throughout development rather than being treated as separate steps.
