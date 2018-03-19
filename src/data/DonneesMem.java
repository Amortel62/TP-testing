
package data;

import entites.Client;
import entites.Facture;
import entites.Region;
import java.util.LinkedList;
import java.util.List;
import static utilitaires.UtilDate.chaineVersDate;

public class DonneesMem {
     
    static   private  List<Region>    toutesLesRegions  = new LinkedList<Region>(); 
    static   private  List<Client>    tousLesClients    = new LinkedList<Client>();
    static   private  List<Facture>   toutesLesFactures = new LinkedList<Facture>();

    //<editor-fold defaultstate="collapsed" desc="CODE STATIQUE INITIALISANT LES DONNEES">
    
    static{
        
         
       ////////////////////////////////// REGIONS /////////////////////////////////////////////////////////
        
         ///////////////////////////////////////////////// 
        
        Region  r1=new Region();
        r1.setCodeRegion("HDF");
        r1.setNomRegion("Hauts de France");
        
        toutesLesRegions.add(r1);
        
        ///////////////////////////////////////////////// 
        
        Region  r2=new Region();
        r2.setCodeRegion("GE");
        r2.setNomRegion("Grand Est");
       
        toutesLesRegions.add(r2);
        
        /////////////////////////////////////////////////
        
        Region  r3=new Region();
        r3.setCodeRegion("IDF");
        r3.setNomRegion("Ile De France");
        toutesLesRegions.add(r3);
        
        
        /////////////////////////////////////////////////
        
        Region  r4=new Region();
        r4.setCodeRegion("OCC");
        r4.setNomRegion("Occitanie");
        
        toutesLesRegions.add(r4);
        
        
         /////////////////////////////////////////////////
        
        Region  r5=new Region();
        r5.setCodeRegion("NOR");
        r5.setNomRegion("Normandie");
        
        toutesLesRegions.add(r5);
        
        
        ///////////////////////////////////////   CLIENTS    //////////////////////////////////////////////
        
        ///////////////////////////////////////////////// 
        
        Client c1= new Client();
        c1.setNumCli(101L);
        c1.setNomCli("Dupont");
        c1.setAdrCli("Arras");
        
        c1.setLaRegion(r1);
        r1.getLesClients().add(c1);
        
        tousLesClients.add(c1);
        
        ///////////////////////////////////////////////// 
        
        Client c2= new Client();
        c2.setNumCli(102L);
        c2.setNomCli("Durant");
        c2.setAdrCli("Lille");
        
        c2.setLaRegion(r1);
        r1.getLesClients().add(c2);
        
        tousLesClients.add(c2);
        
        ///////////////////////////////////////////////// 
        
        Client c3= new Client();
        c3.setNumCli(103L);
        c3.setNomCli("Leroy");
        c3.setAdrCli("Hirson");
        
        
        c3.setLaRegion(r2);
        r2.getLesClients().add(c3);
        
        tousLesClients.add(c3);
        
  ////////////////////////////////////////////////////////////////  FACTURES //////////////////////////////////////////////////////////////////
        
        
        ///////////////////////////////////////////////// 
        
        Facture f11=new Facture();
        f11.setNumFact(911L);
        f11.setDateFact(chaineVersDate("11/12/2017"));
        f11.setMontantFact(567.5F);
        f11.setReglee(true);
        f11.setLeClient(c1);
        
        toutesLesFactures.add(f11);
        c1.getLesFactures().add(f11);
        
        
         ///////////////////////////////////////////////// 
        
        Facture f12=new Facture();
        f12.setNumFact(912L);
        f12.setDateFact(chaineVersDate("11/12/2017"));
        f12.setMontantFact(98F);
        f12.setReglee(true);
        f12.setLeClient(c2);
        
        toutesLesFactures.add(f12);
        c2.getLesFactures().add(f12);
        
        ///////////////////////////////////////////////// 
        
        Facture f13=new Facture();
        f13.setNumFact(913L);
        f13.setDateFact(chaineVersDate("14/12/2017"));
        f13.setMontantFact(723.45F);
        f13.setReglee(true);
        f13.setLeClient(c2);
        
        toutesLesFactures.add(f13);
        c2.getLesFactures().add(f13);
        
        /////////////////////////////////////////////////  
        
        Facture f14=new Facture();
        f14.setNumFact(914L);
        f14.setDateFact(chaineVersDate("20/12/2017"));
        f14.setMontantFact(1432.82F);
        f14.setReglee(true);
        f14.setLeClient(c3);
        
        toutesLesFactures.add(f14);
        c3.getLesFactures().add(f14);
         
        ///////////////////////////////////////////////// 
        
        Facture f15=new Facture();
        f15.setNumFact(915L);
        f15.setDateFact(chaineVersDate("22/12/2017"));
        f15.setMontantFact(563.78F);
        f15.setReglee(true);
        f15.setLeClient(c1);
        
        toutesLesFactures.add(f15);
        c1.getLesFactures().add(f15);
        
        
        ///////////////////////////////////////////////// 
        
        Facture f01=new Facture();
        
        f01.setNumFact(1001L);
        f01.setDateFact(chaineVersDate("02/01/2018"));
        f01.setMontantFact(235.5F);
        f01.setReglee(true);
        f01.setLeClient(c1);
        
        toutesLesFactures.add(f01);
        c1.getLesFactures().add(f01);
        
        /////////////////////////////////////////////////
        
        Facture f02=new Facture();
        f02.setNumFact(1002L);
        f02.setDateFact(chaineVersDate("02/01/2018"));
        f02.setMontantFact(340F);
        f02.setReglee(true);
        f02.setLeClient(c2);
        
        toutesLesFactures.add(f02);
        c2.getLesFactures().add(f02);
        
        /////////////////////////////////////////////////
        
        Facture f03=new Facture();
        f03.setNumFact(1003L);
        f03.setDateFact(chaineVersDate("03/01/2018"));
        f03.setMontantFact(340F);
        f03.setReglee(true);
        f03.setLeClient(c1);
        
        toutesLesFactures.add(f03);
        c1.getLesFactures().add(f03);
        
        /////////////////////////////////////////////////
        
        Facture f04=new Facture();
        f04.setNumFact(1004L);
        f04.setDateFact(chaineVersDate("03/01/2018"));
        f04.setMontantFact(216.8F);
        f04.setReglee(true);
        f04.setLeClient(c3);
        
        toutesLesFactures.add(f04);
        c3.getLesFactures().add(f04);
        
        /////////////////////////////////////////////////
        
        Facture f05=new Facture();
        f05.setNumFact(1005L);
        f05.setDateFact(chaineVersDate("04/01/2018"));
        f05.setMontantFact(216.8F);
        f05.setReglee(true);
        f05.setLeClient(c2);
        
        toutesLesFactures.add(f05);
        c2.getLesFactures().add(f05);
        
       /////////////////////////////////////////////////
        
        
        Facture f06=new Facture();
        f06.setNumFact(1006L);
        f06.setDateFact(chaineVersDate("05/01/2018"));
        f06.setMontantFact(654.2F);
        f06.setReglee(true);
        f06.setLeClient(c3);
        
        toutesLesFactures.add(f06);
        c3.getLesFactures().add(f06);
        
        /////////////////////////////////////////////////
        
        Facture f07=new Facture();
        f07.setNumFact(1007L);
        f07.setDateFact(chaineVersDate("06/01/2018"));
        f07.setMontantFact(372F);
        f07.setReglee(false);
        f07.setLeClient(c2);
        
        toutesLesFactures.add(f07);
        c2.getLesFactures().add(f07);
        
        
        ///////////////////////////////////////////////// 
        
        Facture f08=new Facture();
        f08.setNumFact(1008L);
        f08.setDateFact(chaineVersDate("08/01/2018"));
        f08.setMontantFact(1342.4F);
        f08.setReglee(false);
        f08.setLeClient(c1);
        
        toutesLesFactures.add(f08);
        c1.getLesFactures().add(f08);
        
        ///////////////////////////////////////////////// 
        
        Facture f09=new Facture();
        f09.setNumFact(1009L);
        f09.setDateFact(chaineVersDate("08/01/2018"));
        f09.setMontantFact(547.9F);
        f09.setReglee(false);
        f09.setLeClient(c3);
        
        toutesLesFactures.add(f09);
        c3.getLesFactures().add(f09);
        
        ///////////////////////////////////////////////// 
        
        Facture f10=new Facture();
        f10.setNumFact(1010L);
        f10.setDateFact(chaineVersDate("09/01/2018"));
        f10.setMontantFact(228.6F);
        f10.setReglee(false);
        f10.setLeClient(c1);
        
        toutesLesFactures.add(f10);
        c1.getLesFactures().add(f10);
        
        ////////////////////////////////////////////////
        
        Facture f21=new Facture();
        f21.setNumFact(1021L);
        f21.setDateFact(chaineVersDate("01/02/2018"));
        f21.setMontantFact(163.93F);
        f21.setReglee(false);
        f21.setLeClient(c1);
        
        toutesLesFactures.add(f21);
        c1.getLesFactures().add(f21);
        
        ///////////////////////////////////////////////// 
        
        Facture f22=new Facture();
        f22.setNumFact(1022L);
        f22.setDateFact(chaineVersDate("01/02/2018"));
        f22.setMontantFact(378.34F);
        
        f22.setReglee(true);
        f22.setLeClient(c2);
        
        toutesLesFactures.add(f22);
        c2.getLesFactures().add(f22);
        
         ///////////////////////////////////////////////// 
        
        Facture f23=new Facture();
        f23.setNumFact(1023L);
        f23.setDateFact(chaineVersDate("02/02/2018"));
        f23.setMontantFact(539.5F);
        f23.setReglee(false);
        f23.setLeClient(c2);
        
        toutesLesFactures.add(f23);
        c2.getLesFactures().add(f23);
        
        ///////////////////////////////////////////////// 
        
        Facture f24=new Facture();
        f24.setNumFact(1024L);
        f24.setDateFact(chaineVersDate("02/02/2018"));
        f24.setMontantFact(631.5F);
        f24.setReglee(true);
        f24.setLeClient(c3);
        
        toutesLesFactures.add(f24);
        c3.getLesFactures().add(f24);
        
        ///////////////////////////////////////////////// 
        
        Facture f25=new Facture();
        f25.setNumFact(1025L);
        f25.setDateFact(chaineVersDate("02/02/2018"));
        f25.setMontantFact(245.88F);
        f25.setReglee(false);
        f25.setLeClient(c3);
        
        toutesLesFactures.add(f25);
        c3.getLesFactures().add(f25);
        
         ///////////////////////////////////////////////// 
    }
    
    //</editor-fold>
  
    //<editor-fold defaultstate="collapsed" desc="GETTERS">
    
    
    public static List<Region> getToutesLesRegions() {
        return toutesLesRegions;
    }
    
    public static List<Client> getTousLesClients() {
        return tousLesClients;
    }
    
    public static List<Facture> getToutesLesFactures() {
        return toutesLesFactures;
    }
    
    //</editor-fold>
}


