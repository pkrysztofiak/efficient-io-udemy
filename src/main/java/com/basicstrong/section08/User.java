package com.basicstrong.section08;

import com.github.javafaker.Faker;

import java.io.*;

public class User implements Serializable {

    private final int id;
    private transient String firstName;
    private transient String lastName;

    public User(int id) {
        this.id = id;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(Faker.instance().name().firstName());
        out.writeUTF(Faker.instance().name().lastName());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        firstName = in.readUTF();
        lastName = in.readUTF();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file1 = new File("section08/user1.bin");

        User user1 = new User(1);
        var out = new ObjectOutputStream(new FileOutputStream(file1));
        out.writeObject(user1);

        var in = new ObjectInputStream(new FileInputStream(file1));
        System.out.println(in.readObject());

        File file2 = new File("section08/user2.bin");
        User user2 = new User(2);
        var out2 = new ObjectOutputStream(new FileOutputStream(file2));
        out2.writeObject(user2);
        var in2 = new ObjectInputStream(new FileInputStream(file2));
        System.out.println(in2.readObject());




    }
}
