package com.sovnem.mfw.myapplication;

/**
 * Created by zhjh on 2018/3/27.
 */

public class People {
    String id;
    Mdd mdd;

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", mdd=" + mdd +
                '}';
    }

    public Mdd getMdd() {
        return mdd;
    }

    public void setMdd(Mdd mdd) {
        this.mdd = mdd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class Mdd{
        String mddName;
        String mddId;

        @Override
        public String toString() {
            return "Mdd{" +
                    "mddName='" + mddName + '\'' +
                    ", mddId='" + mddId + '\'' +
                    '}';
        }
    }
}
