
import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle objetoret = new Rectangle();

        System.out.println("digite a altura do retangulo");
        objetoret.height = sc.nextDouble();
        System.out.println("digite a largura do retangulo");
        objetoret.width = sc.nextDouble();
        

        System.out.println("Area:" + objetoret.area());
        System.out.println("Perimetro:" + objetoret.perimeter());    
        System.out.println("Diagonal:" + objetoret.diagonal());    
        

        sc.close();
    }
}

class Rectangle {
    double width, height;

    double area(){
        return width * height;
    }
    double perimeter(){
        return (2*width) + (2*height);
    }
    double diagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }
}

