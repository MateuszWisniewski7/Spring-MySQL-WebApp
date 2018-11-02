package pl.mw.springmysqldb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mw.springmysqldb.domain.Branches;

public interface BranchesRepository extends JpaRepository<Branches, Integer> {
}
