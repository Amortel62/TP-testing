
package tests;

import data.Dao;
import entites.Client;
import entites.Region;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;

public class TesterGC {
      
    Dao dao;
    
    @Before
    public  void initialisationDAO() {
    
        dao=new Dao();
    }
    
        @Test
        public void testerCaclientParAnnee() {

             Client c=dao.getClientDeNumero(101L);

             assertEquals("Erreur Calcul CA",575.5, c.caClient(2018),0.001);
        }
    
        @Test
        public void testerCaregionParAnnee() {

             Region r = dao.getRegionDeCode("HDF");
             assertEquals("Erreur Calcul CA",1510.64, r.caRegion(2018),0.001);
        }

        @Test
        public void testerCaclientParAnneeEtMois() {
    
             Client c=dao.getClientDeNumero(101L);
    
             assertEquals("Erreur Calcul CA",1131.28, c.caClient(2017,12),0.001);
        }
        
         @Test
        public void testerCaregionParAnneeEtMois() {
    
             Region r =dao.getRegionDeCode("HDF");
    
             assertEquals("Erreur Calcul CA",1952.73, r.caRegion(2017,12),0.001);
        }
        

}