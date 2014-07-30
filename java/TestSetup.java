/*TestSetup.java*/
/*Java*/
/*https://github.com/junit-team/junit/blob/master/src/main/java/junit/extensions/TestSetup.java*/

public class TestSetup extends TestDecorator {

  public TestSetup(Test test) {
      super(test);
  }

  @Override
  public void run(final TestResult result) {
      Protectable p = new Protectable() {
          public void protect() throws Exception {
              setUp();
              basicRun(result);
              tearDown();
          }
      };
      result.runProtected(this, p);
  }

  protected void setUp() throws Exception {
  }

  protected void tearDown() throws Exception {
  }
}
