package LidandoComArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class ManipuladorDeArquivo {

    public static void main(String[] args) {

        String path = "C:\\Users\\user\\OneDrive\\Desktop\\Java\\curso-java\\src\\LidandoComArquivos";
        boolean criandopasta = new File(path + "\\out").mkdir(); // criando pasta
        try (BufferedReader bf = new BufferedReader(new FileReader(path + "//items.csv")); // Lendo arquivo
             BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv", true));) { // criando arquivo summary.csv
                                                                                                                                                                                                              
            List<String> itens = bf.readAllLines(); // lendo todas linhas do arquivo items.csv
            for (String item : itens) {
                String[] partes = item.split(",");
                String nome = partes[0];
                double preco = Double.parseDouble(partes[1]);
                int quantidade = Integer.parseInt(partes[2]); // separando cada campo de texto e montando o objeto
                Produto produto = new Produto(nome, preco, quantidade);
                bw.write(produto.toString()); // escrevendo linha no summary.csv
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class Produto {
    String nome;
    double valor;
    int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + "," + valor * quantidade;
    }

}
