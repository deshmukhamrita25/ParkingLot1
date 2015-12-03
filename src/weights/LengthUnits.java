package weights;

/**
 * Created by HP2 on 12/01/2015.
 */
public enum LengthUnits {
    YARD,//30feet
    FEET,//12inch
    INCH;

    public static final int FEET2YARD_CONSTANT = 36;
    public static final int INCH2FEET_CONSTANT = 12;

    public static int convertToYard(int length, LengthUnits lengthUnits){

        if(lengthUnits == YARD)
            return length;
        else if(lengthUnits == FEET)
            return length/ FEET2YARD_CONSTANT;


        return length/(INCH2FEET_CONSTANT * FEET2YARD_CONSTANT);
    }

    public static int convertToInch(int length, LengthUnits lengthUnits){

        if(lengthUnits == YARD)
            return length*FEET2YARD_CONSTANT*INCH2FEET_CONSTANT;
        else if(lengthUnits == FEET)
            return length* INCH2FEET_CONSTANT;


        return length;
    }





}
