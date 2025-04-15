import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoas> lista = new ArrayList<>();

        System.out.println("Digite nome e sexo separados por vírgula (ex: Maria,Feminino). Digite 'sair' para encerrar:");

        while (true) {
            String linha = scanner.nextLine();
            if (linha.equalsIgnoreCase("sair")) break;

            String[] partes = linha.split(",");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();
                lista.add(new Pessoas(nome, sexo));
            } else {
                System.out.println("Formato inválido. Use: Nome,Sexo");
            }
        }

        List<Pessoas> mulheres = lista.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        System.out.println("\nMulheres na lista:");
        mulheres.forEach(p -> System.out.println(p.getNome()));
    }
}
