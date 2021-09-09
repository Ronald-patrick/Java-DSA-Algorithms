package DataStructures1;

import java.util.HashMap;
import java.util.Map;

public class DS5_HashMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Mosh");
        map.put(2,"sdf");
        map.putIfAbsent(2,"Ronald");
        System.out.println(map.containsValue("sdf"));
        System.out.println(map);

        for (var item:map.entrySet())
        {
            System.out.println(item.getValue());
        }
        System.out.println(getNonRepeat("a green apple"));
    }

    public static char getNonRepeat(String k)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : k.toCharArray())
        {
            int cn = map.get(c);
        }
        return 'a';
    }
}
