public static void main(String[] args) {
    System.out.println(Validator.validateCredentials("user_name", "pass123", "pass123")); // true
    System.out.println(Validator.validateCredentials("user@name", "pass123", "pass123")); // false
    System.out.println(Validator.validateCredentials("username", "pass!123", "pass!123")); // false
    System.out.println(Validator.validateCredentials("username", "pass123", "pass1234")); // false
}
