package cn.net.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName
 * Description:jdk5.0以后新增了foreach循环，用于遍历集合、数组
 * Date 2022/4/16 14:28
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class ForTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("Tom");
        coll.add(2.3);
        coll.add(false);
        //foreach循
        //内部仍然调用了迭代器
        for (Object obj:coll) {
            System.out.println(obj);
        }

    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,5,2,4,6,8};
        for (int element:arr
             ) {
            System.out.println(element);
        }
    }
    @Test
    public void test3(){
        String[] str = new String[]{"MM" , "MM" , "MM"};
//        for (int i = 0; i < str.length; i++) {
//            str[i] = "GG";
//        }
        for(String s : str){
            s = "GG";
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }


}
