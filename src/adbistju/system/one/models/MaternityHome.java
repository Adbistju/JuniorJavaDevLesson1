package adbistju.system.one.models;

public class MaternityHome {
    public static Person getNewPerson(String firstName, String lastName, String middleName, String country, String address, String phone, int age, Gender gender){
        return new Person(firstName, lastName, middleName, country, address, phone, age, gender);
    }
}
