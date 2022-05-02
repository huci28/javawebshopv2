
package manager;

import java.util.ArrayList;
import java.util.List;


public class termekservice {
    private final List<termek> termekek = new ArrayList<>();

    public termekservice() {
        termekek.add(new termek(1,"Fehérje 4kg", 18000));
        termekek.add(new termek(2,"Tömegnövelő 5kg", 20000));
        termekek.add(new termek(3,"Zsírégető 200 kapszula", 7800));
        termekek.add(new termek(4,"Multivitamin 30 napos kiszerelés", 5000));
        termekek.add(new termek(5,"Izületvédő 30 napos kiszerelés", 4500));
        termekek.add(new termek(6,"Edzés előtti formula 1kg", 5000));
    }

    public List<termek> getTermekek() {
        return termekek;
    }
    
    public termek findTermek(Integer TID){
        return termekek.stream().filter(t->t.getTID().equals(TID)).findFirst().get();
    }
    
    
}
