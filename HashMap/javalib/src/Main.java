import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        // In HashMap the data is stored in the form of key value pairs

        // To add elements int the map we use put()
        map.put(1,"Devendra");
        map.put(2, "Rahul ");
        map.put(3,"Dinesh ");
        map.put(4,"Anand");

        // Hash map store the data in unoredere form

        System.out.println(map.containsKey(2));

        // Containskey() return true or false

        System.out.println(map.get(1));
        // get(key) method will give you the value associated with the key

        map.remove(2);
        // remove method will removes the key value pair associated with the given pair
        System.out.println(map.containsKey(2));

        System.out.println(map.size());
        // size method will give the number of key value pairs present in the map

        // map.clear() will remove all the key value pairs from the map

        System.out.println(map.keySet());
       // map.keySet will give the set of all the keys present in the map

        System.out.println(map.values());
        // map.values will returs the collection of all the values present in the map



        // Now iteration in the map  We iterate by for each loop in the map

        for(Map.Entry<Integer,String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }


    }
}