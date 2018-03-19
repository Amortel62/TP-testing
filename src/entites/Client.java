package entites;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import static utilitaires.UtilDate.annee;
import static utilitaires.UtilDate.mois;

public class Client implements Serializable {
 
    private Long   numCli;
    private String nomCli;
    private String adrCli;
   
    private Region        laRegion;
    private List<Facture> lesFactures;
     
   
     public Float caClient(int pAnnee){
      
        Float ca=0f;
        
        for (Facture f : lesFactures){
       
          int anF=annee(f.getDateFact());
          
          if ( f.getReglee()  && anF==pAnnee){
            ca+=f.getMontantFact();
          }
        
        } 
        
        return ca;
    }
    
     
     public Float caClient(int pAnnee,int pMois){
      
        Float ca=0f;
        
        for (Facture f : lesFactures){
       
          int anF=annee(f.getDateFact());
          int moisF=mois(f.getDateFact());
          
          if ( f.getReglee()  && anF==pAnnee && moisF==pMois){
            ca+=f.getMontantFact();
          }
        
        } 
        
        return ca;
    } 
    
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS">
   
    public Client() {lesFactures=new LinkedList();}
     
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
   
    
    
     public Long getNumCli() {
        return numCli;
    }
    
   
    public String getNomCli() {
        return nomCli;
    }
    
    
    public String getAdrCli() {
        return adrCli;
    }
    
   
    
    public void setNumCli(Long numCli) {
        this.numCli = numCli;
    }
    
    
    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }
    
    
    public void setAdrCli(String adrCli) {
        this.adrCli = adrCli;
    }
    
    
     public Region getLaRegion() {
        return laRegion;
    }

    public void setLaRegion(Region laRegion) {
        this.laRegion = laRegion;
    }

    public List<Facture> getLesFactures() {
        return lesFactures;
    }

    public void setLesFactures(List<Facture> lesFactures) {
        this.lesFactures = lesFactures;
    }
    
    
    //</editor-fold>     
}
