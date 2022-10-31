package DS.DS2020_1;

public class VetementEnfant extends Vetement {

    public VetementEnfant(String lib, Float d, String code, String c) {
        super(lib, d, code, c);
        // TODO Auto-generated constructor stub
    }

    private double age;

    public void setAge(Double age) {
        this.age = age;
    }

    @Override

    public String toString() {
        return super.toString() + " age:" + this.age;
    }

    public float prixTTC(int remise) {
        if (remise >= 50) {
            return 0;
        } else {
            return super.prixTTC(remise);
        }
    }

}
