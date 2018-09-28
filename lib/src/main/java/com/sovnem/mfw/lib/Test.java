package com.sovnem.mfw.lib;

/**
 * Created by zhjh on 2018/4/16.
 */

public class Test {
   static int[] bb = {10,12,11};
    public static void main(String[] args){
        fuck(bb);
    }

    private static void fuck(int[] aa) {
        bb = new int[]{1, 2, 3};
        for (int k:aa){
            System.out.println(k);
        }
    }
}
