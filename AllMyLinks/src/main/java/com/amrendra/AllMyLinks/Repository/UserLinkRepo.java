package com.amrendra.AllMyLinks.Repository;

import com.amrendra.AllMyLinks.Entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLinkRepo extends JpaRepository<Link, Integer> {

}
