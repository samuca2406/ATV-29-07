package cadastro;
import java.util.Scanner;
public class ferramentas {
	 public static void cadastrar1(Scanner teclado) {
	        System.out.println("---- SEJA BEM-VINDO À ÁREA DE CADASTRO DE FERRAMENTAS ----");

	        System.out.print("Digite o nome da ferramenta: ");
	        String nomeFerramenta = teclado.nextLine();

	        System.out.print("Digite o tipo da ferramenta (Manual ou Elétrica): ");
	        String tipoFerramenta = teclado.nextLine();

	        System.out.print("Digite a marca da ferramenta: ");
	        String marca = teclado.nextLine();

	        System.out.print("Digite o modelo da ferramenta: ");
	        String modelo = teclado.nextLine();

	        System.out.print("Digite a quantidade em estoque: ");
	        int quantidade = teclado.nextInt();
	        
	        System.out.println("\n--- Dados Cadastrados ---");
	        System.out.println("Nome da ferramenta: " + nomeFerramenta);
	        System.out.println("Tipo: " + tipoFerramenta);
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	       
	        System.out.println("Quantidade em estoque: " + quantidade);

	        System.out.println("\n\nDigite 1 para voltar ao menu:");
	        int voltar = teclado.nextInt();

	        if (voltar == 1) {
	            Main.voltaraoMenu();
	        } else {
	            System.out.println("Encerrando o programa.");
	        }

	        
	    }
}
