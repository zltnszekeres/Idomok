
package idomok;


abstract class Idom {
    
    private static double fajsuly = 0.8;

    abstract double terfogat();

    double suly() {
        return fajsuly * terfogat();
    }

    @Override
    public String toString() {
        return "fajsuly= " + fajsuly + " terfogat= " + terfogat() + " súly= " + suly() + "}";
    }
    
}
