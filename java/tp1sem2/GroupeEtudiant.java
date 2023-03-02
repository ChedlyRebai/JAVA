package tp1sem2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
    * GroupeEtudiant
*/
public class GroupeEtudiant<T> implements Statiscable {

    ArrayList<Etudiant> listeDesEtudiant;
    GroupeEtudiant(){
        this.listeDesEtudiant=new ArrayList<>();
    }

    public void addEtudiant(Etudiant newEtudiant){
        this.listeDesEtudiant.add(newEtudiant);
    } 

    public void affiche(){
         for (int index = 0; index < this.listeDesEtudiant.size(); index++) {
            this.listeDesEtudiant.get(index).affiche();
        }
    
    }

    @Override
    public float getValue() {
        float moyenneClasse=0;
        
        for (int index = 0; index < this.listeDesEtudiant.size(); index++) {
            moyenneClasse += this.listeDesEtudiant.get(index).getValue();
        }

        return moyenneClasse/this.listeDesEtudiant.size();
    }


    public Etudiant meilleurEtudiant() {
        Etudiant lemeilleurEtudiant=this.listeDesEtudiant.get(0);
        
        for (int index = 0; index < this.listeDesEtudiant.size(); index++) {
            
            if(this.listeDesEtudiant.get(index).getValue() >lemeilleurEtudiant.getValue()){
                lemeilleurEtudiant=this.listeDesEtudiant.get(index);
            }
        }

        return lemeilleurEtudiant;
    }


    public Etudiant moinsBonEtudiant() {
        Etudiant lemoinsBonEtudiant=this.listeDesEtudiant.get(0);
        
        for (int index = 0; index < this.listeDesEtudiant.size(); index++) {
            if(this.listeDesEtudiant.get(index).getValue()<lemoinsBonEtudiant.getValue()){
                lemoinsBonEtudiant=this.listeDesEtudiant.get(index);
            }
        }

        return lemoinsBonEtudiant;
    }

    



}