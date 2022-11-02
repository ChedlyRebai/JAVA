package tp6;

public class Librarie {

    Livre[] livrelist;
    int capacite=0;
    int nb=0;
    Librarie(int capacite){
           livrelist=new Livre[capacite];
           this.capacite=capacite;
    } 

    private int getn(){
        return this.nb;
    }

    private void inventaire(String categ){
          for (int i = 0; i < this.nb; i++) {
            if((livrelist[i].getClass().getSimpleName()).equals(categ)){
               System.out.println(livrelist[i].toString());
            }
          }
    }
    
    public void inventaire(){
        for (int i = 0; i < nb; i++) {
              System.out.print( livrelist[i].toString());
            System.out.println("\nprix:"+livrelist[i].calculprix());
        }
    }

    public void ajoutLiv(Livre liv){
        if(this.nb==this.capacite){
            System.out.println("le tableau est ");
        }else{
           livrelist[this.nb]=liv;          
            this.nb++; 
        }
    }


    public void suppLiv(int num){
         for (int i = 0; i < this.nb; i++) {
            if(livrelist[i].identifiants==num){
                nb--;
                for (int j = i; j < nb; j++) {
                    livrelist[j]=livrelist[j+1];
                }
            }
         }
    }
    public static void main(String[] args) {
        Librarie listv=new Librarie(4);
        Livre livre1=new Roman("titre1", 1, "domaine1", 3, "auteur 1", "editeur 1");
        Livre livre2=new Livre("titre2", 2, "domaine2", 4);
        Livre livre3=new Magasin("titre3", 3, "domaine3", 8, 5);
       // System.out.println(livre1.getClass().getSimpleName());
     
        
        listv.ajoutLiv(livre1);
        listv.ajoutLiv(livre2);
        listv.ajoutLiv(livre3);
        //listv.ajoutLiv(livre3);
        //listv.inventaire("Roman");
        listv.inventaire();
        listv.suppLiv(1);
        System.out.println("\n----------------------\n");
        listv.inventaire();
       
        
    }     
}
