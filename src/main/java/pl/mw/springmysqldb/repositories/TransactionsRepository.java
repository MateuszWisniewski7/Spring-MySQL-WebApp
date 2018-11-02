package pl.mw.springmysqldb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mw.springmysqldb.domain.Transactions;

import java.sql.Timestamp;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {
    Transactions findByDate(Timestamp date);
}
