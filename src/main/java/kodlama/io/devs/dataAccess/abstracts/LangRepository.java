package kodlama.io.devs.dataAccess.abstracts;


import kodlama.io.devs.entities.concretes.Lang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface LangRepository extends JpaRepository<Lang,Integer> {

}
