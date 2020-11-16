package BaseType;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Arrays;

public class BaseTtpe {
    public static void main(String[] args){
        //byteType();
        //shortType();
        intType();

    }

    /**
     * 关于基本类型byte的封装类
     */
    public static void byteType(){
        byte num1 = -128;
        byte num2 = 127;
        //byte num3 = 128;
        //byte -128~127
        //-2的7次方~ 2的7次方-1
        Byte byte1 = new Byte("1");
        Byte byte2 = new Byte((byte)1);
        Byte cache[] = new Byte[-(-128)+127+1];
        for (int i = 0; i<cache.length;i++){
            cache[i]= new Byte((byte)(i - 128));
            //System.out.println("cache["+i+"]=="+cache[i]);
        }
       /* System.out.println(cache.length);
        System.out.println((byte)128);*/
        //System.out.println((byte)128);
        //System.out.println( Byte.valueOf((byte)128));
        //(byte)128  强制转换  结果为-128

        Byte.parseByte("10"); //String 转 byte
        Byte.valueOf("21"); //String 转 byte
        System.out.println(Integer.decode("0xff"));

        // parseInt, valueOf, decode的区别
        //parseInt 接收String字符串  转成Int返回
        //valueOf  字符串或者其他数字类型
        //decode   解析字符串，可以把八进制，十进制，十六进制字符串转成int等类型
        // 八进制：0开头的整数字符串
        // 十六进制：#开头或者0X、0x
    }

    /**
     * 关于基本类型short的封装类Short
     */
    public  static void shortType(){
        //对象初始化：接受short和字符串参数
        Short short1 = new Short("1");
        Short short2 = new Short((short) 1);
        short num4 = -32768;
        short num5 = 32767;
        // -2的15次方~2的15次方-1
        //1.valueOf方法的参数类型为short且参数大小不超过byte类型范围时，直接从ShortCache缓存数字中获取
        Short.valueOf((short) 127);
        System.out.println(Short.valueOf((short) 127));
        //2.valueOf方法的参数类型为short且参数大小超过byte类型范围时，直接返回根据参数new出的Short实例对象，
        Short.valueOf((short) 128);
        System.out.println(Short.valueOf((short) 128));
        //二进制按byte反转
        Short.reverseBytes((short) 1000);
        System.out.println(0xFF00);

        System.out.println(Short.reverseBytes((short) 1000));
    }

    /**
     * 关于基本类型int的封装类Integer
     */
    public static void intType(){
        //创建Integer对象以及初始化
        Integer integer = new Integer(10);
        Integer integer1 = new Integer("10");

        //System.setProperty("kkk","1111");
        //根据指定名字返回系统属性
        //目前来看，此方法只适合值为整数的属性
        //System.out.println(getInteger("kkk",null));返回Integer类型1111
        //当不存在此属性，则返回null
        //System.out.println(Integer.getInteger("java.home"));
        //当属性值不是整数，则返回null
        //System.out.println(System.getProperty("java.home"));
        Integer a = new Integer(1);
        try{
           Integer.decode("asd");
            a = 2;
        }catch (NumberFormatException e){}
        // 2<<3;   16
        // 2<<2;   8
        // 2<<1;   4
        // 2<<0;   2

        // 3<<0;   3
        // 3<<1;   6
        // 3<<2;   12
        // 3<<3;   24
        // a<<b  相当于a*2b （b==0时则视为不进行右移运算，还是原来的值）
        //System.out.println(3<<1);
        // 2>>1;
        System.out.println(2>>3);

        // System.out.println(a);





    }

    public static Integer getInteger(String nm, Integer val) {
        String v = null;
        try {
            v = System.getProperty(nm);
        } catch (IllegalArgumentException | NullPointerException e) {
        }
        if (v != null) {
            try {
                return Integer.decode(v);
            } catch (NumberFormatException e) {//decode处理非整数字符串时直接抛出异常，return不执行，执行catch处理，然后继续往下执行
            }
        }
        return val;
    }

}
