# Tests Cases

1. Write test-cases for both successful and unsuccessful scenarios

2. Design and implement console app of Triangles program.

The program reads three integer values from an input dialog.
The three values represent the lengths of the sides of a triangle.
The program displays a message that states whether the triangle is:
scalene, isosceles or equilateral.

* Usage

1. Clone project and in the directory where its located run `python triangles.py`

* Test scenario: check input value

| TEST CASE                 |        TEST DATA      |          EXPECTED        |          ACTUAL          |
|---------------------------|-----------------------|--------------------------|--------------------------|
|response on valid data     |      1,2,3            |          scalene         |          scalene         |
|                           |      3,2,3            |          isosceles       |          isosceles       |
|                           |      3,3,3            |          equilateral     |          equilateral     |
|response on invalid data   |      1,2,a            |          invalid         |          invalid         |
|                           |      1, ,             |          invalid         |          invalid         |
