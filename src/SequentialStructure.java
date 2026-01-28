import java.util.Scanner;

public class SequentialStructure {

    public void SistemaDeValorMetragem() {
        float largura, profundidade,area,valor_metro,valor_total;
        Scanner sc = new Scanner(System.in);

        System.out.println("---PROGRAMA DE VALOR DE M²---");
        System.out.println("Largura do Terreno:");
        largura = sc.nextFloat();

        System.out.println("Profundidade do Terreno:");
        profundidade = sc.nextFloat();

        System.out.println("Valor do M²:");
        valor_metro = sc.nextFloat();

        area = largura * profundidade;
        valor_total = area * valor_metro;

        System.out.println("---RESULTADOS---");
        System.out.println("Área do Terreno:" + area +" M²");
        System.out.println("Valor sugerido do Terreno: R$" + valor_total);

    }
}

