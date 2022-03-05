package aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Álex Pereira
 */
public class Aro {

    private static final double LIMITERADIO = 0.0;
    /**
     * Obter o valor da constente MINIMO co valor 0.0 = a constante LIMITERADIO
     */
    public static final double MINIMO = LIMITERADIO;
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio < MINIMO ? MINIMO : radio;
    }    
    
    
    /**
     * Constructor da clase Aro
     */
    public Aro() {
    }

    /**
     * Constructor
     * @param valorX  = a coordenada X
     * @param valorY  = a coordenada Y
     * @param valorRadio 
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        radio = valorRadio;
    }

    /**
     *
     * @return Diametro
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     *
     * @return Circunrerencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     *
     * @return Superficie
     */
    public double obterSuperfice() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     *
     * @return coordenadas.
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     *
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX = coordenadaX + trasladarX;
        coordenadaY = coordenadaY + trasladarY;
    }
}