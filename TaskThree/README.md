# SayNumber
### Introduction
that takes a numeral (just digits without separators (e.g. 19093 instead of 19,093)
 and returns the standard way of reading a number, complete with punctuation.
 
### Project Structure
        SayNumber/
        ├── libs
        │   ├── hamcrest-2.2.jar
        │   └── junit-4.13.2.jar
        ├── README.md
        ├── SayNumber.iml
        ├── src
        │   ├── Driver.java
        │   └── ThreePlaceGroup.java
        └── test
            ├── DriverTest.java
            └── ThreePlaceGroupTest.java
        
        3 directories, 8 files


### Project Setup
Clone/download this repository. If you are using an IDE you can copy set it up 
normally in your IDE project files. Proceed to add the two `.jar` files in the 
`libs` folder as dependencies on your classpath.

Alternatively, you can `cd` into the project directory, then run the program from 
your terminal as shown below:

    cd SayNumber
    cd src
    javac *.java
    java Driver 78
   
In this case the program should output the String "Seventy eight."

### Languages Used
1. Java
### Dependencies
1. JUnit
2. Hamcrest 