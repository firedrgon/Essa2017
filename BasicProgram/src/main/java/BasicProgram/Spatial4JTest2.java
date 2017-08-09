package BasicProgram;

import ch.hsr.geohash.GeoHash;
import org.apache.commons.collections.map.HashedMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Yuanping on 2017/7/26.
 */
public class Spatial4JTest2 {
    public static void main(String[] args) {
        Map<Double, Double> map = new HashedMap();
        map.put(113.384727, 23.132667);
        map.put(113.385118, 23.132315);
        map.put(113.38369, 23.132307);
        map.put(113.385172, 23.133121);
        map.put(113.384615, 23.131659);
        map.put(113.385037, 23.142642);

        List<String> geohashs = new ArrayList<>();
        Set<Double> sets = map.keySet();
        for (Double set : sets) {
            Double value = map.get(set);
            GeoHash geoHash = GeoHash.withCharacterPrecision(value, set, 12);
            geohashs.add(geoHash.toBase32());
        }

        System.out.println(geohashs.toString());

        //113.383779,23.131559
        GeoHash geoHash5 = GeoHash.withCharacterPrecision(23.131559, 113.383779, 5);
        GeoHash geoHash4 = GeoHash.withCharacterPrecision(23.131559, 113.383779, 4);
        GeoHash geoHash3 = GeoHash.withCharacterPrecision(23.131559, 113.383779, 3);
        GeoHash geoHash6 = GeoHash.withCharacterPrecision(23.131559, 113.383779, 6);
        System.out.println(geoHash5.toBase32());
        System.out.println(geoHash4.toBase32());
        System.out.println(geoHash3.toBase32());
        System.out.println(geoHash6.toBase32());
    }
}

























