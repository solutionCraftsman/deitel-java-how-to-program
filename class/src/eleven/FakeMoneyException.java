package eleven;

public class FakeMoneyException extends MoneyIssueException {
    public FakeMoneyException() {
        super();
    }

    public FakeMoneyException(String message) {
        super(message);
    }

    public FakeMoneyException(String message, Throwable cause) {
        super(message, cause);
    }

    public FakeMoneyException(Throwable cause) {
        super(cause);
    }

    public FakeMoneyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
