package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.TestTool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestToolRepository extends JpaRepository<TestTool,Integer> {
}
