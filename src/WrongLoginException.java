public class WrongLoginException extends Exception {
    // Конструктор по умолчанию
    public WrongLoginException() {
        super();
    }

    // Конструктор с сообщением об ошибке
    public WrongLoginException(String message) {
        super(message);
    }
}
