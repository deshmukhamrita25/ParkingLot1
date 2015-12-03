package weights;

/**
 * Created by HP2 on 12/01/2015.
 */
public enum Units {
    KG(1000.0, Groups.WEIGHT), GRAM(1.0, Groups.WEIGHT),
    YARD(36.0, Groups.LENGTH), FEET(12.0, Groups.LENGTH), INCH(1.0, Groups.LENGTH),
    CELCIOUS(1.0,Groups.TEMPRATURE),FARHENITE(33.8,Groups.TEMPRATURE),KELVIN(274.0,Groups.TEMPRATURE);


    private double magnitude;
    private Groups groups;

    Units(double magnitude, Groups groups) {
        this.magnitude = magnitude;
        this.groups = groups;
    }

    public enum Groups{
        WEIGHT, LENGTH, TEMPRATURE;
    }

    public double convertToBase(double measure, Units grps){
        return measure * grps.magnitude;
    }
}
