package data;
import entites.Client;
import entites.Facture;
import entites.Region;
import java.util.List;

public class Dao {
    
    public Region           getRegionDeCode(String pCodeReg)  {
    
        Region reg=null;
        
        for (Region r : DonneesMem.getToutesLesRegions()){
        
            if (r.getCodeRegion().equals(pCodeReg)){reg=r;break;}
            
        }
        
        return reg;
    
    
    }
    public List<Region>     getToutesLesRegions()             {
        return DonneesMem.getToutesLesRegions();
    }
        
    public   Client          getClientDeNumero(Long pNumCli )  {
         
        Client  cli=null;
     
        for(Client  c: DonneesMem.getTousLesClients()){
         
         if( c.getNumCli().equals(pNumCli) ){ cli=c;break;}
        }
        return cli;
    }
    public  List<Client>     getTousLesClients()               {
         
        
        return DonneesMem.getTousLesClients();
    
    }
   
    public  Facture          getFactureDeNumero(Long pNumFact) {
    
        Facture fact=null;
        
        
        for (Facture f : DonneesMem.getToutesLesFactures()){
        
           if(f.getNumFact().equals(pNumFact)){fact=f;break;} 
        }
        
        return fact;

    }
    public List<Facture>    getToutesLesFactures()            { 
        
        return DonneesMem.getToutesLesFactures(); }   
}
