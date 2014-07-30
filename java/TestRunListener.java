/*TestRunListener.java*/
/*Java*/
/*https://github.com/junit-team/junit/blob/master/src/main/java/junit/runner/TestRunListener.java*/

package junit.runner;

public interface TestRunListener {
    public static final int STATUS_ERROR = 1;
    public static final int STATUS_FAILURE = 2;

    public void testRunStarted(String testSuiteName, int testCount);

    public void testRunEnded(long elapsedTime);

    public void testRunStopped(long elapsedTime);

    public void testStarted(String testName);

    public void testEnded(String testName);

    public void testFailed(int status, String testName, String trace);

}
