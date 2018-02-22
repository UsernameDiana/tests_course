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
|1 < month  < 12            |      valid                     |
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


        999   1001            74.999  75.001
------------|-----------------------|-------------
           1000                   75.000
  INVALID            VALID              INVALID

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
|----------------|-----|---|---|---|
| Doctor         |  T  | F | T | F |
|----------------|-----|---|---|---|
| ACTION         |     |   |   |   |
|----------------|-----|---|---|---|
| 0%             |     |   |   | T |
|----------------|-----|---|---|---|
| 50%            |     |   | T |   |
|----------------|-----|---|---|---|
| 80%            |  T  | T |   |   |
|----------------|-----|---|---|---|

2. Make a decision table for leap years.

| CONDITION      |     |   |   |   |     |   |   |   |
|----------------|-----|---|---|---|-----|---|---|---|
|Leap year       |  T  | T | T | F |  F  | F | T | F |
|----------------|-----|---|---|---|-----|---|---|---|
| / 100          |  T  | T | F | T |  F  | F | F | T |
|----------------|-----|---|---|---|-----|---|---|---|
| / 400          |  T  | F | F | T |  F  | T | T | F |
|----------------|-----|---|---|---|-----|---|---|---|
| ACTION         |     |   |   |   |     |   |   |   |
|----------------|-----|---|---|---|-----|---|---|---|
| Lear year      |  T  | T | T | F |  F  | F | T | F |
|----------------|-----|---|---|---|-----|---|---|---|


# State transition

