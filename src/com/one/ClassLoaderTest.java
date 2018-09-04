package com.one;

import java.io.InputStream;

/**
 * - 类加载器对instanceof的影响
 * 不同加载器加载同一个类,导致有两个类名相同,但本质不同的类,用
 * instanceof 就可以区分
 * - Coding By One ON 09/03
 *
 * @author One
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream in = getClass().getResourceAsStream(fileName);
                    if (in == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[in.available()];
                    in.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (Exception e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = myLoader.loadClass("com.one.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
//        class com.one.ClassLoaderTest
        System.out.println(obj instanceof ClassLoaderTest);
//        false

    }

}
