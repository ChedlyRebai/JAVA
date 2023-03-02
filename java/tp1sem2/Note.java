package tp1sem2;
import java.util.ArrayList;


public class Note {
    private String cours;
    private float note;
   
    Note(String newCour,Float newNote){
        this.cours=newCour;
        this.note=newNote;
    }

    void affiche(){
        System.out.println("cour:"+this.cours);
        System.out.println("note:"+this.note);
    }

    float getNote(){
        return this.note;
    }



}
