package cadastro;

import java.util.Scanner;
public class Main {
	 public static void voltaraoMenu() {
	        String[] args = null;
	        main(args);
	    }
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
   	  System.out.println("bem vindo ao nosso menu principal, por favor escolher um numero a baixo.");
   	  System.out.println("Você quer acessar qual dos nossos menus?\n  1- cadastro de ferramentas \n 2- consulta de estoque \n 3- atualização de estoque \n ou 4- calcular valor? ");
         int escolha = teclado.nextInt();
         if (escolha == 1) {
             ferramentas.cadastrar1(teclado);
         } else if (escolha == 2) {
             estoque.cadastrar2(teclado);
         } else if (escolha == 3) {
            atualizar.cadastrar3(teclado);
         } else if (escolha == 4) {
             calcular.cadastrar4 (teclado);
          
         } else {
             System.out.println("Seção inválida.");
         }

	}

}
