import java.util.HashMap;
import java.util.Map;

public class Character {
    static Map<String,Integer> Stats = new HashMap<>();

    public Character() {
        Stats.put("INT", 2);
        System.out.println(Stats);
    }
    public static void IncInt(){
        Stats.put("INT",Stats.get("INT")+1);
    }
    @Override
    public String toString(){
        return "Stats: "+Stats;
    }


}
