package com.company;

/**
 * 垃圾收集器的组合为Parallel Scavenge(新生代) + Parallel Old(老年代)
 */
public class Main {
    private static final int _1MB = 1024 * 1024;

    /**
     * VM Param:
     * -verbose:gc -Xms20M -Xmx20M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     *
     * @param args 模拟Minor GC
     */
    public static void testMinorGC(String[] args) {
        // write your code here
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
        /*
        [GC [PSYoungGen: 5928K->488K(6656K)] 5928K->4785K(20480K), 0.0035271 secs] [Times: user=0.03 sys=0.02, real=0.00 secs]
    Heap
    PSYoungGen      total 6656K, used 2720K [0x00000000ff900000, 0x0000000100000000, 0x0000000100000000)
    eden space 6144K, 36% used [0x00000000ff900000,0x00000000ffb2e218,0x00000000fff00000)
    from space 512K, 95% used [0x00000000fff00000,0x00000000fff7a020,0x00000000fff80000)
    to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
    ParOldGen       total 13824K, used 8393K [0x00000000feb80000, 0x00000000ff900000, 0x00000000ff900000)
    object space 13824K, 60% used [0x00000000feb80000,0x00000000ff3b2430,0x00000000ff900000)
    PSPermGen       total 21504K, used 3048K [0x00000000f9980000, 0x00000000fae80000, 0x00000000feb80000)
    object space 21504K, 14% used [0x00000000f9980000,0x00000000f9c7a1a0,0x00000000fae80000)
         */

    }

    /**
     * VM Param:
     * -verbose:gc-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     *
     * @param args 模拟大对象进入老年代
     */
    public static void testBigObject(String[] args) {
        byte[] allocation;
        allocation = new byte[6 * _1MB];
        /**
         * Heap
         *  PSYoungGen      total 9216K, used 2244K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         *   eden space 8192K, 27% used [0x00000000ff600000,0x00000000ff831200,0x00000000ffe00000)
         *   from space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
         *   to   space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
         *  ParOldGen       total 10240K, used 6144K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         *   object space 10240K, 60% used [0x00000000fec00000,0x00000000ff200010,0x00000000ff600000)
         *  PSPermGen       total 21504K, used 3048K [0x00000000f9a00000, 0x00000000faf00000, 0x00000000fec00000)
         *   object space 21504K, 14% used [0x00000000f9a00000,0x00000000f9cfa2a0,0x00000000faf00000)
         */
    }

    /**
     * VM Param:
     * -verbose:gc-Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * -XX:PretenureSizeThreshold=3145728 -XX:-HandlePromotionFailure
     *
     * @param args 分配担保
     */
    public static void tewtHandlePromotion(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4,allocation5,allocation6,allocation7;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation1 = null;
        allocation4 = new byte[2*_1MB];
        allocation5 = new byte[2*_1MB];
        allocation6 = new byte[4*_1MB];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[2*_1MB];
        /**
         * [GC [PSYoungGen: 6176K->751K(9216K)] 6176K->4847K(19456K), 0.0047877 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
         * [Full GC [PSYoungGen: 7083K->0K(9216K)] [ParOldGen: 8192K->4629K(10240K)] 15275K->4629K(19456K) [PSPermGen: 3042K->3041K(21504K)], 0.0197637 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
         * Heap
         *  PSYoungGen      total 9216K, used 2130K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
         *   eden space 8192K, 26% used [0x00000000ff600000,0x00000000ff814820,0x00000000ffe00000)
         *   from space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
         *   to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
         *  ParOldGen       total 10240K, used 4629K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
         *   object space 10240K, 45% used [0x00000000fec00000,0x00000000ff085758,0x00000000ff600000)
         *  PSPermGen       total 21504K, used 3048K [0x00000000f9a00000, 0x00000000faf00000, 0x00000000fec00000)
         *   object space 21504K, 14% used [0x00000000f9a00000,0x00000000f9cfa088,0x00000000faf00000)
         */
    }

    public static void main(String[] args) {
//        testMinorGC(args);
//        testBigObject(args);
//        tewtHandlePromotion(args);
    }


}
