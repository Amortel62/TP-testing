package entites;

import data.Dao;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import static utilitaires.UtilDate.annee;
import static utilitaires.UtilDate.mois;

public class Entreprise{
 
    private Long   numEnt;
    private String nomEnt;
    private String adrEnt;
   

     
     private static Dao dao = new Dao();
     
     public static Float caEntreprise(int pAnnee,int pMois){
      
        Float ca=0f;
        
        for (Facture f : dao.getToutesLesFactures()){
       
          int anF=annee(f.getDateFact());
          int moisF=mois(f.getDateFact());
          
          if ( f.getReglee()  && anF==pAnnee && moisF==pMois){
            ca+=f.getMontantFact();
          }
        
        } 
        
        return ca;
    } 

    public Long getNumEnt() {
        return numEnt;
    }

    public void setNumEnt(Long numEnt) {
        this.numEnt = numEnt;
    }

    public String getNomEnt() {
        return nomEnt;
    }

    public void setNomEnt(String nomEnt) {
        this.nomEnt = nomEnt;
    }

    public String getAdrEnt() {
        return adrEnt;
    }

    public void setAdrEnt(String adrEnt) {
        this.adrEnt = adrEnt;
    }

  

}
    
