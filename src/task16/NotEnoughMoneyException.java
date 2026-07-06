package task16;

// Наследуемся от RuntimeException, потому что это непроверяемое исключение
public class NotEnoughMoneyException extends RuntimeException {

    // Поле для кода ошибки
    private String errorCode;

    // Конструктор 1 - только сообщение об ошибке
    public NotEnoughMoneyException(String message) {
        super(message);  // передаём сообщение в родительский класс RuntimeException
    }

    // Конструктор 2 - сообщение об ошибке И код ошибки
    public NotEnoughMoneyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    // ГЕТТЕР для errorCode
    public String getErrorCode() {
        return errorCode;
    }

    // СЕТТЕР для errorCode
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
