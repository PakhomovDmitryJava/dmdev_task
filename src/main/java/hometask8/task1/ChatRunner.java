package hometask8.task1;

import java.util.ArrayList;

/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */
public class ChatRunner {
    public static void main(String[] args) {
        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Z", 999));
        chats.add(new Chat("B", 1011));
        chats.add(new Chat("C", 22));
        chats.add(new Chat("C", 123123));
        chats.add(new Chat("D", 33));
        chats.add(new Chat("X", 5124));
        chats.add(new Chat("E", 1011));
        chats.add(new Chat("A", 1011));
        chats.add(new Chat("G", 5124));


        ChatUtil.deleteByUsersCountLessThen(chats, 1000);
        for (Chat chat : chats) {
            System.out.println(chat);
        }

        System.out.println();

//        ChatUtil.compareCountOfUsersAndNames(chats);
//        for (Chat chat : chats) {
//            System.out.println(chat);
//        }

        System.out.println();

        ChatUtil.compareNames(chats);
        for (Chat chat : chats) {
            System.out.println(chat);
        }

        System.out.println();

    }
}
