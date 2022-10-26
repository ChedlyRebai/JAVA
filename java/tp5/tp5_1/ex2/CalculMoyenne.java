package tp5.tp5_1.ex2;

import java.util.Scanner;

import tp5.tp5_1.ex1.Tab;

public class CalculMoyenne {
    public static void main(String[] args) {
        
        float[] noteCtrl,noteExam;
        Scanner in=new Scanner(System.in);
        int nb;
         do{
            System.out.println("donner nb;");
            nb=in.nextInt();
        }while(nb>40);
        noteCtrl = new float[nb];
        noteExam = new float[nb];
        for (int i = 0; i < nb; i++) {
            System.out.printf("note de controle n°"+(i+1)+"=");
            noteCtrl[i]=in.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("note d'examen n°"+(i+1)+"=");
            noteExam[i]=in.nextInt();
        }

        for (int i = 0; i < nb; i++) {
            System.out.printf("note de controle n°"+(i+1)+"="+noteCtrl[i]+"\n");
            
        }

        for (int i = 0; i < nb; i++) {
            System.out.printf("note d'examen n°"+(i+1)+"="+noteExam[i]+"\n");
            
        }
        
        float[] moy=new float[nb];
        for (int i = 0; i < nb; i++) {
            moy[i]=noteCtrl[i]+2*noteExam[i];
            System.out.println("moyenne de l'etudiant n°"+(i+1)+":"+moy[i]);
        }
        
        
        float moyclass=Tab.somme_element(moy)/nb;
        System.out.println("moyenne de la classe:"+moyclass);

        System.err.println("afficher de tableau notectrl avec la methode static lister");
        Tab.lister(noteCtrl);

        System.err.println("afficher de tableau examen avec la methode static lister");
        Tab.lister(noteExam);
        
        float x=(float) 1.5;
        
        moy=Tab.additionner2(x, moy);
        for (int i = 0; i < moy.length; i++) {
            System.out.println("moyenne de l'etudiant n°:"+(i+1)+" apres lincrimenattion :"+moy[i]);
        }
        in.close();
    }
}
