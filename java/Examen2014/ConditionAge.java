package Examen2014;

public class ConditionAge implements ConditionAcces {

    private int agemin;

    public ConditionAge(int agemin) {
        this.agemin = agemin;
    }

    @Override
    public boolean accesPossible(Personne p) {
        if (this.agemin <= p.getAge()) {
            return true;
        }
        return false;
    }

}
