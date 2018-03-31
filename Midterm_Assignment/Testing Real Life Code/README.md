# Project 1

### "Testing Real Life Code"

* Explain the purpose of the Test (what the original test exposed, and what your test exposes)

    When running the tests that are existing in the cloned project,
    they produce a large amount of console outputs, due to the many log
    statements in the code.

    * The first test in `net.sf.javaanpr.test.RecognitionIT` will test a single image.
    * The second test will read all snapshots (images), verify whether each one
      is recognized correctly, and update a count of correctCount's which it
      eventually will compare up against the expected value of correct snapshots.

      The second test suffers from several problems.
        1. It does not report failed/success for each image being tested.
        2. Testing up against a count of `correctCount's` isn't good. The risk
           is that one image that was expected to fail, will not fail, and
           another image that should pass, will not pass because of changes to
           the code. The existing test will not expose this scenario.

    The task is to create a new test class with a test that will report
    green/red for each image being tested using the NetBeans test-runner.

* Explain about Parameterized Tests in JUnit and how you have used it in this exercise.

    Parameterized tests allow a developer to run the same test over and over
    again using different values. It also helps to save time in executing the
    same test which differs only in their inputs and expected results.

* Explain the topic 'Data Driven Testing' and why it often makes a lot of
  sense to read test data from a file.

  Data Driven Testing (DDT) is tests where test data is read from a file
  instead of using hardcoded values each time tests are run. This way, tests
  can test how the application handles various inputs more effectively.

* Your answers to the question:
    * What you implemented was a Unit Test or a JUnit Test?
    * Problems discovered with the test and suggestions how this could have been fixed?

* The steps taken to include Hamcrest Matchers in the project and the
  difference they made for the test.
