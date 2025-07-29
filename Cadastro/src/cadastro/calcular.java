package cadastro;
import java.util.Scanner;
public class calcular {
 public static void cadastrar4 (Scanner teclado) {
     System.out.println("---- CALCULAR VALOR TOTAL DE PRODUTOS EM ESTOQUE ----");
     System.out.println("Escolha qual ferramenta deseja calcular:");
     System.out.println("1 - Furadeira");
     System.out.println("2 - Martelo");
     System.out.println("3 - Serra Elétrica");
     System.out.println("4 - Alicate");
     System.out.println("5 - Lixadeira");

     int escolha = teclado.nextInt();

     String nomeFerramenta = "";
     double precoUnitario = 0.0;
     int quantidadeEstoque = 0;

     if (escolha == 1) {
         nomeFerramenta = "Furadeira";
         precoUnitario = 250.00;
         quantidadeEstoque = 8;
     } else if (escolha == 2) {
         nomeFerramenta = "Martelo";
         precoUnitario = 45.00;
         quantidadeEstoque = 15;
     } else if (escolha == 3) {
         nomeFerramenta = "Serra Elétrica";
         precoUnitario = 520.00;
         quantidadeEstoque = 5;
     } else if (escolha == 4) {
         nomeFerramenta = "Alicate";
         precoUnitario = 30.00;
         quantidadeEstoque = 12;
     } else if (escolha == 5) {
         nomeFerramenta = "Lixadeira";
         precoUnitario = 310.00;
         quantidadeEstoque = 6;
     } else {
         System.out.println("Ferramenta inválida.");     
     }

     double valorTotal = precoUnitario * quantidadeEstoque;

     System.out.println("\n--- Cálculo do Produto ---");
     System.out.println("Ferramenta: " + nomeFerramenta);
     System.out.println("Preço unitário: R$ " + precoUnitario);
     System.out.println("Quantidade em estoque: " + quantidadeEstoque);
     System.out.println("Valor total em estoque: R$ " + valorTotal);

     System.out.println("\n\nDigite 1 para voltar ao menu:");
     int voltar = teclado.nextInt();
     if (voltar == 1) {
         Main.voltaraoMenu();
     } else {
         System.out.println("Encerrando o programa.");
     }
}}
