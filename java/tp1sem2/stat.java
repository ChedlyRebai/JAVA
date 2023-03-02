package tp1sem2;

public class stat {


    public static void main(String[] args) {
        Etudiant etud1=new Etudiant("chedly rebai", 100),
                 etud2=new Etudiant("raoua ragmoun", 150),
                 etud3=new Etudiant("karim aljeni",200);
        
        GroupeEtudiant listeDesEtudiants=new GroupeEtudiant<>();

        
        etud1.addNote(new Note("allemand", (float) 4));
        etud1.addNote(new Note("poo", (float) 10));
        etud1.addNote(new Note("ux/ui dasign", (float) 1));

        etud2.addNote(new Note("allemand", (float) 3));
        etud2.addNote(new Note("poo", (float) 12));
        etud2.addNote(new Note("ux/ui dasign", (float) 19));

        etud3.addNote(new Note("allemand", (float) 11));
        etud3.addNote(new Note("poo", (float) 17));
        etud3.addNote(new Note("ux/ui dasign", (float) 20));

        System.out.println(" le meilleur note pour "+etud1.getNom() +":"+etud1.meilleureNote());
        System.out.println("le mauvaise note pour "+etud1.getNom() +":"+etud1.mauvaiseNote());
        System.out.println("le moyenne de "+etud1.getNom() +":"+etud1.getValue());
        etud1.affiche();

        System.out.println("le meilleur note pour "+etud2.getNom() +":"+etud2.meilleureNote());
        System.out.println("le mauvaise note pour "+etud2.getNom() +":"+etud2.mauvaiseNote());
        System.out.println("le moyenne de "+etud2.getNom() +":"+etud2.getValue());
        etud1.affiche();

        System.out.println("le meilleur note pour "+etud2.getNom() +":"+etud2.meilleureNote());
        System.out.println("le mauvaise note pour "+etud2.getNom() +":"+etud2.mauvaiseNote());
        System.out.println("le moyenne de "+etud2.getNom() +":"+etud2.getValue());
        etud1.affiche();

        listeDesEtudiants.addEtudiant(etud1);
        listeDesEtudiants.addEtudiant(etud2);
        listeDesEtudiants.addEtudiant(etud3);

        System.out.println("moyenne du groupe: "+ listeDesEtudiants.getValue());

        
    }    
}
