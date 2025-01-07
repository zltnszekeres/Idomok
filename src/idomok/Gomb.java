
package idomok;

import java.util.HashSet;
public class Gomb extends Idom {

    double sugar;
    private static HashSet<Double> kulonbozoSugar = new HashSet<>();

    public Gomb(double sugar) {
        this.sugar = sugar;
        kulonbozoSugar.add(sugar);
    }

    public double getSugar() {
        return sugar;
    }

    public static int getKulonbozoSugaruDb() {
        return kulonbozoSugar.size();

    }

    @Override
    public double terfogat() {
        return (4.0 / 3.0) * Math.PI * Math.pow(sugar, 3);
    }

    @Override
    public String toString() {
        // return "Gömb{"+ " fajsuly=" +getFajsuly()+ " terfogat"+terfogat()+" súly="+suly()+" sugár="+sugar+"}";
        return "Gömb {" + super.toString() + " sugár=" + sugar + "}";
    }
    
}
