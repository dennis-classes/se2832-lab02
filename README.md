# SE2832 Lab 2: Testing a Circular Queue with JUnit

## 1. Introduction

This  is  your first verification lab.   Its  purpose is  to help you to start thinking
about how to test existing software.    From  doing  this,  you  will  review  the  
concepts  of  JUnit  as  well  as  begin  to  see  some  of  the patterns necessary to
ensure correct operation of software.

## 2. Lab Objectives
* Review the Java queue data structure
* Develop JUnit test cases to properly verify the operation of a basic Java data structure.
* Use independent learning to understand the operation of a circular queue.

## 3. Problem Overview
One  commonly used low level data  structure  is the  circular queue  or circular buffer.  It is  often used in systems
which  requires  fast  adds  and  removes,  as  unlike other forms of queues, additions and removals can be designed
to be atomic without the usage of blocks.

 For this lab, you have been provided with a full implementation for a Java circular queue class.  However, this  code  
 has  not  been  tested  and  will  most likely contain  errors.    You  are  responsible  for  developing JUnit tests
 to ensure that this class operates properly.  If there are problems with the implementation, you will need to go
 into the source code and perform the appropriate fixes. It is possible that there are some methods which are not
 implemented in the source code.  If the methods are not implemented, it is acceptable for the code to simply throw
 an ```UnsupportedOperationException```.   The queue, as it is structured, is perfectly capable of holding null
 references.  Therefore, you should make certain that null can be added to the queue.


 ## 4. Deliverables
 Add a file called write-up.md.  In the write up include your name, email, and a casual discussion about the following the questions:

 What sort of strategy did you use to come up with your test cases?  How did you know when you were finished?  Include a table with the following seven columns:  defect number, original line number, fault description, test inputs, expected output, actual output, and fix applied.

 *THESE SHOULD BE ORIGINAL LINE NUMBERS, SO TAKE CARE WHEN RECORDING CHANGES*  (You will lose **TWENTY** points if these are not the original line numbers.)

 ### Testing Style Guides
* In general, a unit test should test one single concept.  In general, you should not have a single JUnit test with large number
  of asserts.
* Write your test cases using the following structure:

   ```//Arrange - this is where you setup your test, declaring variables, establishing state, etc.```

   ```//Act - this is where you execute your code```

   ```//Assert - here you issue your assert(s)```
* Your test names should follow the pattern MethodName**Should**ExpectedBehavior**When**StateUnderTest

  e.g.

       checkAgeShouldThrowNullPointerWhenNullPersonPassedIn
       sizeShouldReturnZeroWhenListIsEmpty


## Grading

Grading will be done on the following criteria:

* **The degree to which the instructions were followed. (10%)** A satisfactory result is every instruction followed.  A less than satisfactory result is one or more items not followed.
* **The number of faults found, corrected, and compliance to reporting. (40%)**  An excellent result would be correcting every fault in the file. A satisfactory result would be identifying 80% or more.  Each entry in the defect table has concise, correct, and clear content for line number, fault, inputs, expected, actual and fix description.
* **The quality of unit tests. (30%)** An excellent result would have every test with a verbose and expressive name, clearly arranged using the AAA model, testing only one concept.
* **The quality of and degree of policy compliance for fixes. (20%)** An excellent result would be every fix has a useful and traceable comment, a single commit with a useful and traceable comment, and an entry in the table. A satisfactory result would be 1 to 2 fixes not having complete test cases, comments, or individual commits.

* **Bonus Work** 10 points will be given if you use Github issues to record the defects and add traceability back to the issues in your treatment of the fixes and tests. 
