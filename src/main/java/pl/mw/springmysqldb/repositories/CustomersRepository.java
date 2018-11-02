package pl.mw.springmysqldb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mw.springmysqldb.domain.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
}
