package tp6;

public class Livre {
    protected String titre;
    protected int identifiants;
    protected String domaine;
    protected int nbpages;
    protected final double TVA=10;

    @Override
    public String toString(){
         return "\ntitre:"+this.titre  +"\nidentifiants:"+this.identifiants +
         "\ndomaine:"+this.domaine + "\nnombres de pages:"+this.nbpages; 
    }
      
    Livre(String titre,int identifiants,String domaine,int nbpages ){
         this.titre=titre;
         this.identifiants=identifiants;
         this.domaine=domaine;
         this.nbpages=nbpages;
    }

    public double calculprix(){
        return (0.075 * this.nbpages)*(1+this.TVA)/100;
    }
}
