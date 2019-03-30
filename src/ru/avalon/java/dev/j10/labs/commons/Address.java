/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    int index;
    String city;
    String street;
    int house;
    int room;

    public Address(int index, String city, String street, int house, int room) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
        this.room = room;
    }

    @Override
    public String toString() {
        return String.format("Адреc: %d %s %s %d %d", index, city, street, house, room);
    }
}