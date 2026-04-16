import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) throws Exception{
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Employee objetoFun = new Employee();
    double porcentagem;

    System.out.println("Digite o nome, salario bruto e imposto");
    objetoFun.name = sc.next();
    objetoFun.grossSalary = sc.nextDouble();
    objetoFun.Tax = sc.nextDouble();
    System.out.println(objetoFun.name); 
    System.out.println(objetoFun.netSalary()); 
    System.out.println("Qual a porcentagem que voce deseja aumentar o salario bruto?");
    porcentagem = sc.nextDouble();
    objetoFun.increaseSalary(porcentagem);
    System.out.println("Updade Data:" + objetoFun.name + ", $" + objetoFun.netSalary());
    sc.close();
    }
}

class Employee {
    String name;
    double grossSalary, Tax;

    double netSalary(){
        return grossSalary - Tax;
    }

    void increaseSalary(double percentage){
       grossSalary += (grossSalary * (percentage/100));
    }
}