# Lab Report 2 by Kenneth Nguyen, PID A17458399#
## Table of Contents
1. Web Server "StringServer" implementation
2. A Bug from Lab 3
3. What Did I Not Know Before Lab 2 or 3?

## Part 1: String Server Implementation
In this part, we were tasked with creating a web server in Java that took URL queries.
* For example, if the URl ended in `/add-message?s=<insert string here>`, we would print out the (insert string here) part.
* If there were more strings subsequently, we would concatenate it to the current string and print out both the new and previous string(s) provided.
  
Below is a screenshot of the implementation:
  
![(Screenshot of our VSCode and source code](./SearchEngineSS.jpg)
* Begin by importing IOException and URI libraries.
* On line 8, we initialize our return string upon executing the program.
* On line 10, we define our function handleRequest(URI url)
* Inside this method, if our path begins with `/add-message`, then we will split the following queries by the equal sign and store the arguments in a String\[] array called parameters.  
* Then, we'll take the parameter at index 1 (after the <span style="color:red"> `'?s'`</span> keyword) 
