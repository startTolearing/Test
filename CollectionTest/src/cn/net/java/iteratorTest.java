package cn.net.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 内部方法：next() 和 hasnext()
 * 如果还未调用next()或在上一次调用 next 方法之后已经调用了 remove 方法，
 * 再调用remove都会报IllegalStateException。
 * ClassName
 * Description: 集合元素的遍历 使用迭代器接口：Iterator
 * Date 2022/4/16 12:16
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class iteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("Tom");
        coll.add(2.3);
        coll.add(false);

        Iterator iterator = coll.iterator();
        //方式一：
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        //报异常：NoSuchElementException
//        System.out.println(iterator.next());
        //方式二：
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三：推荐
        //hasnext()判断是否还有下一个元素
        while(iterator.hasNext()) {
            //next()①：指针下移②将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("Tom");
        coll.add(2.3);
        coll.add(false);

        Iterator iterator = coll.iterator();
        //错误方式一：
//        while((iterator.next()) != null){
//            System.out.println(iterator.next());
//        }

    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("Tom");
        coll.add(2.3);
        coll.add(false);

        Integer it = 123;
       Iterator iterator = coll.iterator();

       while(iterator.hasNext()){
           Object obj = iterator.next();//此处返回一个对象
           if(it.equals(obj)){
               iterator.remove();
           }
       }
       //此处遍历，因为指针指向了最后，故我们需要将指针重新赋值到前面
        iterator = coll.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

    }

}
