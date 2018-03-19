package tests;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import utilitaires.UtilDate;

public class TesterCalculsDates {
    
    @Test
    public void testerMethodeAujourdhui(){
    
        String aujS="17/03/2018";
        assertEquals("Erreur  date",aujS,UtilDate.aujourdhuiChaine());
    }    
    
    @Test
    public void testerJour(){
        
       assertEquals(17,UtilDate.jourDuMois(new Date()));
    }
    
      
    @Test
    public void testerAnnee(){
        
       assertEquals(2018,UtilDate.anneeCourante());
    }      
}