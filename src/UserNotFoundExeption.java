public class UserNotFoundExeption extends Exception {
    public UserNotFoundExeption() {
    }
    public UserNotFoundExeption(String message) {
        super(message);
    }
}