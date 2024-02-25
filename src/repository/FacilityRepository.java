
package repository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import model.Facility;

public class FacilityRepository {
    private LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();

    public FacilityRepository() {
    }

    public LinkedHashMap<Facility, Integer> getFacilityMap() {
        return facilityMap;
    }

    public void setFacilityMap(LinkedHashMap<Facility, Integer> facilityMap) {
        this.facilityMap = facilityMap;
    }

    public void addDataFromList(List<Facility> facilityList) {
        for (Facility facility : facilityList) {
            facilityMap.put(facility, 0);
        }
    };

    public void printFacilityMap() {
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            Facility key = entry.getKey();
            int val = entry.getValue();
            System.out.println("Ten dich vu " + key.getName() + " So lan dung: " + val);
        }
    }
}
