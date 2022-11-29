package Test;

public class HR {
    private String nom;
    Employee[] emp;
    private final int nbemax = 30;
    private int nbe = 0;

    public HR(int taille, String nom) {
        if (taille > nbemax) {
            System.out.println("taille est plus grand");
        } else {
            emp = new Employee[taille];
            this.nom = nom;
        }
    }

    public void ajoutEmp(Employee E) {
        if (nbe == emp.length) {
            System.out.println("tableau complet");
        } else {
            emp[nbe] = E;
            nbe++;
        }
    }

    public void listemp() {
        for (int i = 0; i < this.nbe; i++) {

            System.out.println(emp[i]);
        }
    }

    public static void main(String[] args) {
        HR tab = new HR(5, "spacex");
        Cadre cadre1 = new Cadre("mohamed", "morad",
                25584987, "grade 1", 20);
        Cadre cadre2 = new Cadre("rebai ", "karim",
                25584987, "grade 2", 4);

        Ovrier ovrier1 = new Ovrier("ovrier1", "prenom ovrier 1", 18897456, 10, cadre1);
        Ovrier ovrier2 = new Ovrier("ovrier2", "prenom ovrier 2", 28897456, 1, cadre2);
        Ovrier ovrier3 = new Ovrier("ovrier3", "prenom ovrier 3", 38897474, 6, cadre1);

        tab.ajoutEmp(cadre1);
        tab.ajoutEmp(cadre2);

        tab.ajoutEmp(ovrier1);
        tab.ajoutEmp(ovrier2);
        tab.ajoutEmp(ovrier3);

        tab.listemp();

        float paye = tab.emp[0].CalculSalaire();
        String nomEM = "";
        int l = 0;
        for (int i = 0; i < tab.emp.length; i++) {
            if (tab.emp[i].CalculSalaire() > paye) {
                paye = tab.emp[i].CalculSalaire();
                nomEM = tab.emp[i].nom;
                l = i;
            }
        }
        System.out.println(" \n l employé le plus payé dans cette entreprise:" + tab.emp[l].getNom());

        int nbovrier = 0;
        for (int i = 0; i < tab.emp.length; i++) {
            if ((tab.emp[i].getClass().getSimpleName()).equals("Ovrier")) {
                nbovrier++;
            }
        }

        System.out.println("nombre ovrier:" + nbovrier);

        // Ovrier[] ovr = new Ovrier[tab.emp.length];
        // int k = 0;

        System.out.println("liste des ovriers a le meme cadre1");
        Ovrier h;
        for (int i = 0; i < tab.emp.length; i++) {
            if ((tab.emp[i].getClass().getSimpleName()).equals("Ovrier")) {
                {
                    h = (Ovrier) tab.emp[i];
                    if ((h.getManager()).equals(cadre1)) {
                        System.out.println("\n" + h.toString());
                    }
                }
            }
        }

    }
}
