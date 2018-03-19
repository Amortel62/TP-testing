package entites;
import java.util.LinkedList;
import java.util.List;

public class Region{

    private String       codeReg;
    private String       nomReg;
 
    private List<Client> lesClients;
    
    
    public Float caRegion(int pAnnee){ 
    
        Float ca = 0F;
        
        for(Client c : lesClients ){
       
            ca = ca + c.caClient(pAnnee);
            
        }   
        
        return ca;
        
    
    }
    
     public Float caRegion(int pAnnee,int pMois){
         
         Float ca = 0F;
         
         for(Client c : lesClients){
         
            ca = ca + c.caClient(pAnnee, pMois);
         
         }
         
         return ca;     
     
     }
    
    
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS">
   
    public Region() {
    
        this.lesClients = new LinkedList();
    }
   
   
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS ET SETTERS">
    
    public String getCodeRegion() {
        return codeReg;
    }
    public void   setCodeRegion(String codeRegion) {
        this.codeReg = codeRegion;
    }
    public String getNomRegion() {
        return nomReg;
    }
    public void   setNomRegion(String nomRegion) {
        this.nomReg = nomRegion;
    }
    
  
    public List<Client> getLesClients() {
        return lesClients;
    }
    public void         setLesClients(List<Client> lesClients) {
        this.lesClients = lesClients;
    }
    //</editor-fold>
}
