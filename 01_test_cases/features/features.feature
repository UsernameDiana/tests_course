Feature: test triangle

  Scenario: run a simple test
     Given we have triangle
      When we implement a test
      Then behave will test it for us!

   Scenario: input specific values
      Given a set of specific integers
         | 1    | 3  | 3  |
         | 14   | 11 | 33 |
         | 77   | 4  | 98 |
         | 900  | 88 | 0  |

 When we receive the numbers
 Then we will find what triangle it is
  But we will find also if its not a triangle