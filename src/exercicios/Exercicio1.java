package exercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        double[] notas = new double[4];

        notas[0] = 0.23;
        notas[1] = 3.45;
        notas[2] = 7.90;
        notas[3] = 5.90;

        double media = (notas[0] + notas[1] + notas[2] + notas[3])/4;

        System.out.println(media);

        if(media =<5){
            System.out.println("reprovado");
            System.out.println("Suas notas foram" + notas[0] + ";" + notas[1] + ";" + notas[2] + ";" + notas[3]);
        }
    }

}
