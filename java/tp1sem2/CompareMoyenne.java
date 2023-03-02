package tp1sem2;

import java.util.Comparator;

public class CompareMoyenne implements Comparator{
    @Override
    public int compare(Object arg0, Object arg1) {
        Etudiant etud1= (Etudiant) arg0;
        Etudiant etud2= (Etudiant) arg1;
        
        if(etud1.getValue()>etud2.getValue()){
            return 1;
        }

        if(etud1.getValue()<etud2.getValue()){
            return -1;
        }

        return 0;
    }
}
