
package essaidao;

import data.Dao;
import entites.Client;

import java.util.List;



public class ListeDesClients {

    static Dao dao=new Dao();
    
    public static void main(String[] args) {
      

       List<Client> listeCli= dao.getTousLesClients();
       
       System.out.println();
        
       for (Client c : listeCli){
       
       
            System.out.printf("%4d %-15s %-20s %5s %-20s\n",c.getNumCli(),c.getNomCli(),c.getAdrCli()
                               ,c.getLaRegion().getCodeRegion()
                               , c.getLaRegion().getNomRegion());
       }
        System.out.println();
        
        
    }
}
