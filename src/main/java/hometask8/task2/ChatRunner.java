package hometask8.task2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Дан список чатов с предыдущего задания,
 * только вместо поля “количество пользователей” будет список объектов типа Пользователь,
 * который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class ChatRunner {
    public static void main(String[] args) {
        final int MAX_AGE = 50;
        final int MIN_AGE = 10;
        final int NAME_LENGTH = 10;

        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            User user = new User(i + 1, ChatUtil.getRandomString(NAME_LENGTH), ThreadLocalRandom.current().nextInt(MIN_AGE, MAX_AGE));
            users.add(user);
        }

        System.out.println(users.size());
        System.out.println(users);
        System.out.println();

        ArrayList<Chat> chats = new ArrayList<>(20);
        for (int i = 0; i < 100; i++) {
            Chat chat = new Chat(ChatUtil.getRandomString(NAME_LENGTH), users);
            chats.add(chat);
        }

        System.out.println(chats.size());
        System.out.println(chats);
        System.out.println();

        ArrayList<User> allUsers = ChatUtil.listOfAdultUsers(chats, 18);
        System.out.println(allUsers.size());
        for (User user : allUsers) {
            System.out.println(user);
        }

        System.out.println(ChatUtil.averageUsersAge(allUsers));


    }
}
