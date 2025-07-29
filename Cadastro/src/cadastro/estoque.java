package cadastro;
import java.util.Scanner;

public class estoque {

    public static void cadastrar2(Scanner teclado) {
        String[] nomes = {"Furadeira", "Martelo", "Serra Elétrica", "Alicate", "Lixadeira"};
        String[] tipos = {"Elétrica", "Manual", "Elétrica", "Manual", "Elétrica"};
        String[] marcas = {"Bosch", "Tramontina", "Makita", "Vonder", "DeWalt"};
        String[] modelos = {"X120", "M55", "SE900", "A10", "L600"};
        String[] voltagens = {"220V", "N/A", "110V", "N/A", "220V"};

        System.out.println("---- SEJA BEM-VINDO À CONSULTA DE ESTOQUE ----");
        System.out.println("Escolha qual ferramenta deseja consultar:");
        System.out.println("1 - Furadeira");
        System.out.println("2 - Martelo");
        System.out.println("3 - Serra Elétrica");
        System.out.println("4 - Alicate");
        System.out.println("5 - Lixadeira");

        int escolha = teclado.nextInt();

        
        if (escolha >= 1 && escolha <= 5) {
            System.out.println("\nNome da ferramenta: " + nomes[escolha - 1]);
            System.out.println("Tipo: " + tipos[escolha - 1]);
            System.out.println("Marca: " + marcas[escolha - 1]);
            System.out.println("Modelo: " + modelos[escolha - 1]);
            System.out.println("Voltagem: " + voltagens[escolha - 1]);
        } else {
            System.out.println("Opção inválida.");
        }


        System.out.println("\n\nDigite 1 para voltar ao menu:");
        int voltar = teclado.nextInt();
        if (voltar == 1) {
            Main.voltaraoMenu();  
        } else {
            System.out.println("Encerrando o nosso sistema, agradeço a atenção.");
        }
    }
}
