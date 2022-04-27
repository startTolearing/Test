package cn.net.exer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName
 * Description:
 * Date 2022/4/19 21:50
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class ComparableTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

//        Student[] stu = new Student[]{
//                new Student("Bob" , 15 , 89) ,
//                new Student("Jerry" , 14 , 69),
//                new Student("AiHua" , 18 , 99)
//        };

        list.add(new Student("Bob" , 15 , 89));
        list.add(new Student("LiHua" , 18 , 99));
        list.add(new Student("Jerry" , 14 , 69));
//        list.get(0).compareTo(list.get(1));


//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        Arrays.sort(stu);
//        for (Student element:
//             stu) {
//            System.out.println(element);
//        }
        Collections.sort(list);

        System.out.println(list);
    }

}

class Student implements Comparable{

    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student st){
//            if(this.age > st.age)return 1;
//            else if(this.age < st.age)return -1;
//            else return 0;
//            return Integer.compare(this.score , st.score);
//            return this.name.compareTo(st.name);

//            return -Integer.compare(this.age , st.age);

            if(this.age > st.age)return 1;
            else if(this.age < st.age)return -1;
            else{
                return -this.name.compareTo(st.name);
            }

        }
        throw new RuntimeException("输入类型不匹配");
//        return 0;
    }
}