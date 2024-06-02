package it.motta.spring.SecondApp.reposity;

import java.util.List;

import it.motta.spring.SecondApp.domain.Articoli;


public interface ArticoliRepository {
   
    List<Articoli> SelArticoliByFilter(String filtro);
 
    List<Articoli> SelArticoliByFilter(String filtro, String orderBy, String tipo);
  
    void InsArticolo(Articoli a);

    void delArticolo(String codeArt);

}
