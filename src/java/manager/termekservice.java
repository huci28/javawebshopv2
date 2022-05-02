
package manager;

import java.util.ArrayList;
import java.util.List;


public class termekservice {
    private final List<termek> termekek = new ArrayList<>();

    public termekservice() {
        termekek.add(new termek(1,"Hugo Boss", 20000));
        termekek.add(new termek(2,"Tommy Hilfiger", 30000));
        termekek.add(new termek(3,"Calvin Klein", 15000));
    }

    public List<termek> getTermekek() {
        return termekek;
    }
    
    public termek findTermek(Integer TID){
        return termekek.stream().filter(t->t.getTID().equals(TID)).findFirst().get();
    }
    
    
}
