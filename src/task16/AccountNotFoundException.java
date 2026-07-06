package task16;

public class AccountNotFoundException extends RuntimeException {

    private String errorCode;

    public AccountNotFoundException(String message) {
        super(message);  // передаём сообщение в родительский класс RuntimeException
    }

    public AccountNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
