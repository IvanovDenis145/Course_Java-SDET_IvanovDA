public class Validator {
    public static boolean validateCredentials(String login, String password, String confirmPassword) {
        try {
            // Проверка логина
            if (!login.matches("^[a-zA-Z0-9_]{1,19}$")) {
                throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, и быть меньше 20 символов.");
            }

            // Проверка пароля
            if (!password.matches("^[a-zA-Z0-9_]{1,19}$")) {
                throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, и быть меньше 20 символов.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают.");
            }

            // Если все проверки пройдены, возвращаем true
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
