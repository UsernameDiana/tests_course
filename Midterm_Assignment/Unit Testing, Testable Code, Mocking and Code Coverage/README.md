# Project 2

### Unit Testing, Testable Code, Mocking and Code Coverage.

* Explain the necessary steps you did to make the code testable,
  and patterns involved in this step.

  1. What can be a problem with static methods?

    The problem is that the code becomes hard wired to that static method.
    There is no easy way to replace the reference to the static method with
    something else, and if you are testing your code using automated tests,
    this is exactly what you want to do.

  2. Refactoring Date and applying Inversion of Control (IoC)

     Inversion of Control is a simple, but extremely useful, technique for
     decoupling code, and for unit testing in particular. We separate
     decision-making code (when to do something) from action code (what to do
     when something happens) using a constructor.


* Execute your test cases.
* Explain about JUnit, Hamcrest, Mockito and Jacoco, and what problems they
  solve for testers.
* Demonstrate how you used Mockito to mock away external Dependencies.
* Demonstrate how/where you did state-based testing and how/where you did
  behaviour based testing.
* Explain about 'Coverage Criteria', using the results presented by running
  Jacoco against you final test code.
* Explain/demonstrate what was required to make this project use,
  JUnit (Hamcrest), Mockito and Jacoco.
