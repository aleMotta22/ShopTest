package it.motta.spring.SecondApp.reposity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import it.motta.spring.SecondApp.domain.Articoli;

@Repository
public class ArticoliRepositoryIml implements ArticoliRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Articoli> SelArticoliByFilter(String filtro) {
        String sql = "EXEC [dbo].[Sp_selArticoli]  '" + filtro + "'";
        List<Articoli> articoli = jdbcTemplate.query(sql, new ArticoliMapper());
        return articoli;
    }

    @Override
    public List<Articoli> SelArticoliByFilter(String filtro, String orderBy, String tipo) {
        String sql = "EXEC [dbo].[Sp_selArticoli] " +
                "'" + filtro + "'," +
                "'" + orderBy + "'," +
                "'" + tipo + "'";
        List<Articoli> articoli = jdbcTemplate.query(sql, new ArticoliMapper());
        return articoli;
    }

    @Override
    public void InsArticolo(Articoli a) {
        String sql = "EXEC Sp_insArticoli " +
                "'" + a.getCodArt() + "'," +
                "'" + a.getDescrizione().replace("'", "''") + "'," +
                "'" + a.getUm() + "'," +
                "'" + a.getCodStat() + "'," +
                "'" + a.getPzCart() + "'," +
                "'" + a.getPesoNetto() + "'," +
                "'" + a.getIdIva() + "'," +
                "'" + a.getIdStatoArt() + "'," +
                "'" + a.getIdFamAss() + "'";
        jdbcTemplate.update(sql);
    }

    @Override
    public void delArticolo(String codeArt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
