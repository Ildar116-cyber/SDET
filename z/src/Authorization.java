public class Authorization {
    private static final String REGEX = "^[a-zA-Z0-9_]+$";
    public String login, password, confirmPassword;
    private static boolean flag = false;

    public static boolean processAuthorization(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || !login.matches(REGEX)) {
                throw new WrongLoginException("Неверный формат логина");
            }
            if (password.length() > 20 || !password.matches(REGEX)) {
                throw new WrongPasswordException("Неверный формат пароля");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
            flag = true;
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка - " + e.getMessage());
            return false;
        } finally {
            if (flag) {
                System.out.println("Авторизация прошла успешно \n");
            } else {
                System.out.println("Вход не выполнен \n");
            }
        }
    }
}
