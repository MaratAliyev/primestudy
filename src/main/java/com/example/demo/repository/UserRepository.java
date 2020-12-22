package com.example.demo.repository;


import com.example.demo.model.Task;
import com.example.demo.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<Users, Long> {
//    @Query("select u from Users u where u.login = ?1")
//    @Transactional(readOnly = true)
//    Users findByAnnotatedQuery(String login);
        Optional<Users> findByLogin(String login);
}
