import java.util.HashSet;
import java.util.Set;


public class HashSetExample {
public static void main(String[] args) {
	Set h = new HashSet();

	h.add("nikita");
	h.add("vibha");
    h.add("nikita");
	 
    for (Object name : h) {
        System.out.println(name);
    }

}
}