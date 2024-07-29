import java.util.TreeSet;
import java.util.Set;
public class TreeSetExample {
	public static void main (String[] args) {
    Set h = new TreeSet();
        
        h.add("nikita");
        h.add("vibha");
        h.add("nikita"); 
        
        for (Object name : h) {
            System.out.println(name);
        }

}
}