# Design-Principles--2

## In an Employee class
in this class i define the attribute that it shared with all employee in the company.
and add a getter methods and a method called getData() this methods used to print all the attribute for tha employee.

## In a Staff class
in this class i inheritance the employee attribute 

## In a Manager & Director class
this two classes is shared with List of employee because of that i make a Supervisor class
that inheritance from Employee class and make the Manager & Director inheritance from it

## Report
for the report i make an interface to allow in future to add any type of report without breaking an Open - Close principle

## Employee Report
in this class i make Override to the report methods and make a for loop 
to print all employee in the list

## Cost Report
in this class i make Override to the report methods and make a for loop
to calculate the budget per month

## Data Base 
in this class i apply a singleton design pattern because this way apply the user
to open a single connection in DataBase 

