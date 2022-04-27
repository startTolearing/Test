package cn.net.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName
 * Description:
 * Date 2022/4/20 11:19
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class EmployeeTest {
    @Test
    public void test02(){

        TreeSet<EmPloyee> tree = new TreeSet<>(new Comparator<EmPloyee>() {
            @Override
            public int compare(EmPloyee o1, EmPloyee o2) {
                if(o1.getBirthday().getYear() < o2.getBirthday().getYear())return 1;
                else if(o1.getBirthday().getYear() > o2.getBirthday().getYear())return -1;
                else{
                    if(o1.getBirthday().getMonth() < o2.getBirthday().getMonth())return 1;
                    else if(o1.getBirthday().getMonth() > o2.getBirthday().getMonth())return -1;
                    else {
                        if(o1.getBirthday().getDay() < o2.getBirthday().getDay())return 1;
                        else if(o1.getBirthday().getDay() > o2.getBirthday().getDay())return -1;
                        else return 0;
                    }
                }
            }
        });


        tree.add(new EmPloyee("Tom" , 12 , new MyDate(2001 , 5 , 1)));
        tree.add(new EmPloyee("Bob" , 15 , new MyDate(2008 , 5 , 15)));
        tree.add(new EmPloyee("LiHua" , 18 , new MyDate(2000 , 7 , 12)));
        tree.add(new EmPloyee("Mary" , 16 , new MyDate(2005 , 12 , 11)));
        tree.add(new EmPloyee("XiaoMing" , 19 , new MyDate(2002 , 3 , 21)));

        Iterator it = tree.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }






    @Test
    public void test01() {

        TreeSet<EmPloyee> tree = new TreeSet<>();
        tree.add(new EmPloyee("Tom" , 12 , new MyDate(2001 , 5 , 1)));
        tree.add(new EmPloyee("Bob" , 15 , new MyDate(2008 , 5 , 15)));
        tree.add(new EmPloyee("LiHua" , 18 , new MyDate(2000 , 7 , 12)));
        tree.add(new EmPloyee("Mary" , 16 , new MyDate(2005 , 12 , 11)));
        tree.add(new EmPloyee("XiaoMing" , 19 , new MyDate(2002 , 3 , 21)));

        Iterator it = tree.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}

class EmPloyee implements Comparable<EmPloyee>{
    private String name;
    private int age;
    private MyDate birthday;

    public EmPloyee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public EmPloyee() {
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "EmPloyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmPloyee emPloyee = (EmPloyee) o;

        if (age != emPloyee.age) return false;
        if (name != null ? !name.equals(emPloyee.name) : emPloyee.name != null) return false;
        return birthday != null ? birthday.equals(emPloyee.birthday) : emPloyee.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }


    //按照i姓名的顺序排
    @Override
    public int compareTo(EmPloyee o) {
        return this.name.compareTo(o.name);
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}