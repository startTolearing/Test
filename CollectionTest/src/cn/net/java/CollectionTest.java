package cn.net.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ClassName
 * Description:Collection接口中声明的方法 ，
 * 1.向Collection添加数据obj所在类重写equals（）方法
 * 2.
 * 3.removeAll(Collection coll1) 从当前集合中=移除coll1中的所有元素 写equals（）方法
 * Date 2022/4/16 10:37
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(2.3);
       // coll.add(new Person("Jerry" , 20));
        coll.add(new Person("Jerry" , 20));

        //1.contains(Object obj):判断当前对象是否包含obj
        //我们在判断时会调用obj的euqals（）方法
        boolean contains = coll.contains(123);
        System.out.println(contains);

        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(new Person("Jerry" , 20)));

        //2.containsAll(Collection coll1) 判断形参coll1中所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));


    }
    @Test
    public void test2(){
        //3.remove(Collection obj) 从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(2.3);
        // coll.add(new Person("Jerry" , 20));
        coll.add(new Person("Jerry" , 20));
        System.out.println(coll.remove(123));
      //  System.out.println(coll);

        //4.removeAll(Collection coll1) 从当前集合中=移除coll1中的所有元素

        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);



    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(2.3);
       // coll.add(new Person("Jerry" , 20));

        //5.retain(Collection coll1)交集 ： 获取当前集合和coll1集合的交集，并返回给当前集合
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //6.equals(Object obj) 若相反会true 需要当前集合和形参集合元素都相同 判断当前集合和形参
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Tom"));
        coll1.add(2.3);
        System.out.println(coll.equals(coll1));



    }

    @Test
    public void test4(){
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Tom"));
        coll1.add(2.3);

        System.out.println(coll1.hashCode());

        //8.集合转换为数组 toArray()
        Object[] objects = coll1.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        List<String> strings = Arrays.asList("AA", "BB", "CC");
        System.out.println(strings);

        //9.数组转换为集合 asList()
        List<Integer> arr2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr2);


    }

    //iterator() 返回iterator接口的实例


}
