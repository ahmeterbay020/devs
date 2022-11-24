package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.Lang;
import kodlama.io.devs.entities.concretes.SubLangTech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface SubLangTechrepository extends JpaRepository<SubLangTech,Integer> {
    //@Query("select name from Lang l")
    @Query(
            value = "SELECT * FROM langs l ",
            nativeQuery = true)
    public List<Map> findByLang();
}
