## Exercise: TicketSeller (10 points)

The project name of this exercise is **TicketSeller** 

The purpose of this assignment is to learn how to work with iteration and constants. Additionally, you get more practice on how to write all of your own code and Javadoc comments.

### Problem Description

This problem is inspired by the book's Problem P6.10 on page 304.

You are to write an application to pre­sell a limited number of movie tickets. The simple user interface will be contained in **TicketSeller.java**.

Your TicketSeller.java should contain code to test your TicketSeller object.

Note:

- Your requests for tickets will always be positive integers.

### Getting Started

There is no code to copy for the assignment. You get to do it all! Don't forget to provide proper Javadoc documentation.

You'll need to create a method called `public static int processOrder(int order, int numberTickets)`. The method determines if the order size is less than 4 and less than or equal to `numberTickets`.

We are going to do this exercise by writing the object that solves the problem first (in a source file called TicketSeller.java) and then testing it using code we write into **TicketSeller.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) to create a source file called **TicketSeller.java**. This is where your code will go. 

### Testing Your Code

Your test code, in `main` for this project will be in **TicketSeller.java** and will implement a simple user interface. Here is a sample run:

```
Input the number of tickets you want to sell: 8
Input requested tickets: 1
Thank you for your purchase. There are 7 tickets remaining.
Input requested tickets: 2
Thank you for your purchase. There are 5 tickets remaining.
Input requested tickets: 6
Too many tickets requested, please try again.
Input requested tickets: 9
Too many tickets requested, please try again.
Input requested tickets: 3
Thank you for your purchase. There are 2 tickets remaining.
Input requested tickets: 2
Thank you for your purchase. There are no tickets remaining.
You have had 4 buyers.
```

Notice that only the valid ticket purchases make someone count as a buyer. Don't worry about other inputs; you'll always get positive integers.

Once you've written your code, run the code by single clicking on TicketSeller.java in the package explorer and selecting Run->Run from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to GitHub. Once you've completed this step your code will be on BitBucket in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...** and follow the usual procedures.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **build plan** on Bamboo. This action will create a Bamboo build plan that will build and test your code every time you push code to your project. You can also run builds manually

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you may track your progress throughout the term.