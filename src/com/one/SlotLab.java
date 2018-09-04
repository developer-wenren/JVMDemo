package com.one;

/*
- 局部变量,变量槽
变量槽存在复用的效果,使用后再被复用前会占用内存,不被回收.
- Coding By One ON 09/04
*/
public class SlotLab {
    public static void main(String[] args) {
        {//1
            byte[] placeholder = new byte[64 * 1024 * 1024];
            placeholder = null; // 3
        } //1
//        int a = 0; //2
        System.gc();
        /**
         * 1
         * [GC (System.gc())
         * 68198K->66072K(125952K), 0.0022902 secs]
         * [Full GC (System.gc())
         * 66072K->65934K(125952K), 0.0207439 secs]
         *
         * 2
         * [GC (System.gc())  68198K->66072K(125952K), 0.0013347 secs]
         * [Full GC (System.gc())  66072K->398K(125952K), 0.0070295 secs]
         *
         * 3
         * [GC (System.gc())  68198K->66008K(125952K), 0.0009925 secs]
         * [Full GC (System.gc())  66008K->398K(125952K), 0.0252406 secs]
         */
    }
}
