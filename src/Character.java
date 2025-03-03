import java.util.HashMap;
import java.util.Map;

public class Character {
    Map<String,Integer> Stats = new HashMap<>();

    public Character() {
        Stats.put("INT", 2);
        System.out.println(Stats);
    }
    public void IncInt(Map<String,Integer> Stats){
        Stats.put("INT",+1);
    }


}
