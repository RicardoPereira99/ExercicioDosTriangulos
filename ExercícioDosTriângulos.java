import java.util.Scanner;

public class ExercícioDosTriângulos {

    public static void main(String[] args) {
        
        System.out.printf("O Ricardo é o maior");
        
        Scanner LeitorDeString = new Scanner(System.in);
        Scanner LeitorDeLados = new Scanner(System.in);
        Scanner LeitorDeAngulos = new Scanner(System.in);

        double Lado1, Lado2, Lado3;
        double AnguloGraus1, AnguloGraus2, AnguloGraus3;


        String TipoDeAnalise;
        String TipoDeAnalise2;

        double Expreção1 ;

        /*dividir isto em classes, "variaveis para analise" e "teste de condições".
         falta no, try catch, especificar o tipo do erro.
        método construtor para calculos. */

        System.out.println("***Programa de Avaliação de Triângulos***");
        System.out.println("Escreva <<Lado>> para analisar através dos lados e <<Ângulo>> para analisar em através dos ângulos");
        System.out.print(":");
        TipoDeAnalise = LeitorDeString.nextLine();


        if (TipoDeAnalise.equals("Lado")) {
            // teste para lados.
            System.out.println("Insira um valor para o primeiro lado:");
            Lado1 = LeitorDeLados.nextDouble();
            System.out.println("Insira um valor para o segundo lado:");
            Lado2 = LeitorDeLados.nextDouble();
            System.out.println("Insira um valor para o terceiro lado:");
            Lado3 = LeitorDeLados.nextDouble();

            if (Lado1 == Lado2 && Lado2 == Lado3) { // condição triângulo equilatro.
                System.out.println("O triangulo é equilatro");
            } else if (Lado1 == Lado2 && Lado1 != Lado3 || Lado2 == Lado3 && Lado2 != Lado1 || Lado1 == Lado3 && Lado2 != Lado3){
                System.out.println("O triangulo é isóceles");
            } else if (Lado1 != Lado2 && Lado1 != Lado3 && Lado2 != Lado3) {
                System.out.println("O triangulo é escleno");
            }
        } else if (TipoDeAnalise.equals("Ângulo")) {
            // teste para ângulo.

            System.out.println("Indique, por favor, que escala de medida pertende usar.");
            System.out.print("Visto que <<Graus>> é para usar a escala graus. ");
            System.out.println("Por exemplo: 180º");
            System.out.print("E <<Radianos>> para usar a escala radianos. ");
            System.out.println("Por exemplo: 1/2%pi");
            System.out.println("Nota: O número 3,1415..., conhecido como <<pi>> será representado como %pi");
            System.out.println(":");

            TipoDeAnalise2 = LeitorDeString.nextLine();
            if (TipoDeAnalise.equals("Graus")){
                System.out.println("Intruduza o primeiro ângulo");
                AnguloGraus1 = LeitorDeAngulos.nextDouble();
                AnguloGraus2 = LeitorDeAngulos.nextDouble();
                AnguloGraus3 = LeitorDeAngulos.nextDouble();

                Expreção1 = AnguloGraus1 + AnguloGraus2 + AnguloGraus3;

                if (Expreção1 <= 180 ){
                    if (AnguloGraus1 <= 90 && AnguloGraus2 <= 90 && AnguloGraus3 <= 90){
                        if (AnguloGraus1 == 60 && AnguloGraus2 == 60 || AnguloGraus1 == 60 && AnguloGraus3 == 60 ||
                                AnguloGraus2 == 60 && AnguloGraus3 ==60)
                            System.out.println("O triângulo é equilatro e actuângulo");
                    } else {
                        System.out.println("O triângulo é actuângulo");
                    } if (AnguloGraus1 == 90 || AnguloGraus2 == 90 || AnguloGraus3 == 90) {
                        if (AnguloGraus1 == AnguloGraus2 || AnguloGraus2 == AnguloGraus3 || AnguloGraus1 == AnguloGraus3) {
                            System.out.println("O triângulo é rectângulo e isócles");
                        } else {
                            System.out.println("tirangulo rectângulo");
                        } // falta o obtusangulo e o escaleno.
                    }
                } else {
                    System.out.println("Valores Inválidos"); // do while
                }

            } else if (TipoDeAnalise.equals("Radianos")){ // fazer o mesmo de cima.

            }
        }
    }
}
