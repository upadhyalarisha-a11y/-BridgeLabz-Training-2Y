import java.util.*;

public class UniqueStringChar {
    public static void main(String[] args) {
        String s ="1234&98SB";
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                int a = map.get(c);
                map.put(c,a++);
            }
        }
        Boolean is = true;
        for(int val:map.values()){
            if(val>1)  is = false;
        }
        System.out.println(is);

    }
}