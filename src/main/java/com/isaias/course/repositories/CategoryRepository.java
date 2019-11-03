package com.isaias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaias.course.entities.Category;

 // @Repository <-- não é necessario pois está camada já está se extendendo ao JPA; sendo assim é opcional;
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
