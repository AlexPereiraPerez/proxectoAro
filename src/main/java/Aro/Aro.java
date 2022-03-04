package Aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Álex Pereira
 */
public class Aro {

    private static final double LIMITERADIO = 0.0;

    /**
     * Obter o valor da constente MINIMO
     */
    public static final double MINIMO = LIMITERADIO;
 
    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor da clase Aro
     */
    public Aro() {
    }

    /**
     * Constructor
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     *
     * @return Diametro
     */
    public double obterDiametro() {
        return getRadio() * 2;
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
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     *
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

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
}