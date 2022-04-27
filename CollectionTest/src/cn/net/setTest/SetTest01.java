package cn.net.setTest;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * ClassName
 * Description:
 *          Set接口 ;
 *          /----->Set接口是无序的 ， 不可重复的数据
 *              /------> HashSet  作为Set接口的主要实现类 ：线程不安全 ， 可以存储null
 *                   /------> LinkedHashSet ：作为HashSet的子类 ， 遍历其内部数据时，可以按照添加的顺序遍历
 *              /------> TreeSet :可以按照添加的对象指定属性，进行排序。
 *
 *
*     1.
 *
 *
 *
 * Date 2022/4/17 17:17
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class SetTest01 {
    /*
    一：Set:存储无序，不可重复的数据
    1.无序性： 不等于随机性。存储的数据在底层数组中并非按照数组索引的书需添加，而是根据数据的HashCode值

    2.不可重复性：保证添加的元素按照equals方法判断时，不能返回true ， 即：相同的元素只能添加一个

    二、添加元素的过程：以HashSet为例：



     */

    @Test
    public void test01(){
        HashSet set = new HashSet();
        set.add(123);
        set.add(852);
        set.add("小黄");
        set.add("AA");
        set.add(63.2);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    //LinedHashSet作为HashSet的子类，再添加数据的同时，每个数据还维护了两个引用，

    @Test
    public void test2(){
        HashSet set = new LinkedHashSet();
        set.add(123);
        set.add(852);
        set.add("小黄");
        set.add("AA");
        set.add(63.2);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }

    }







}
