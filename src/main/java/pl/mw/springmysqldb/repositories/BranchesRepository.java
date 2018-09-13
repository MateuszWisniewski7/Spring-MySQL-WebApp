package pl.mw.springmysqldb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mw.springmysqldb.models.Branches;

public interface BranchesRepository extends JpaRepository<Branches, Integer> {
}
