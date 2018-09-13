package pl.mw.springmysqldb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mw.springmysqldb.models.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {
}
