
package idomok;


public class Hasab extends Idom {

    double a, b, m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    @Override
    public double terfogat() {
        return a * b * m;
    }

    double getAlapterulet() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Hasáb {" + super.toString() + " a=" + a + " b=" + b + " m=" + m + "}";
    }

}
