package oop.lesson10.task;

/**
 * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращающую инициалы в формате "Ф.И.О".
 * Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(initials("Pakhomov", "Dmitry", "Nikolaevich"));
    }

    public static String initials(String surname,String name,  String patronymicName) {
        String surnameLetter = Character.toString(surname.charAt(0)).toUpperCase();
        String nameLetter = Character.toString(name.charAt(0)).toUpperCase();
        String lastNameLetter = Character.toString(patronymicName.charAt(0)).toUpperCase();
        return surnameLetter + "." + nameLetter  + "." + lastNameLetter;
    }

}
