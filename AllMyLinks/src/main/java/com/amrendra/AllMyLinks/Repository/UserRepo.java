package com.amrendra.AllMyLinks.Repository;

import com.amrendra.AllMyLinks.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
