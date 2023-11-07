package ma.projet.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.entities.Professeur;
import ma.projet.entities.Specialite;


@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Integer>{
	public List<Professeur> findBySpecialite(Specialite specialite);
}
