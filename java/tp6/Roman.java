package tp6;

public class Roman extends Livre{
    
    protected String auteur;
    protected String editeur;
    
    
    Roman(String titre, int identifiants, String domaine, int nbpages ,String auteur,
    String editeur) {
        super(titre, identifiants, domaine, nbpages);
        this.auteur=auteur;
        this.editeur=editeur;     
    }
    
    @Override
    public String toString(){
        return super.toString()+this.nbpages+"\nnom d'auteur: "
        +this.auteur+"\nnom d'éditeur:"+this.editeur; 
   }

   @Override
   public double calculprix(){
    return (0.05 * this.nbpages)*(1+super.TVA)/100;
}
}
