package Aro;

import java.text.DecimalFormat;

/**
 * Pruebas de refactorización en NetBeans con la clase Aro
 * @author Álex Pereira
 */
public class Main {
    public static void main(String[] args) {
        Aro Aro = new Aro(37,43,2.5);
        String saida =
                "A coordenada X é "+Aro.getCoordenadaX()+
                "\nA coordenada Y é "+Aro.getCoordenadaY()+
                "\nO radio é "+Aro.getRadio();
        Aro.setCoordenadaX(35);
        Aro.setCoordenadaY(20);
        Aro.establecerRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(Aro.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(Aro.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(Aro.obterSuperfice());
        System.out.println(saida);
        
        System.out.println(saida);
        System.exit(0);
    }

}