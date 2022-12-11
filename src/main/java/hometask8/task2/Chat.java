package hometask8.task2;

import java.util.List;
import java.util.Objects;

/**
 * Дан список чатов с предыдущего задания,
 * только вместо поля “количество пользователей” будет список объектов типа Пользователь,
 * который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class Chat {
    private String chatName;
    private List<User> users;

    public Chat(String chatName, List<User> users) {
        this.chatName = chatName;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(chatName, chat.chatName) && Objects.equals(users, chat.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatName, users);
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
