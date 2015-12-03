package weights;

/**
 * Created by HP2 on 12/01/2015.
 */
public class Quantity {

    double magnitude;
    Units units;

    public Quantity(double magnitude, Units units) {
        this.magnitude = magnitude;
        this.units = units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quantity)) return false;

        Quantity quantity = (Quantity) o;
        if(!this.units.equals(quantity.units)){
            double thisQua = this.units.convertToBase(this.magnitude, this.units);
            double thatQua = quantity.units.convertToBase(quantity.magnitude, quantity.units);
            return thisQua == thatQua;
        }else{
            return this.units.convertToBase(magnitude, units) == quantity.units.convertToBase(quantity.magnitude, quantity.units);
        }
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(magnitude);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (units != null ? units.hashCode() : 0);
        result = 31 * result + (this != null ? this.hashCode() : 0);
        return result;
    }


}
