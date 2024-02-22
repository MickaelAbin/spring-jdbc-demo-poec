package fr.epsi.poec24.demospring.dal;

import fr.epsi.poec24.demospring.domain.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FournisseurDAOImpl implements FournisseurDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    private static final String FIND_ALL_QUERY = "SELECT ID,NOM AS RAISONSOCIALE FROM fournisseur";
    private static final String FIND_BY_ID_QUERY = "SELECT ID,NOM AS RAISONSOCIALE FROM fournisseur WHERE ID :id";

    @Autowired
    public FournisseurDAOImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public Fournisseur create(Fournisseur fournisseur) {
        return null;
    }

    @Override
    public List<Fournisseur> findAll() {
        return namedParameterJdbcTemplate.query(FIND_ALL_QUERY,new BeanPropertyRowMapper<>(Fournisseur.class));
    }

    @Override
    public Fournisseur findById(int id) {
        return null;
    }

    @Override
    public Fournisseur update(Fournisseur fournisseur) {
        return null;
    }

    @Override
    public void delete(Fournisseur fournisseur) {

    }
}
