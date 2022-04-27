package cn.net.exer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName
 * Description:
 * Date 2022/4/20 15:16
 *
 * @User : TThh
 * @since JDK 17.0
 */
public class ListTest_QuChong {
    /*
    在List内去重
     */

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(2);
        list.add(9);
        list.add(5);
        List<Integer> list1 = duplicateList(list);
        for(Integer element : list1){
            System.out.println(element);
        }
    }

    public static List duplicateList(List list){
        HashSet set = new HashSet();
        set.addAll(list);

        return new ArrayList(set);

    }

}
