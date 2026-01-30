import javax.print.DocFlavor;
import java.util.Scanner;

public class SequentialStructure {

    public void SistemaDeCalculoDeMetragem() {
        double largura, profundidade,area,valorMetro,valorTotal,perimetro,diagonal;
        Scanner sc = new Scanner(System.in);

        System.out.println("---PROGRAMA DE CÁLCULO DE M²---");
        System.out.println("Largura do Terreno:");
        largura = sc.nextFloat();

        System.out.println("Profundidade do Terreno:");
        profundidade = sc.nextFloat();

        System.out.println("Valor do M²:");
        valorMetro = sc.nextFloat();

        area = largura * profundidade;
        valorTotal = area * valorMetro;

        perimetro = (largura + profundidade) * 2;
        diagonal = Math.sqrt(Math.pow(largura,2) + Math.pow(profundidade,2));

        System.out.println("---RESULTADOS---");
        System.out.println("Área do Terreno:" + area +" M²");
        System.out.println("Valor sugerido do Terreno: R$" + valorTotal);
        System.out.printf("Diagonal do Terreno:  %.4f%n", diagonal);
        System.out.printf("Perímetro do Terreno: %.4f%n", perimetro);
    }

    public void SistemaCalculoMediaIdade(){

        String nome1,nome2,x;
        int idade1,idade2;
        float mediaIdade;

        Scanner sc = new Scanner(System.in);

        System.out.println("---PROGRAMA DE CÁLCULO DE MÉDIA DE IDADE ---");

        System.out.println("Nome da Primeira Pessoa: ");
        nome1 = sc.nextLine();

        System.out.println("Idade da Primeira Pessoa: ");
        idade1 = sc.nextInt();

        x = sc.nextLine();

        System.out.println("Nome da Segunda Pessoa: ");
        nome2 = sc.nextLine();

        System.out.println("Idade da Segunda Pessoa: ");
        idade2 = sc.nextInt();

        mediaIdade = (float)(idade1 + idade2) /2;

        System.out.println("---RESULTADOS---");

        System.out.println("Pessoa 1: "+ nome1 + "," + idade1 + " anos.");
        System.out.println("Pessoa 2: "+ nome2 + "," + idade2 + " anos.");
        System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " + mediaIdade + " anos.");

        x = sc.nextLine();
    }

    public void SistemaCalculoMediaNota(){

        float nota1,nota2,media;
        Scanner sc = new Scanner(System.in);

        System.out.println("---PROGRAMA DE CÁLCULO DE MÉDIA DE NOTAS ---");

        System.out.println("Digite a Primeira Nota: ");
        nota1 = sc.nextFloat();

        System.out.println("Digite a Segunda Nota: ");
        nota2 = sc.nextFloat();

        media = (nota1+nota2)/2;

        if(media<6 && media>=0){

            System.out.println("Média Final: " + media);
            System.out.println("Status: REPROVADO");

        } else if (media>6) {

            System.out.println("Média Final: " + media);
            System.out.println("Status: APROVADO");

        }else {

            System.out.println("WTF?");

        }


    }

    public void SistemaDeIdentificacaoDeMenorNumero(){

        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("---PROGRAMA DE INDENTIFICAÇÃO DE MENOR NÚMERO ---");

        System.out.println("Digite o Primeiro Número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o Segundo Número: ");
        num2 = sc.nextInt();

        System.out.println("Digite o Segundo Número: ");
        num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3){

            System.out.println("O Menor Número é: " + num1);

        } else if (num2 <num1 && num2 < num3) {

            System.out.println("O Menor Número é: " + num2);

        }else{

            System.out.println("O Menor Número é: " + num3);

        }

    }

}

