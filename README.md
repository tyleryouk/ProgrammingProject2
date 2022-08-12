# ProgrammingProject2

Programming Project 2

I. Overview
This second programming assignment is to give you practice writing loops and manipulating strings and arrays. Do not use arrays on a problem involving Strings, and do not use Strings in a problem involving arrays.

II. Code Readability (20% of your project grade)
As with the last project, you are required to have code that is easy for another person to read and understand. To accomplish that, the class will have certain rules about how your code should look.

To receive the full readability marks, your code must follow the following guideline:

You should place a comment at the top of the file that contains your name and a short description of the purpose of the class.
You should place a short comment before (directly above) each method describing the method. The comment should be only describe what the method does, not how it does it. Do not simply copy the descriptions below for your comments.
You should place a short comment directly above each field (should you really have any?) indicating the purpose of the variable.
You should place a short comment above or to the right of each local variable explaining the purpose of the variable. Variables that are only used as loop indexes do not need to have comments.
You should place a short comment above each loop explaining how the loop works. Ideally, you should list the goal of the loop, any required precondition for the loop, and if you can, a good iteration subgoal for the loop.
Any other complicated code such as code the has lots of if statements or variables should contain short comments to help the reader. The comments can either be above the code fragment or to the right, aligned in a column.
Remember to use good style: everything should be indented nicely, variables should have good names, there should be a blank line between each method.
III. Program Testing Document (20% of your project grade)
As with the previous project, you are required to submit a document demonstrating that you thoroughly tested your program. In this case, it means documenting tests for each of the methods listed below. If you are unable to complete a method above, you should still describe tests that would test the method had it been completed.

Hints for testing loops. Your tests need to, at the minimum cover the following cases:

Test 0, test 1, test many: This means you have to test cases where the parameters, if they are integers, are 0, 1 or some value other than 1. If the parameters are strings, you have to test strings of length 0, 1, and more than 1. If the strings must contain certain data, you need to test cases where they contain 0, 1, and more than 1 of the desired data.
Test first, last, and middle: In cases where you have to search in or modify a string, you need to test cases where the item to be found or modified is the first character of the string, the last character of the string, or somewhere in the middle of the string.
What must go in the report: For each method below, your report should describe, in English, what "test 0, 1, many" and "test first, middle, last" mean for each of the methods. Then, you should list the specific tests that you will do, what the expected output is, and then (if you completed the method) a cut-and-paste from DrJava showing the actual test.

JUnit: you recently learned about JUnit in lab. JUnit will be required for future homeworks, and you are welcome to use it with this homework. If you choose to write JUnit tests for your code, you do not need to include the actual tests in your report. Your JUnit file should include comments with each test that link to the report and indicate what you are testing. For example, if your report indicates that the method requires a test with a string of length 0, your JUnit class should have such a test and a comment on the test noting that it is the test of a length 0 string that your report described. Try to organize the JUnit class and report to make it easy for a reader to jump back and forth between the report and the tests.

IV. Java Programming (60% of your grade)
Guidelines for the program:

All methods listed below must be public and static.
If your code is using a loop to modify or create a string, you need to use the StringBuilder class from the API.
Keep the loops simple but also efficient. Remember that you want each loop to do only one "task" while also avoiding unnecessary traversals of the data.
No additional methods are needed. However, you may write additional private helper methods, but you still need to have efficient and simple algorithms. Do not write helper methods that do a significant number of unnecessary traversals of the data.
Important: you must not use either break or continue in your code. These two commands are often used to compensate for a poorly designed loop. Likewise, you must not write code that mimics what break does. Instead, re-write your loop so that the loop logic does not need break-type behavior.
While it may be tempting to hunt through the API to find classes and methods that can shorten your code, you may not do that. The first reason is that this homework is an exercise in writing loops, not in using the API. The second reason is that in a lot of cases, the API methods may shorten the writing of your code but increase its running time. The only classes and methods you can use are listed below. Note: if a method you want to use from the API is not listed, you should not implement the method yourself so you can use it. Rather, you shoud look for the solution that does not need that method.
You are allowed to use the following methods from the Java API:

class String
length
charAt
class StringBuilder
length
charAt
append
toString
class Character
any method
Create a class called HW2 that contains the following methods:

samePrefix takes two String s and one int parameter and returns a boolean:
Let x be the input int value (though you should use a better name). The method should return true if the first x characters of each input String are exactly the same.

> HW2.samePrefix("this is a test", "this is a trial", 11)
true
> HW2.samePrefix("this is a test", "this is a trial", 12)
false
> HW2.samePrefix("this is a test", "This is a trial", 4)
false
> HW2.samePrefix("this is a test", "this is a test", 100)
false
subtract takes two Strings and returns a String:
The output string should be the same as the first input string except that you should remove the characters of the second string as follows: remove the first occurrence of the first character, the first occurrence of the second character that appears after the removed character, the first occurrence of the third character that appears after the first two removed characters, etc. If there is no such character to remove, then nothing further is removed.

HW2.subtract("gfedcbabcdefg", "acfa")
"gfedcbbdeg"
indexWord takes two Strings as input and returns a String:
The first string will be a string of at least 10 characters, and the second string will contain only digits. The output string is formed by using each digit of the second string as an index to identify the character from the first input string to add to the output.

> HW2.indexWord("EHL ORT!.?", "102243610509")
"HELLO THERE?"

removeExtraSpaces takes a String as input and returns a String:
Retunred string contains the same contents as the input string, but any spaces at the beginning of the string and end of the string are removed, and if more than one space is between two non-space characters, the multiple spaces are replaced by a single space. For example,

> HW2.removeExtraSpaces("  How about     that    ?     ")
"How about that ?"
> HW2.removeExtraSpaces("Today    is   a    gift   !    ")
"Today us a gift !"
flipWords takes a String as input and returns a String:
Each word of the input string is reversed in the output string, though the order of the words stays the same. A word is defined as a consecutive sequence of English letters.

> HW2.flipWords("Seventy-six trombones in the big parade!!")
"ytneveS-xis senobmort ni eht gib edarap!!"
Extra credit:reverse takes a two dimensional array of int as input and returns nothing:
The method should reverse each "row" of the array, and it should also reverse the columns so that the first row now becomes the last row and the last row becomes the first.

> int[][] board = {{1,3,6,8},{5,3,4,1},{10},{6,4,2,1,0}};
> HW2.reverse(board)
> board
{ { 0, 1, 2, 4, 6 }, { 10 }, { 1, 4, 3, 5 }, { 8, 6, 3, 1 } }
V. Submitting Your Project
Submit the .java file (not the .class files or the .java~ files) of your class plus the testing report on Canvas.
