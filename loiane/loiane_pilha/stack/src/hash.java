import java.util.HashMap;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        
        hm.put(1, "Valor 1");
        hm.put(2, "Valor 2");
        hm.put(3, "Valor 3");
        
        System.out.println("Size: " + hm.size());

        System.out.println(hm.values());
        
    }
}
