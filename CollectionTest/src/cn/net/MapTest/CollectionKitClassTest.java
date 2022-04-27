package cn.net.MapTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.copy;

/**
 * ClassName
 * Description:
 * Date 2022/4/22 12:32
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class CollectionKitClassTest {
    /*
reverse(List)：反转 List 中元素的顺序
shuffle(List)：对 List 集合元素进行随机排序
sort(List)：根据元素的自然顺序对指定 List 集合元素升序排序
sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
Object min(Collection)
Object min(Collection，Comparator)
int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
void copy(List dest,List src)：将src中的内容复制到dest中
boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所旧值
     */

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        System.out.println(list);
        //导致集合中元素的顺序
        Collections.reverse(list);
        System.out.println(list);
        //shuffle(List)：对 List 集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println(list);
        //sort(List)：根据元素的自然顺序对指定 List 集合元素升序排序
        Collections.sort(list);
        System.out.println(list);
        //定制排序（在数据所在类中 ， 没有重写CompareTo() , 情况下，按照自己的意愿重新定制排序规则）
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1 , o2);
            }
        });
        System.out.println(list);

        //swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
        Collections.swap(list, 0 , 3);
        System.out.println(list);

        //Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        Comparable max = Collections.max(list);
        System.out.println("max = " + max);
        //Object min(Collection)
        Comparable min = Collections.min(list);
        System.out.println("min = " + min);

        //int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
        List doubles = new ArrayList();
        doubles.add(1.2);
        doubles.add(1.2);
        doubles.add(3.6);
//        doubles.add(1.0);
        int frequency = Collections.frequency(doubles , 1.2);
        System.out.println(frequency);

        //void copy(List dest,List src)：将src中的内容复制到dest中
        System.out.println(list);
      //  System.out.println(dou);
        copy(list , doubles);
        System.out.println(list);


    }

}
