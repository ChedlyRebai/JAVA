package tp1sem2;
import java.util.ArrayList;
import java.lang.Comparable;
/**
 * Etudiant
 */
public class Etudiant implements Statiscable,Comparable {
    private int matricule;
    private String nom;
    
    ArrayList<Note> listDesEtudiant;
    
    Etudiant(String nom,int mat){
        this.nom=nom;
        this.matricule=mat;
        this.listDesEtudiant=new ArrayList<>();
    }

    String getNom(){
        return this.nom;
    }

    int getMatricule(){
        return this.matricule;
    }

    void affiche(){
        System.out.println("nom:"+this.nom);
        System.out.println("matricule:"+this.matricule);
        for (int index = 0; index < this.listDesEtudiant.size(); index++) {
            this.listDesEtudiant.get(index).affiche();
        }
    }

    void addNote(Note newNote){
        this.listDesEtudiant.add(newNote);
    }
    
    @Override
    public float getValue(){
        float moyenne=0;
        for (int index = 0; index < this.listDesEtudiant.size(); index++) {
            moyenne+=this.listDesEtudiant.get(index).getNote();
        }

        return moyenne/this.listDesEtudiant.size();
    }


    public float meilleureNote(){
        float meilleurNote=this.listDesEtudiant.get(0).getNote();
        
        for (int index = 0; index < this.listDesEtudiant.size(); index++) {
            if(this.listDesEtudiant.get(index).getNote() > meilleurNote){
                meilleurNote=this.listDesEtudiant.get(index).getNote();
            }
        }

        return meilleurNote;
    }


    public float mauvaiseNote(){
        float mauvaiseNote=this.listDesEtudiant.get(0).getNote();
        
        for (int index = 0; index < this.listDesEtudiant.size(); index++) {
            if(this.listDesEtudiant.get(index).getNote() < mauvaiseNote){
                mauvaiseNote=this.listDesEtudiant.get(index).getNote();
            }
        }

        return mauvaiseNote;
    }

    @Override
    public int compareTo(Object arg0) {
        Etudiant Netud=(Etudiant) arg0;

        if(Netud.getMatricule() > this.matricule){
            return -1;
        }
        
        if(Netud.getMatricule()<this.matricule){
            return 1 ;
        }

        //if Netud.getMatricule() == this.matricule
        return 0;
        
    }

   
    
}