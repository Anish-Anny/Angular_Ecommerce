package com.project.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.model.Product_Category;

@RepositoryRestResource(collectionResourceRel = "productCat", path = "productCat")
@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepo  extends CrudRepository<Product_Category, Long>{
}
