package ma.projet.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import ma.projet.entities.Specialite;


@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Integer> {

	

}
