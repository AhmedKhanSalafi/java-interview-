import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {


        Map<String,Integer> hashmapex = new HashMap<>();
        hashmapex.put("one",10);
        hashmapex.put("two",20);
        hashmapex.put("three",30);
        hashmapex.put("four",40);
        hashmapex.put("five",50);

        System.out.println(hashmapex);

        for (Map.Entry<String,Integer> entry : hashmapex.entrySet()){

            System.out.println("key ->" + entry.getKey());
            System.out.println("value ->" + entry.getValue());

            hashmapex.forEach((k,v)->{
                System.out.println("key"+" "+k);
                System.out.println("value"+ " "+v);
            });
            }
        }
    }

