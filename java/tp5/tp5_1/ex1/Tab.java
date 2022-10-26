package tp5.tp5_1.ex1;

import java.util.Scanner;

public class Tab {
    public final static int nmax = 40;
    
    public static void remplir(float t[]){
           Scanner in=new Scanner(System.in);
           for (int i = 0; i < t.length; i++) {
            t[i]=in.nextFloat();
           }
           in.close();
    }

    public static float somme_element(float t[]){
        float somme =0;
        for (int i = 0; i < t.length; i++) {
            somme += t[i];
        }   
        return somme;
    }
    
        public static float[] additionner(float t1[],float t2[]){
            
            float[] resulta; 
            resulta=new float[t2.length];
               for (int i = 0; i < t2.length; i++) {
                    resulta[i]=t1[i]+t2[i];
               }
            return resulta;
        }
    
        public static float[] multiple(float t1[],float t2[]){
            
            float[] resulta; 
            resulta=new float[t2.length];
               for (int i = 0; i < t2.length; i++) {
                    resulta[i]=t1[i]*t2[i];
               }
            return resulta;
        }

        public static void lister(float t[]){        
               for (int i = 0; i < t.length; i++) {
                    System.out.println(t[i]);        
               }   
        }

        public static float[] additionner2(float x,float k[]){
            float[] t=new float[k.length];
            for (int i = 0; i < k.length; i++) {
                t[i]=k[i]+x;
            }
            return t;
        }

        
        
}
