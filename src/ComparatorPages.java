import java.util.Comparator;
import java.util.Map;

public class ComparatorPages implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return Integer.compare(o1.getValue().getPaginas(),o2.getValue().getPaginas());
    }
}
