package Ds_2017;

public class Joueur extends Acteur {
    private String club;

    public Joueur(String nom, String prenom, int age, double montant, String club) {
        super(nom, prenom, age, montant);
        this.club = club;
    }

    public Joueur(String nom,String prenom ,int age , double montant){
        super(nom, prenom, age, montant);
        this.club="club africain";
    }
    
    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

     public double getSalire(){
        if(this.age<=20){
            return (super.montant /100)*150;
        }
        if(this.age>20 && this.age<30){
            return super.montant;
        }
        if(this.age>30 && this.age<40){
            return (super.montant/100)*75;
        }

     }

     @Override

     public String toString(){
        return "\nnom: "+super.nom+" prenom: "+super.prenom+" age: "+super.age+" club: "+this.club +" salaire:"+this.getSalire();
     }
}
