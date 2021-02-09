package eleven;

public class MoneyNoReachException extends MoneyIssueException {
    public MoneyNoReachException() {
        super();
    }

    public MoneyNoReachException(String message) {
        super(message);
    }

    public MoneyNoReachException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoneyNoReachException(Throwable cause) {
        super(cause);
    }

    public MoneyNoReachException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
