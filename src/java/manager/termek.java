
package manager;

import java.util.Objects;


public class termek {
    private Integer TID;
    private String nev;
    private Integer ar;

    public termek(Integer TID, String nev, Integer ar) {
        this.TID = TID;
        this.nev = nev;
        this.ar = ar;
    }

    public Integer getTID() {
        return TID;
    }

    public String getNev() {
        return nev;
    }

    public Integer getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return  nev + ", " + ar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.TID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final termek other = (termek) obj;
        if (!Objects.equals(this.TID, other.TID)) {
            return false;
        }
        return true;
    }
    
}
