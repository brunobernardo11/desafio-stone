import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Desafio {
    public static void main (String [] args) {
        List<Produto> itens = new ArrayList<>();
        itens.add(new Produto("Pacote de feijão verde", 1, 500));
        itens.add(new Produto("Truta", 3, 2000));
        itens.add(new Produto("Vinagre de maçã", 1, 700));
        itens.add(new Produto("Salame", 4, 600));

        List<String> emails = new ArrayList();
        emails.add("roberto@gmail.com");
        emails.add("cleiton@gmail.com");
        emails.add("jeferson@gmail.com");
        emails.add("ananias@gmail.com");
        emails.add("claudette@gmail.com");
        emails.add("rogerio@gmail.com");
        emails.add("humberto@gmail.com");
        emails.add("clodovil@gmail.com");
        emails.add("josefa@gmail.com");

        System.out.println(calcula(itens, emails));
    }

    public static Map<String, Integer> calcula (List<Produto> itens, List<String> emails) {
        Map<String, Integer> maps = new HashMap<>();

        if (itens.isEmpty() || emails.isEmpty()) {
            return maps;
        }

        int precoTotal = 0;
        for (int i = 0; i < itens.size(); i++) {
            precoTotal = precoTotal + itens.get(i).getValorTotal();
        }

        int divisaoValor = precoTotal / emails.size();
        for (int i = 0; i < emails.size(); i++) {
            maps.put(emails.get(i), divisaoValor);
        }

        if (precoTotal % emails.size() > 0) {
            int resto = precoTotal % emails.size();
            int novoValor = divisaoValor + 1;

            for (int i = 0; i < resto; i++) {
                maps.put(emails.get(i), novoValor);
            }
        }

        return maps;
    }
}

class Produto {
    private String nome;
    private int quantidade;
    private int preco;

    Produto (String nome, int quantidade, int preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getValorTotal () {
        return quantidade * preco;
    }
}
