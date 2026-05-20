/*  A dona de um pensionato possui dez quartos para alugar para estudantes, 
sendo esses quartos identificados pelos números 0 a 9.  

Fazer um programa que inicie com todos os dez quartos vazios, 
e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos 
(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro
 de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu 
 (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
  um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.
*/

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) throws Exception{
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o numero de estudantes");
    int N = sc.nextInt();
    Estudante[] vetor = new Estudante[10];
    sc.nextLine();

    for(int i = 0; i < N; i++){
        System.out.println("Digite o nome do estudante " + (i+1));
        String nome = sc.nextLine();
         System.out.println("Digite o email do estudante " + (i+1));
        String email = sc.nextLine();
        System.out.println("Digite o quarto do estudante " + (i+1));
        int quarto = sc.nextInt();
        sc.nextLine();
        vetor[quarto] = new Estudante(nome, email, quarto);
    }

    for(int i = 0; i < 10; i++){
        if (vetor[i] != null) {
            System.out.println(vetor[i].quarto + ":" + vetor[i].nome + "," + vetor[i].email);
        }
    }

    sc.close();
}
}

class Estudante {
    String nome;
    String email;
    int quarto;

    Estudante(String nome,String email,int quarto){
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

}