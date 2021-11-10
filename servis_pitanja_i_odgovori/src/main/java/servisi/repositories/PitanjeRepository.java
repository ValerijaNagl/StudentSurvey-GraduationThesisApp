package servisi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import servisi.domain.Pitanje;

import java.util.List;

public interface PitanjeRepository extends JpaRepository<Pitanje, Integer> {

    @Query(" SELECT pitanje FROM Pitanje pitanje WHERE pitanje.tip='fakultet'")
    List<Pitanje> findQuestionsAboutUni();

    @Query("SELECT pitanje FROM Pitanje pitanje WHERE pitanje.tip=:tipPitanja AND pitanje.id>81")
    List<Pitanje> findQuestionsByType(String tipPitanja);


}
