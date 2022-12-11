package hometask8.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Дан список чатов с предыдущего задания,
 * только вместо поля “количество пользователей” будет список объектов типа Пользователь,
 * который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов,
 * возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public final class ChatUtil {
    public static ArrayList<User> allUsersList(ArrayList<Chat> chats) {
        List<User> usersFromChat;
        ArrayList<User> allUsers = new ArrayList<>();
        for (Chat chat : chats) {
            usersFromChat =  chat.getUsers();
            allUsers.addAll(usersFromChat);
        }
        return allUsers;
    }

    public static String getRandomString(int length) {
        final String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ThreadLocalRandom random = ThreadLocalRandom.current();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static ArrayList<User> listOfAdultUsers(ArrayList<Chat> chats, int age) {
        ArrayList<User> allUsersList = ChatUtil.allUsersList(chats);
        ArrayList<User> adultUsers = new ArrayList<>();
        for (User user : allUsersList) {
            if (user.getAge() >= age) {
                adultUsers.add(user);
            }
        }
        return adultUsers;
    }

    public static double averageUsersAge(ArrayList<User> users) {
        double ages = 0;
        for (User user : users) {
            ages += user.getAge();
        }
        return ages / users.size();
    }
}
