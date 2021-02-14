package pluralsight.oop.airspace;

import pluralsight.oop.geography.Coordinate;
import pluralsight.oop.geography.Rectangle;

/*
En Route Sector
A polygon sector used for en route flights that happen
at cruise altitude

We are using square for simplicity
 */
public class EnRouteSector implements AirSector {
    private int lowerAltitudeFl;
    private int upperAltitudeFl;
    private Rectangle shape;

    protected EnRouteSector(Rectangle shape, int lowerAltitudeFl, int upperAltitudeFl) {
        this.shape = shape;
        this.lowerAltitudeFl = lowerAltitudeFl;
        this.upperAltitudeFl = upperAltitudeFl;
    }

    @Override
    public boolean isInSector(Coordinate x, int altitude) {
        if (altitude > this.upperAltitudeFl) {
            return false;
        }
        if(altitude < this.lowerAltitudeFl){
            return false;
        }
        return true;
    }
}
