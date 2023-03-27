package Project;

public class Pojisteny {
    protected String jmeno;
    protected String prijmeni;
    protected int vek;
    protected int telefonniCislo;


    //gettery a settery
    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    @Override
    public String toString() {
        return jmeno + "\t\t" + prijmeni + "\t\t" + vek + "\t\t" + telefonniCislo;
    }
}
