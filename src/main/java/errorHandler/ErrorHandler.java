package errorhandler;

/**
 * Created by Alireza on 6/28/2015.
 */
public final class ErrorHandler {

    private ErrorHandler() throws Exception {
        throw new Exception("Unsupported Operation");
    }

    public static boolean hasError = false;

    public static void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}
