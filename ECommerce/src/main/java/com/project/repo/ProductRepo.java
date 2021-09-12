package com.project.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.model.Product;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
@CrossOrigin("http://localhost:4200")
public interface ProductRepo extends CrudRepository<Product, Long>{

}
