package it.motta.spring.SecondApp.reposity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.motta.spring.SecondApp.domain.Articoli;

public class ArticoliMapper implements RowMapper<Articoli> {

    @Override
    public Articoli mapRow(ResultSet rs, int rowNum) throws SQLException {
    
        Articoli articolo = new Articoli();
        try {
            articolo.setRiga(rowNum);
            articolo.setCodArt(rs.getString("CODART"));
            articolo.setDescrizione(rs.getString("DESCRIZIONE"));
            articolo.setUm(rs.getString("UM"));
            articolo.setCodStat(rs.getString("CODSTAT"));
            articolo.setPesoNetto(rs.getDouble("PESONETTO"));
            articolo.setPzCart(rs.getInt("PZCART"));
            articolo.setIdIva(rs.getInt("IDIVA"));
            articolo.setIdStatoArt(rs.getString("IDSTATOART"));
            articolo.setIdFamAss(rs.getInt("IDFAMASS"));
            articolo.setPrezzo(rs.getDouble("PREZZO"));
            articolo.setDataCreazione(rs.getDate("DATACREAZIONE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articolo;
    }

}
