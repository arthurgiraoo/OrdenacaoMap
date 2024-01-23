import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Ordem aleatoria---");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história sobre o tempo",256));
            put("Duhig, charles", new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21",432));
        }};

        for(Map.Entry<String, Livro> livro :meusLivros.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }
        System.out.println("--- Ordem de inserção ---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história sobre o tempo",256));
            put("Duhig, charles", new Livro("O poder do hábito",408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21",432));
        }};

        for(Map.Entry<String, Livro> livro :meusLivros1.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }

        System.out.println("--- Ordem alfabetica autores ---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);

        for(Map.Entry<String, Livro> livro :meusLivros2.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }

        System.out.println("--- Ordem alfabetica dos livros ---");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());

        for(Map.Entry<String, Livro> livro :meusLivros3){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }
        System.out.println("---- Ordem paginas Livros ----");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPages());
        meusLivros4.addAll(meusLivros.entrySet());

        for(Map.Entry<String, Livro> livro :meusLivros4){
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        }

      }
}