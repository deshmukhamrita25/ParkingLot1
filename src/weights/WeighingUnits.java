package weights;

/**
 * Created by HP2 on 12/01/2015.
 */
public enum WeighingUnits {
    KILOGRAM,
    GRAM;

    public static final int CONVERSION_FACTOR = 1000;

    public static int convertToKG(Weights weights) {
        if(weights.weighingUnits == GRAM)
            return weights.weight / CONVERSION_FACTOR;
        return weights.weight;
    }

    /*public static int convertToGRAM(int weight, WeighingUnits weighingUnits) {
        if(weighingUnits == KILOGRAM)
            weight = weight * CONVERSION_FACTOR;
        return weight;
    }*/
}
