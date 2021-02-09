package eleven;

public class MoneyIssueException extends Exception {

    public MoneyIssueException() {
        super();
    }

    public MoneyIssueException(String message) {
        super(message);
    }

    public MoneyIssueException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoneyIssueException(Throwable cause) {
        super(cause);
    }

    public MoneyIssueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
