public class WrongPasswordException extends Exception {
    // Конструктор по умолчанию
    public WrongPasswordException() {
        super();
    }

    // Конструктор с сообщением об ошибке
    public WrongPasswordException(String message) {
        super(message);
    }
}
