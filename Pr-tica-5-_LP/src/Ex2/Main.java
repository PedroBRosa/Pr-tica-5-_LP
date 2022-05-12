package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> usuario = new ArrayList<>();
        int menu = 0;
        String nome, telefone, user, eMail;
        while (menu != 4) {
            System.out.println("===================  OPÇÕES  =================");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Excluir");
            System.out.println("3 - Pesquisar");
            System.out.println("4 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-4]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("============= CADASTRAR =============");
                    System.out.println("Escreva seu nome");
                    nome = ler.next();
                    System.out.println("Escreva seu telefone");
                    telefone = ler.next();
                    System.out.println("Escreva seu usuario");
                    user = ler.next();
                    System.out.println("Escreva seu email");
                    eMail = ler.next();
                    usuario.add(nome + " " + telefone + " " + user + " " + eMail);
                    break;
                case 2:
                    System.out.println("============= EXCLUIR =============");
                    System.out.println("Escreva o user que deseja excluir: ");
                    user = ler.next();
                    int indice = -1;
                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).contains(user)) indice = i;
                    }
                    if (indice == -1) {
                        System.out.println("Usuario não existe");
                    }else{
                        usuario.remove(indice);
                    }
                    break;
                case 3:
                    System.out.println("============= PESQUISAR =============");
                    System.out.println("Escreva o user que deseja pesquisar: ");
                    user = ler.next();
                    int j = -1;
                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).contains(user)) j = i;
                    }
                    if (j == -1) {
                        System.out.println("Usuario não existe");
                    }else{
                        System.out.println(usuario.get(j));
                    }
                    break;
                case 4:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }
    }
}
