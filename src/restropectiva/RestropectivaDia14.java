package restropectiva;

import javax.swing.event.ListDataEvent;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class RestropectivaDia14 {
    public static void main(String[] args) {
        List<String> listaFuncionario = new ArrayList<>();
        listaFuncionario.add("José");
        listaFuncionario.add("Josefá");
        listaFuncionario.add("Jefferson");
        listaFuncionario.add("jroger");
        System.out.println(listaFuncionario);

        int contador = 0;
        for (String lista : listaFuncionario){
            contador++;
            System.out.println(contador +"-" + lista);
        }

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o funcionario a ser excluido: ");
        String excluido = ler.nextLine();
        listaFuncionario.remove(excluido);

       // System.out.println(listaFuncionario);

        int contador2 = 0;
        for (String nlista :listaFuncionario){
            contador2++;
            System.out.println(contador2 + "-" + nlista);
        }




    }
}
