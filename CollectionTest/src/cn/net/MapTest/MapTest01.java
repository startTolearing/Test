package cn.net.MapTest;

import org.junit.Test;

import java.util.*;

/**
 * ClassName
 * Description:
 *
 *      /-----Map:双列数据 ， 存储key-value对的数据 ， ---类似于高中函数
 *              /---HashMap:线程不安全，效率高 , 可以存储null的key和value
 *                  /---LinkedHashMap:保证在遍历map元素时，可以添加的顺序实现遍历
 *                                  原因： 在原有的HashMap底层基础上，添加了一对指针，指向前一个和后一个
*               /---TreeMap:保证添加的key-value对进行排序，实现排序遍历 ， 此时考虑key的自然排序和定制排序
 *                              底层使用红黑树
 *              /---Hashtable:作为古老的实现类,线程不安全，效率低  不可以存储null的key和value
 *                  /---Properties：
 *
 *
 *
 * Date 2022/4/20 15:53
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class MapTest01 {

    /*
* 添加：put(Object key,Object value)
* 删除：remove(Object key)
* 修改：put(Object key,Object value)
* 查询：get(Object key)
* 长度：size()
* 遍历：keySet() / values() / entrySet()
     */

    @Test
    public void test4(){
        Map map = new HashMap();
        map.put("AA" , 1);
        map.put("BB" , 2);
        map.put("CC" , 3);
        map.put("DD" , 4);
        map.put("EE" , 5);
        map.put("FF" , 6);

        System.out.println(map);
        System.out.println("**********");
        //修改操作
        map.put("CC",123);
        System.out.println(map);

        //删除操作
        System.out.println("**********");
        Object aa = map.remove("AA");
        System.out.println(aa);
        System.out.println(map);

        //查询操作
        System.out.println("**********");
        Object bb = map.get("BB");
        System.out.println(bb);

        //遍历操作
        System.out.println("**********");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



    @Test
    public void test1(){
//        Map map = new HashMap();
//        map.put(null , null);


        //产生一个 List 集合，典型实现为 ArrayList
        List list = new ArrayList();
        //添加三个元素
        list.add("Tom");
        list.add("Bob");
        list.add("Marry");
        //构造 List 的迭代器
        Iterator it = list.iterator();
        //通过迭代器遍历元素
        while(it.hasNext()){
            Object obj = it.next();
            //System.out.println(obj);
        }

        //在指定地方添加元素
        list.add(2, 0);

        //在指定地方替换元素
        list.set(2, 1);

        //获得指定对象的索引
        int i=list.indexOf(1);
        System.out.println("索引为："+i);

        //遍历：普通for循环
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }

    }


    @Test
    public void test2(){
        //TreeSet
        //对于TreeSet ： 1.必须添加同种类型的数据。2.若是自定义的类，必须实现Comparable接口,实现其中的抽象方法compareTo():该方法是自己重新定义排序规则
        //              3.可以不重写equals（）和HashCode()
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(8);
        set.add(8);
        set.add(3);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
    @Test
    public void test3(){
        var set = new TreeSet<Animal>();
        set.add(new Animal("Cat" , 12));
        set.add(new Animal("Dog" , 23));
        set.add(new Animal("Mouse" , 2));

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }


}

class Animal implements Comparable{
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Animal) {
            Animal a = (Animal) o;
            if (this.weight > a.weight) return -1;
            else if (this.weight < a.weight) return 1;
            else return 0;
        }
        return 0;
    }
}