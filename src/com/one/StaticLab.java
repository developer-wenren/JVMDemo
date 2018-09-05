package com.one;

/*
- 静态方法调用

- Coding By One ON 09/05
*/
public class StaticLab {
    public static void sayHello(String[] args) {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        StaticLab.sayHello(args);
    }
    /**
     * Classfile /Users/MrAlien/Nustore Files/One/OpenSource/JVMDemo/out/production/JVMDemo/com/one/StaticLab.class
     *   Last modified Sep 5, 2018; size 626 bytes
     *   MD5 checksum 2bd249c0f2cceb4bdb5ec01caee63fd6
     *   Compiled from "StaticLab.java"
     * public class com.one.StaticLab
     *   minor version: 0
     *   major version: 52
     *   flags: ACC_PUBLIC, ACC_SUPER
     * Constant pool:
     *    #1 = Methodref          #7.#22         // java/lang/Object."<init>":()V
     *    #2 = Fieldref           #23.#24        // java/lang/System.out:Ljava/io/PrintStream;
     *    #3 = String             #25            // hello
     *    #4 = Methodref          #26.#27        // java/io/PrintStream.println:(Ljava/lang/String;)V
     *    #5 = Methodref          #6.#28         // com/one/StaticLab.sayHello:([Ljava/lang/String;)V
     *    #6 = Class              #29            // com/one/StaticLab
     *    #7 = Class              #30            // java/lang/Object
     *    #8 = Utf8               <init>
     *    #9 = Utf8               ()V
     *   #10 = Utf8               Code
     *   #11 = Utf8               LineNumberTable
     *   #12 = Utf8               LocalVariableTable
     *   #13 = Utf8               this
     *   #14 = Utf8               Lcom/one/StaticLab;
     *   #15 = Utf8               sayHello
     *   #16 = Utf8               ([Ljava/lang/String;)V
     *   #17 = Utf8               args
     *   #18 = Utf8               [Ljava/lang/String;
     *   #19 = Utf8               main
     *   #20 = Utf8               SourceFile
     *   #21 = Utf8               StaticLab.java
     *   #22 = NameAndType        #8:#9          // "<init>":()V
     *   #23 = Class              #31            // java/lang/System
     *   #24 = NameAndType        #32:#33        // out:Ljava/io/PrintStream;
     *   #25 = Utf8               hello
     *   #26 = Class              #34            // java/io/PrintStream
     *   #27 = NameAndType        #35:#36        // println:(Ljava/lang/String;)V
     *   #28 = NameAndType        #15:#16        // sayHello:([Ljava/lang/String;)V
     *   #29 = Utf8               com/one/StaticLab
     *   #30 = Utf8               java/lang/Object
     *   #31 = Utf8               java/lang/System
     *   #32 = Utf8               out
     *   #33 = Utf8               Ljava/io/PrintStream;
     *   #34 = Utf8               java/io/PrintStream
     *   #35 = Utf8               println
     *   #36 = Utf8               (Ljava/lang/String;)V
     * {
     *   public com.one.StaticLab();
     *     descriptor: ()V
     *     flags: ACC_PUBLIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: aload_0
     *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     *          4: return
     *       LineNumberTable:
     *         line 8: 0
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0       5     0  this   Lcom/one/StaticLab;
     *
     *   public static void sayHello(java.lang.String[]);
     *     descriptor: ([Ljava/lang/String;)V
     *     flags: ACC_PUBLIC, ACC_STATIC
     *     Code:
     *       stack=2, locals=1, args_size=1
     *          0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     *          3: ldc           #3                  // String hello
     *          5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
     *          8: return
     *       LineNumberTable:
     *         line 10: 0
     *         line 11: 8
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0       9     0  args   [Ljava/lang/String;
     *
     *   public static void main(java.lang.String[]);
     *     descriptor: ([Ljava/lang/String;)V
     *     flags: ACC_PUBLIC, ACC_STATIC
     *     Code:
     *       stack=1, locals=1, args_size=1
     *          0: aload_0
     *          1: invokestatic  #5                  // Method sayHello:([Ljava/lang/String;)V
     *          4: return
     *       LineNumberTable:
     *         line 13: 0
     *         line 14: 4
     *       LocalVariableTable:
     *         Start  Length  Slot  Name   Signature
     *             0       5     0  args   [Ljava/lang/String;
     * }
     * SourceFile: "StaticLab.java"
     */
}
