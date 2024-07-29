import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {
    public static void main(String[] args) {
        Set h = new LinkedHashSet();
        
        h.add("nikita");
        h.add("vibha");
        h.add("nikita"); 
        
        for (Object name : h) {
            System.out.println(name);
        }
    }
}
