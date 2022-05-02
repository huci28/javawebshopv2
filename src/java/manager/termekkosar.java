
package manager;


public class termekkosar extends termek{
    private Integer mennyiseg;

    public termekkosar(Integer TID, String nev, Integer ar, Integer mennyiseg) {
        super(TID, nev, ar);
        if (mennyiseg < 1) {
            throw new IllegalArgumentException("Hibás paraméter, a mennyiség nem lehet kisebb mint 1 ");
        }
        this.mennyiseg=mennyiseg;
    }
    
    public int osszesen(){
           return mennyiseg * getAr();
            }

    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public Integer getMennyiseg() {
        return mennyiseg;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + mennyiseg;
    }
    
    
    
}
