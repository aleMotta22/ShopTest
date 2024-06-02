package it.motta.spring.SecondApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.motta.spring.SecondApp.domain.Articoli;
import it.motta.spring.SecondApp.reposity.ArticoliRepository;

@Service
public class ArticoliServiceImpl implements ArticoliService {

    @Autowired
    ArticoliRepository articoliRepository;

    @Override
    public List<Articoli> SelArticoliByFilter(String filtro) {
        return articoliRepository.SelArticoliByFilter(filtro);
    }

    @Override
    public List<Articoli> SelArticoliByFilter(String filtro, String orderBy, String tipo) {
        return articoliRepository.SelArticoliByFilter(filtro, orderBy, tipo);
    }

    @Override
    public void InsArticolo(Articoli a) {
        articoliRepository.InsArticolo(a);
    }

    @Override
    public void delArticolo(String codeArt) {
        articoliRepository.delArticolo(codeArt);
    }

}
