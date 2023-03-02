package tp1sem2;

import java.util.Comparator;

public class CompareNom implements Comparator {

    @Override
    public int compare(Object arg0, Object arg1) {
        Etudiant etudiant1=(Etudiant) arg0;
        Etudiant etudiant2=(Etudiant) arg1;
        String nom1 = etudiant1.getNom();
        String nom2 = etudiant2.getNom();
        return nom1.compareTo(nom2);
    }    
}
