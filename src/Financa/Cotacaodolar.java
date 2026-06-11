import java.util.Scanner;

 class Cotacaodolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a cotacao do dolar?");
        double cot = sc.nextDouble();
        System.out.println("Quantos dolares voce deseja?");
        double valor = sc.nextDouble();
        System.out.println("Valor em Reais Necessario:" + CurrencyConverter.Converter(cot, valor));

        sc.close();
    }
}


class CurrencyConverter{
static double IOF = 1.06;

static double Converter(double cotacao, double valordesejado){
        return (cotacao * valordesejado) * IOF;
};

}


