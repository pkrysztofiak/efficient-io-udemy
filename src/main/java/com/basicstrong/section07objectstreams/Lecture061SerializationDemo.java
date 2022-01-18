package com.basicstrong.section07objectstreams;

import java.io.*;

public class Lecture061SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Player player = new Player();
        player.setLevel(55);
        player.setUserName("Thanos");
        player.setPoints(345657);

        serialize(player, "section07/player.bin");
        Player p = (Player) deserialize("sectionplayer.bin");
        System.out.println(p);
    }

    private static void serialize(Player player, String filename) throws IOException {
        var out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(player);
        out.close();
    }

    private static Object deserialize(String filename) throws IOException, ClassNotFoundException {
        var in = new ObjectInputStream(new FileInputStream(filename));
        Object o = in.readObject();
        in.close();
        return o;
    }
}