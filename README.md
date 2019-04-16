# Triangle
Triangle is an example program for a software testing exercise that focuses on
unit testing and test effectiveness, using code coverage criteria.

#### How to build Triangle and run its tests from the terminal:

1. Change into the Triangle root directory, which contains the *build.xml* build
   file.

2. Run `ant compile` to compile Triangle. The compiled class files will be in
   the *bin* directory.

4. Run `ant test` to run all Triangle unit tests.

5. Run `ant clean` whenever you want to clean up the project (i.e., delete all
   generated files).

#### Code coverage analysis

1. Run `ant coverage` to compute the coverage results.

2. After completion, you can view the detailed html coverage report here:
   *coverage_results/index.html*
