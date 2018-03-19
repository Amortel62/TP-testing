
package essaidao;

import data.Dao;
import entites.Region;

public class ListeDesRegions {

    static Dao dao=new Dao();
    
    public static void main(String[] args) {
        
        System.out.println();
        
        for (Region r : dao.getToutesLesRegions()){
        
             System.out.printf("%-6s  %-30s",r.getCodeRegion(),r.getNomRegion());  
             int nbClients=r.getLesClients().size();
             if(nbClients>0) System.out.printf("%3d client%s\n",nbClients,nbClients>1?"s":""); else  System.out.printf("  Pas de client\n");  
        }
                
        System.out.println();
    }
}
