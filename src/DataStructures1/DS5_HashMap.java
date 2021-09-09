package DataStructures1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DS5_HashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Mosh");
        map.put(2,"sdf");
        map.putIfAbsent(2,"Ronald");
//        System.out.println(map.containsValue("sdf"));
//        System.out.println(map);
//
//        for (var item:map.entrySet())
//        {
//            System.out.println(item.getValue());
//        }
        System.out.println(getNonRepeat("a green apple"));

        //Hash Set

        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,4,4,5,5,5,6};
        for(var k : numbers)
        {
            set.add(k);
        }
        System.out.println(set);

        //Hash Table

        HashTables table = new HashTables();
        table.put(6,"A");
        table.put(8,"B");
        table.put(1,"C");
        table.put(1,"Dsa");
        table.remove(1);
        System.out.println(table.get(6));
    }

    public static char getNonRepeat(String k)
    {
        Map<Character,Integer> map = new HashMap<>();
        var chars = k.toCharArray();
        for(char c : chars)
        {
            var count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c , count+1);
        }

        for(char c : chars)
        {
            if(map.get(c)==1)
                return c;
        }
        return Character.MIN_VALUE;
    }
}
