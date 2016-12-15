package ufm;

/**
 * Created by deepak on 15/12/2016.
 */
public class ArrayLocation {
    double[] coordarr;

    public ArrayLocation(double[] cords){
        this.coordarr = cords;
    }

    public static void main(String[] args){
        double[] coords = {5.0,7.0};
        ArrayLocation accra = new ArrayLocation(coords);
        System.out.println(accra.coordarr[0]);
        coords[0] = 32.0;
        System.out.println(accra.coordarr[0]);
    }
}
