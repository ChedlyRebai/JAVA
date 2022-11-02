package tp6;

public class Magasin extends Livre {
    protected int moisp;
    
    Magasin(String titre, int identifiants, String domaine, int nbpages ,int moisp) {
        super(titre, identifiants, domaine, nbpages);
        this.moisp=moisp;
    }

    @Override
    public String toString(){
        return super.toString()+"\nmois de parution:"+this.moisp;
    }

    
    public double calculprix(int bonus){
        return (0.35 * this.nbpages)*(1+TVA)+bonus;
    }

}
