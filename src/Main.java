import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
        User user1 = new User("1234", "pass", "passs@mail.ru", 16);
        User user2 = new User("12345", "padd", "paddd@mail.ru", 28);
        return new User[]{user1, user2};
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundExeption {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getPassword().equals(password) && user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundExeption("Пользователь не найден");
    }
    public static void validateUser(User user) throws AccessDeniedExeption {
        if (user.getAge() < 18) {
            throw new AccessDeniedExeption("Вам еще не 18 лет");
        } else getUsers();
    }
    public static void main(String[] args) throws UserNotFoundExeption, AccessDeniedExeption {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        User user=getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Доступ представлен");
    }
}