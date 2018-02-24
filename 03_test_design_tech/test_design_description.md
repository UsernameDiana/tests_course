# Equivalence classes

1. Make equivalences classes for the input variable for this method:
    `public boolean isEven(int n)`
    * If provided number is even (modules 2), the result will be `True`.
    * If provided number is uneven, the result will be `False`.

2. The valid range is $1000 pr. month to $75,000 pr. month

| EQUIVALENCE CLASSES       | TEST CASE(isEven)     |
|---------------------------|-----------------------|
|salary >= 1000             |      is valid         |
|1000 =< 75.000             |      is valid         |
|salary > 75.000            |      invalid          |
|salary < 1000              |      invalid          |
|                           |                       |

3. Make equivalences classes for the input variables for this method:
    `public static int getNumDaysinMonth(int month, int year)`

| EQUIVALENCE CLASSES       | TEST CASE(int month, int year) |
|---------------------------|--------------------------------|
|month < 1                  |      invalid                   |
|month > 12                 |      invalid                   |
|1 < month  < 12            |      is valid                  |
|                           |                                |

int year has to be an INTEGER number above 0, not double.


# Boundary Analysis

1. Do boundary value analysis for input values exercise 1

| INVALID      | IS EVEN     |
|--------------|-------------|
|      1       |     0       |
|      3       |     2       |

This can go on forever...

2. Do boundary value analysis for input values exercise 2


        999 |  1001          74.999 | 75.001
------------|-----------------------|-------------

           1000                 75.000


* If the value is 1 and more under 1000 the value is invalid.
* If the value is between 1000 and 75.000 the value is valid.
* If the value is 1 ore more above 75.000 the value is invalid.

3. Do boundary value analysis for input values exercise 3

Values to check on for Month: 0, 1 and 12, 13
Values to check on for Year: Unlimited range of Integers.

# Decision tables

1. Make a decision table

| CONDITION      |     |   |   |   |
|----------------|-----|---|---|---|
| Hospital       |  T  | T | F | F |
|                |     |   |   |   |
| Doctor         |  T  | F | T | F |
|                |     |   |   |   |
| ACTION         |     |   |   |   |
|                |     |   |   |   |
| 0%             |     |   |   | T |
|                |     |   |   |   |
| 50%            |     |   | T |   |
|                |     |   |   |   |
| 80%            |  T  | T |   |   |
|                |     |   |   |   |

2. Make a decision table for leap years.

| CONDITION      |     |   |   |   |     |   |   |   |
|----------------|-----|---|---|---|-----|---|---|---|
|Leap year       |  T  | T | T | F |  F  | F | T | F |
|                |     |   |   |   |     |   |   |   |
| / 100          |  T  | T | F | T |  F  | F | F | T |
|                |     |   |   |   |     |   |   |   |
| / 400          |  T  | F | F | T |  F  | T | T | F |
|                |     |   |   |   |     |   |   |   |
| ACTION         |     |   |   |   |     |   |   |   |
|                |     |   |   |   |     |   |   |   |
| Leap year      |  T  | T | T | F |  F  | F | T | F |
|                |     |   |   |   |     |   |   |   |


# State transition

1. Make a state diagram that depicts the states of MyArrayListWithBugs.java

![alt text](https://github.com/UsernameDiana/tests_course/blob/master/03_test_design_tech/state_diagram.jpg)

2. Test cases from the state diagram

    * S1 - empty list
    * S2 - elements in list
    * S3 - index out of bound
    * S4 - expanded list

![alt text](https://github.com/UsernameDiana/tests_course/blob/master/03_test_design_tech/state_test_cases.jpg)

3. Consider whether a state table is more useful design technique.

    In my opinion all of the presented test design techniques (Boundary analyses,
    Decision table, State diagram and Equivalence classes) are very useful
    to practice, it helps to clarify the purpose of the tasks and functionality.
    State table helped to make test cases and get a better overview of the program.

4. Make a conclusion where you specify the level of test coverage and argue
   for your chosen level:

    * Percentage of states visited
    All states where visited, so 100%, even `index out of bound` as it was optional.
    * Percentage of transitions exercised
    We tested for invalid input to get the exception.
