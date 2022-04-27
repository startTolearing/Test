package cn.net.java;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName
 * Description:
 * Date 2022/4/19 21:01
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class TreeSetTest {

    /*
    1.向TreeSet中添加的数据，要求是相同类的对象
    2.两种排序方式：自然排序 和 定制排序

    3.自然排序中，比较两个对象是否相同标准为：compareTo()返回0 ， 不再是equals（）

     */

    @Test
    public void test01(){
        TreeSet set = new TreeSet();
        //举例一
//        set.add(123);
//        set.add(-123);
//        set.add(13);
//        set.add(156);

        //举例二
//        set.add("AC");
//        set.add("BC");
//        set.add("bC");
//        set.add("aC");

        //举例三
        set.add(new User("Tom" , 12));
        set.add(new User("Jerry" , 22));
        set.add(new User("Bob" , 15));
        set.add(new User("LiHua" , 18));
        set.add(new User("HanMeiMei" , 17));


        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
class User implements Comparable{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
//按照i姓名从小到大
    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User) o;
            return this.name.compareTo(user.name);
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
