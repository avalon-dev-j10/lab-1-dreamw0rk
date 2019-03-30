package ru.avalon.java.dev.j10.labs.models;
import java.time.*;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

    private String serialandnumber;
    private String name;
    private String surname;
    private String patronymic;
    private String secondName;
    private LocalDate birthDate;
    private LocalDate dateOfIssue;
    private String issuingAuthority;

    public Passport(String serialandnumber, String name, String surname, String patronymic, String secondName, LocalDate birthDate, LocalDate dateOfIssue, String issuingAuthority) {
        this.serialandnumber = serialandnumber;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.dateOfIssue = dateOfIssue;
        this.issuingAuthority = issuingAuthority;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */

        String fullName = null;
        if ( (name!=null) && (surname!=null) && (patronymic!=null))
            fullName = name + " " + surname +" "+ patronymic;
        if (((patronymic == null) || (patronymic == "")) && (secondName!=null))
            fullName = name + " " + secondName.charAt(0) + ". " + surname;
        else
        if ((patronymic ==null) && (secondName==null))
            fullName = name + " " + surname;
//        else
//            System.out.println("Коряво написал");
        return fullName;
    }
}