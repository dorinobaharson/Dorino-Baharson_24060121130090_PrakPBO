/*
 * File : Person.java
 * Deskripsi : Person database awal
 * Penulis : Dorino Baharson
 * Tanggal : 31/5/2023 / 24060121130090
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person (int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
