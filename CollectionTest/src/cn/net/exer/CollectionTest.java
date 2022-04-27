package cn.net.exer;

import java.util.*;

/**
 * ClassName
 * Description:
 * Date 2022/4/20 10:29
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<Person> set = new HashSet<>();
        set.add(new Person("Bob" , 15));
        set.add(new Person("Tom" , 12));
        set.add(new Person("Mary" , 15));
        set.add(new Person("LiHua" , 19));

        System.out.println(set.contains(new Person("Tom" , 12)));//判断是否包含某个元素
        System.out.println(set.isEmpty());//判断该集合是否为空
//        set.remove(new Person("Mary" , 15));//移除集合中的某个元素
//        System.out.println(set);

        //通过迭代器遍历集合
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("********************分割线**************************");
        //对集合进行排序
       // Collections.sort();


//        iterator = set.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        System.out.println(set);

    }
}

class Person implements Comparable{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person p){
            if(this.age > p.age)return -1;
            else if(this.age < p.age)return 1;
            else{
                return this.name.compareTo(p.name);
            }
        }
        throw new RuntimeException("传入类型不匹配");
    }
}