
package essaidao;

import data.Dao;
import entites.Facture;
import utilitaires.UtilDate;

public class ListeDesFactures {

    static Dao dao=new Dao();
  
    public static void main(String[] args) {
      
        
        System.out.println();
        
        int moisEnCours=0;boolean debut=true;
        
        for (Facture f :  dao.getToutesLesFactures()){
        
              if(UtilDate.mois(f.getDateFact())!= moisEnCours) {
                  if(!debut)System.out.printf("\n");else debut=false;
                  moisEnCours=UtilDate.mois(f.getDateFact());
                  System.out.println(UtilDate.nomMois(moisEnCours)+ " "+UtilDate.annee(f.getDateFact())+"\n");
              }
            
              System.out.printf( "%5d %-10s %-15s  %-20s %10.2f € %-10s\n",
                               f.getNumFact(),
                               UtilDate.dateVersChaine(f.getDateFact()),
                               f.getLeClient().getNomCli(),
                                f.getLeClient().getAdrCli(),
                               f.getMontantFact(),
                               f.getReglee()?"Réglée":"Non réglée"
                             );
              
              
        }
        
        System.out.println();
        
    }
}
