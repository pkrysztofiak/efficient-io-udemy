package com.basicstrong.section08;

import java.io.*;

public class Subtitles implements Externalizable {

    @Serial
    private static final long serialVersionUID = -8349089312950953664L;

    private String en = "World";
    private String fr = "Monde";
    private String de = "Welt";

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(en);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        en = in.readUTF();
        fr = toFr(en);
        de = toDe(de);
    }

    private String toFr(String en) {
        return "Monde";
    }

    private String toDe(String en) {
        return "Welt";
    }

    @Override
    public String toString() {
        return "Subtitles{" +
                "en='" + en + '\'' +
                ", fr='" + fr + '\'' +
                ", de='" + de + '\'' +
                '}';
    }
}