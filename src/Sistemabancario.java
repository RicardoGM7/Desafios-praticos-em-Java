import java.util.Scanner;

 class Sistemabancario {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    ContaBancaria pessoa1;   
    System.out.println("Informe o numero da conta");
    int numberaccount = sc.nextInt();
    sc.nextLine();    
    System.out.println("Informe o nome da conta");
    String nameaccount = sc.nextLine();    
    System.out.println("Deseja criar a conta com saldo inicial?(S/N)");
    String decisaodesaldoinicial = sc.nextLine();
    
    if(decisaodesaldoinicial.equalsIgnoreCase("S")){
        System.out.println("Informe o saldo inicial:");
        Double initialbalance = sc.nextDouble();
        pessoa1 = new ContaBancaria(numberaccount,nameaccount,initialbalance);
    } 
    
    else {
        pessoa1 = new ContaBancaria(numberaccount,nameaccount); 
    }

    System.out.printf("Conta criada com sucesso=%s%n" , pessoa1);   
    
    System.out.printf("Digite o valor de deposito:");
    pessoa1.deposito(sc.nextDouble());
    System.out.printf("%s%n" , pessoa1); 

    System.out.printf("Digite o valor de saque(5 reais de taxa):");
    pessoa1.saque(sc.nextDouble());
    System.out.printf("%s%n" , pessoa1); 



    sc.close();
    }
    
}



class ContaBancaria{
    private int numeroDaConta;
    private String nome;
    private double saldo;

    ContaBancaria(int numeroDaConta,String nome, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    ContaBancaria(int numeroDaConta,String nome){
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }

    int getNumberAccount(){
        return numeroDaConta;
    }

    String getName(){
        return nome;
    }

    double getBalance(){
        return saldo;
    }

    void mudarNome(String newname){
        this.nome = newname;
    }

    void deposito(double valor){
        saldo += valor;
    }

    void saque(double valor){
        saldo -= (valor+5);
    }

    @Override
    public String toString(){
        return String.format("Numero da conta: %d, Nome: %s, Saldo: %.2f.%n", numeroDaConta, nome, saldo);
    }
}