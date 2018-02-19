# Static Test Techniques

2. Static Code Analysis

The code for triangle.py programm was developed in Python programming language
written in PyCharm IDEA.

b) Pylint contains checkers for PEP8 code style compliance, design, exceptions
   and many other source code analysis tools.
   In the directory of the code file in Terminal run `pylint triangles.py`

   Result for triangles.py:

```
Dianas-MacBook-Air:01_test_cases diana$ pylint triangles.py
No config file found, using default configuration
************* Module triangles
C:  1, 0: Missing module docstring (missing-docstring)
C:  4, 0: Invalid argument name "l1" (invalid-name)
C:  4, 0: Invalid argument name "l2" (invalid-name)
C:  4, 0: Invalid argument name "l3" (invalid-name)
C:  4, 0: Missing function docstring (missing-docstring)
R:  5, 7: Too many boolean expressions in if statement (7/5) (too-many-boolean-expressions)
C: 18, 0: Invalid constant name "length1" (invalid-name)
C: 19, 0: Invalid constant name "length2" (invalid-name)
C: 20, 0: Invalid constant name "length3" (invalid-name)

------------------------------------------------------------------
Your code has been rated at 3.57/10 (previous run: 3.57/10, +0.00)
```

d) CC1 - Cyclomatic Complexity Analysis


3. SmartBear Checklist:

* Review fewer than 400 lines of code at a time.
To have better overview and understanding of what are you viewing.
The brain can only effectively process so much information at a time.

* Take your time. Inspection rates should under 500 LOC (Lines of code) per hour
Spend some more time on what you’re going through to not miss errors that
should have been caught.

* Do not review for more than 60 minutes at a time.
If you review for too long, you can start blurring things together and
therefore reduce the quality of the review.

* Set goals and capture metrics.
Set goals that are better than “Make this better”.
Example: “We want to reduce the amount of errors by x percentage”

* Use checklists.
Most effective way to eliminate frequently made errors.

* Establish a process for fixing defects found.
Use a code review tool that allows reviewers to log bugs, discuss them with
the author, and approve changes in the code.

* Foster a positive code review culture.
Be kind in your review, point the mistakes made out in a nice manner.

* Practice lightweight code reviews.
No need to write a paragraph for each review, it is enough to just say `indent`
or `need extra space`, keep is clear.

4. Review code that fails in Unittests.
The Array is static, and therefore can’t change.
Also the “ -  “ Should be “ = “ instead.

![alt text](/Users/diana/Desktop/git/tests_course/02_static_test/test.png)

5. Coding Standard Best Practices
* Commenting and documentation of modules and functions, so the developer picking
up the code after you, can understand what it does.
* Naming convention, not calling variables `x` and `y`, but give them explanatory name.
* Consistent Indentation, to keep the style of the code consistent and readable.
* DRY Principle `Don't repeat yourself`, automate repetitive tasks.
* Limit Line Length to 78

6. Highlights from the lecture.
* Early tests.
It’s important to do tests early in the process, as it will be easier and cheaper 
to eliminate mistakes. The longer testing is porsponed, the more code there will
be containing errors and therefore bug finding will be harder.
* Everyone should test.
