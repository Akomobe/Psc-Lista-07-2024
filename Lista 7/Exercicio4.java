

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.print("Digite as vendas brutas do vendedor (ou -1 para parar): ");
        double vendas = scanner.nextDouble();
        
        if (vendas == -1) {
            break;
        }

        lista.add((int) vendas);
    }

    int[] intervalos = new int[9];

    for (double vendas : lista) {
        double salario = 200 + (0.09 * vendas);
        if (salario >= 200 && salario <= 299) {
            intervalos[0]++;
        } else if (salario >= 300 && salario <= 399) {
            intervalos[1]++;
        } else if (salario >= 400 && salario <= 499) {
            intervalos[2]++;
        } else if (salario >= 500 && salario <= 599) {
            intervalos[3]++;
        } else if (salario >= 600 && salario <= 699) {
            intervalos[4]++;
        } else if (salario >= 700 && salario <= 799) {
            intervalos[5]++;
        } else if (salario >= 800 && salario <= 899) {
            intervalos[6]++;
        } else if (salario >= 900 && salario <= 999) {
            intervalos[7]++;
        } else {
            intervalos[8]++;
        }
    }

    int inicioIntervalo = 200;
    for (int i = 0; i < intervalos.length; i++) {
        int fimIntervalo = inicioIntervalo + 99;
        if (i == intervalos.length - 1) {
            fimIntervalo = 1000;
        }
        System.out.printf("$%d - $%d: %d%n", inicioIntervalo, fimIntervalo, intervalos[i]);
        inicioIntervalo += 100;
    }

    scanner.close();
    }
}