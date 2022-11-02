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
        }while(nb>Tab.nmax);
        
        noteCtrl = new float[nb];
        noteExam = new float[nb];

        System.out.println("remplir tableau des notes de controle: ");
        Tab.remplir(noteCtrl);
        System.out.println("affichage de tableau de note de controle: ");
        Tab.lister(noteCtrl);

        System.out.println("remplir tableau des notes d'examen: ");
        Tab.remplir(noteExam);
        System.out.println("affichage de tableau des notes de l'examen: ");
        Tab.lister(noteExam);

        float[] moy=new float[nb];
        for (int i = 0; i < nb; i++) {
            moy[i]=noteCtrl[i]+2*noteExam[i];
            System.out.println("moyenne de l'etudiant n°"+(i+1)+":"+moy[i]);
        }
    
        float moyclass=Tab.somme_element(moy)/nb;
        System.out.println("moyenne de la classe:"+moyclass);
  
        float x=(float) 1.5;  
        moy=Tab.additionner(x, moy);
        System.out.println("moyenne des etudiants apres lincrimentation :");
        Tab.lister(moy);
        in.close();
    }
}
