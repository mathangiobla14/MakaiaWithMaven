Feature: Leads Implementation for Leaftaps


Scenario Outline: CreateLead Positive
Given Click Leads button
And click CreateLead button
When Enter the company as <cName>,Firstname as <fName> and Lastname as <lName>
And click on Create
Then verify if the lead is created succesfully

Examples:
|cName|fName|lName|
|TestLeaf|Lead|One|
|Maveric|Lead|Two|


Scenario Outline: CreateLead Negative
Given click CreateLead button
When Enter the name of the company as <cName>,Firstname as <fName>
And click on Create
But verify if the lead is created succesfully

Examples:
|cName|fName|
|HSBC|Lead|
