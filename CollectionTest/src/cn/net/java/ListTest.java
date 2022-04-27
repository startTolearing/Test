package cn.net.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName
 * Description:、---> List存储有序的、可重复的数据
 *          //ArrayList:作为List接口的主要实现类 , 线程不安全（执行效率高）;底层使用Object[] elementData存储
 *          //LinkedList ：底层使用的是双向链表 ， 效率比ArrayList高
 *          //Vector:作为List接口的古老实现类 底层使用Object[] elementData存储
 *
 *
 *     ArrayList 的源码分析：jdk1.7
 *          ArrayList list = new ArrayList();//底层创建了长度是10的数组
 *          list.add(123);//elementData[0] = new Integer(123);
 *          ...
 *          list.add(11);//如果此次的添加导致底层elementData数组容量不够，则扩容
 *          默认情况下，扩容为原来容量的1.5倍，同时需要将原有数组中的数据复制到新的数组中去.
 *
 *    ArrayList 1.8
 *          ArrayList list = new ArrayList();
 *          list.add(123);//第一次调用add()时，底层才创建了长度为10的数组，变更将数据123添加到了elementData中
 *
 *          结论：建议开发中使用带参的构造器ArrayList list = new ArrayList(int capacity);
 *
 *
 *      LinkedList list = new LinkedLish();
 *
 *
 *
 * 面试题ArrayList , LinkedList , Vector 三者的异同
 *          同：三各类都实现了List接口，存储数据的特点相同 ：存储有序的，可重复的数据
 *
 *
 * Date 2022/4/16 14:41
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class ListTest {
    @Test
    public void test1(){


        var list = new ArrayList();
        list.add(123);
        list.add(563);
        list.add("Tom");
        list.add(false);
        System.out.println(list);

        //1. void add(int index , Object obj)
        list.add(1 , "BB");
        System.out.println(list);

        //boolean addAll(int index , Collection eles):从index位置开始将eles中所有元素全部添加
        List list1 = Arrays.asList(1,2,3);
        list.addAll(list1);
        System.out.println(list);
        list.addAll(0 , list1);
        System.out.println(list);

        //3.Object get(int index);获取指定位置的元素
        System.out.println(list.get(1));

    }

    @Test
    public void test2(){

        var list = new ArrayList();
        list.add(123);
        list.add(true);
        list.add("Tom");
        list.add(2.3);
        list.add(55);
        list.add(2.3);
        //int indexOf(Object obj): 返回oj在集合中首次出现的位置
        System.out.println(list.indexOf("Tom"));

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        int index = list.lastIndexOf(2.3);
        System.out.println(index);

        //Object remove(int index) : 移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(5));
        System.out.println(list);

        System.out.println("***************************************");

        //Object set(int index , Object ele): 设置指定index位置的元素为ele
        list.set(1 , false);
        System.out.println(list);

        //List subList(int fromindex , int toindex):返回从fromIndex到toIndex位置上的子集和. 注意：左开右闭
        System.out.println(list.subList(1, 3));

    }




}
