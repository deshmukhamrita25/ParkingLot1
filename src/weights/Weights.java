package weights;

/**
 * Created by HP2 on 12/01/2015.
 */
public class Weights {
    int weight;
    WeighingUnits weighingUnits;

    public Weights(int weight, WeighingUnits weighingUnits) {
        this.weighingUnits = weighingUnits;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weights)) return false;

        Weights weights = (Weights) o;

        return WeighingUnits.convertToKG(this) ==
                        WeighingUnits.convertToKG(weights);

    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + (weighingUnits != null ? weighingUnits.hashCode() : 0);
        return result;
    }
}
