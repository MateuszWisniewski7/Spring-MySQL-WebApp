package pl.mw.springmysqldb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mw.springmysqldb.models.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
}
