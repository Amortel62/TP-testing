
package entites;
import java.util.Date;

public class Facture {
    
    private Long      numFact;
    private Date      dateFact;   
    private Float     montantFact;
    private Boolean   reglee;
    
    private Client    leClient;
     
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS">
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GETTERS & SETTERS">
    
    public Long getNumFact() {
        return numFact;
    }
    
    public void setNumFact(Long numFact) {
        this.numFact = numFact;
    }
    
    public Float getMontantFact() {
        return montantFact;
    }
    
    public void setMontantFact(Float montantFact) {
        this.montantFact = montantFact;
    }
    
    
   public Date getDateFact() {
        return dateFact;
    }

    public void setDateFact(Date dateFact) {
        this.dateFact = dateFact;
    }

    public Boolean getReglee() {
        return reglee;
    }

    public void setReglee(Boolean reglee) {
        this.reglee = reglee;
    }

    public Client getLeClient() {
        return leClient;
    }

    public void setLeClient(Client leClient) {
        this.leClient = leClient;
    }
   
    
    //</editor-fold>
}
