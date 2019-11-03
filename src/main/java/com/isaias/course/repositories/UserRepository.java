package com.isaias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaias.course.entities.User;

 // @Repository <-- não é necessario pois está camada já está se extendendo ao JPA; sendo assim é opcional;
public interface UserRepository extends JpaRepository<User, Long>{

}
