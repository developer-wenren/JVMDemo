package com.one;
import java.io.Serializable;

/**
 * Classfile /D:/Private/One/OpenSource/JVMDemo/out/production/JVMDemo/com/one/Main.class
 *   Last modified 2018-8-29; size 363 bytes
 *   MD5 checksum a95b30dcd2a097a8b59dc8008ea0d7e7
 *   Compiled from "Main.java"
 * public class com.one.Main implements java.io.Serializable
 *   SourceFile: "Main.java"
 *   minor version: 0
 *   major version: 51
 *   flags: ACC_PUBLIC, ACC_SUPER
 * Constant pool:
 *    #1 = Methodref          #4.#19         //  java/lang/Object."<init>":()V
 *    #2 = Fieldref           #3.#20         //  com/one/Main.m:I
 *    #3 = Class              #21            //  com/one/Main
 *    #4 = Class              #22            //  java/lang/Object
 *    #5 = Class              #23            //  java/io/Serializable
 *    #6 = Utf8               m
 *    #7 = Utf8               I
 *    #8 = Utf8               <init>
 *    #9 = Utf8               ()V
 *   #10 = Utf8               Code
 *   #11 = Utf8               LineNumberTable
 *   #12 = Utf8               LocalVariableTable
 *   #13 = Utf8               this
 *   #14 = Utf8               Lcom/one/Main;
 *   #15 = Utf8               inc
 *   #16 = Utf8               ()I
 *   #17 = Utf8               SourceFile
 *   #18 = Utf8               Main.java
 *   #19 = NameAndType        #8:#9          //  "<init>":()V
 *   #20 = NameAndType        #6:#7          //  m:I
 *   #21 = Utf8               com/one/Main
 *   #22 = Utf8               java/lang/Object
 *   #23 = Utf8               java/io/Serializable
 * {
 *   public com.one.Main();
 *     flags: ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1          //  隐式传入 this
 *          0: aload_0
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          4: return
 *       LineNumberTable:
 *         line 71: 0
 *       LocalVariableTable:
 *         Start  Length  Slot  Name   Signature
 *                0       5     0  this   Lcom/one/Main;
 *
 *   public static int inc();
 *     flags: ACC_PUBLIC, ACC_STATIC
 *     Code:
 *       stack=2, locals=0, args_size=0
 *          0: getstatic     #2                  // Field m:I
 *          3: iconst_1
 *          4: iadd
 *          5: ireturn
 *       LineNumberTable:
 *         line 75: 0
 * }
 */
public class Main implements Serializable {
    private static int m;

    public static int inc() {
        return m + 1;
    }

    public  int inc2() {
        int i;
        try {
            i = 1;
            return i;
        } catch (Exception e) {
            i = 2;
            return i;
        } finally {
            i = 3;
        }
    }

}