package BasicProgram;

import ch.hsr.geohash.GeoHash;
import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.distance.DistanceUtils;
import com.spatial4j.core.shape.Rectangle;

/**
 * Created by Yuanping on 2017/7/26.
 */
public class Spatial4JTest {
    public static void main(String[] args) {
        // 移动设备经纬度
//        30.549608, 114.376971
        double lat = 23.134025,lon = 113.374745;
        // 千米
//        int radius = 1;

//        SpatialContext geo = SpatialContext.GEO;
//        Rectangle rectangle = geo.getDistCalc().calcBoxByDistFromPt(
//                geo.makePoint(lon, lat), radius * DistanceUtils.KM_TO_DEG, geo, null);
//        System.out.println(rectangle.getMinX() + "-" + rectangle.getMaxX());// 经度范围
//        System.out.println(rectangle.getMinY() + "-" + rectangle.getMaxY());// 纬度范围

        // 移动设备经纬度
//        double lon = 116.312528, lat = 39.983733;

        GeoHash geoHash = GeoHash.withCharacterPrecision(lat, lon, 8);
        // 当前
        System.out.println(geoHash.toBase32());
        // N, NE, E, SE, S, SW, W, NW
//        GeoHash[] adjacent = geoHash.getAdjacent();
//        for (GeoHash hash : adjacent) {
//            System.out.println(hash.toBase32());
//        }
    }
}

























