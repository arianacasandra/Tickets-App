# Ticket App

In this I created a small Java application by using as reference an UML class diagram. Please consider following general notes before start implementing:
- toString() method when required will return a string like *ClassName{attributeName1=attributeValue1,...,attributeNamen=attributeValuen}*.
- add any constructors, getter, setters or other methods you consider are required even if are not explicitly presented in the diagrams.
- Do not reuse (import) the same class in multiple exercises. **Each exercise is standalone and should be resolved in its package.**

## Instructions:
1. Create Java application based on the provided UML class diagram
2. Create main method and create some objects to demonstrate the functionality 
3. Create a minimal unit test for testing the behavior of the created class.

## Diagram
![Exercise 4 image](docs/tickets_app2.jpg)

Above picture presentes a high level concept of an event ticketing system. 
1. Create a class diagram to model minimal functionalities of event ticketing system. 
2. Create the minimal application based on the class diagram you have created.

## UML Diagram
![Exercise 1 image](docs/TicketsAppUmlDiagram.jpg)
**NOTE 1** In your implementation, use at least two of the following type definitions: enum, interface, abstract class.

**NOTE 2** No real impementaion is needed (no need to generate qr codes, integrate payment service, etc). The class diagram you create and the application will only simulate various features of the application by simply displaying messages. 
The focus will be in identifying main features of each of the components. Model each component as a class. Identify the relation (collaboration) between classes and try to model this interactions in the application.
