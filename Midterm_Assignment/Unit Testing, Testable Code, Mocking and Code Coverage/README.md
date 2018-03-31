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

* Explain about JUnit, Hamcrest, Mockito and Jacoco, and what problems they
  solve for testers.

  * JUnit is a unit testing framework for Java programming language. It plays
    a crucial role test-driven development.
    JUnit promotes the idea of "first testing then coding", which emphasizes
    on setting up the test data for a piece of code that can be tested first
    and then implemented.
    JUnit provides new check assert methods named assertThat() which uses
    Matchers and should provide a more readable testcode and better failure messages.
    To use Matchers you can write them by yourself or use the Hamcrest lib.

  * Hamcrest is a framework for software tests. Hamcrest allows checking for
    conditions in your code via existing Matchers classes. It also allows you to
    define your custom matcher implementations. Hamcrest has the target to
    make tests as readable as possible.
    To use Hamcrest Matchers in JUnit you use the `assertThat(a, equalTo(b));`
    statement followed by one or several Matchers.

  * Mockito is a mocking framework for unit tests in Java, producing readable
    code and clean errors.

  * JaCoCo is a free code coverage library for Java.

* Demonstrate how you used Mockito to mock away external Dependencies.

* Demonstrate how/where you did state-based testing and how/where you did
  behaviour based testing.

* Explain about 'Coverage Criteria', using the results presented by running
  Jacoco against you final test code.

  Code coverage is a measure used to describe the which source code of a program
  is executed when a particular tests are ran.

* Explain/demonstrate what was required to make this project use JUnit (Hamcrest),
  Mockito and Jacoco.
