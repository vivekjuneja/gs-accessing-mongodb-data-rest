
package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<Product, String> {

	public List<Product> findById(@Param("id") Integer id);
	
	public List<Product> findByName(@Param("name") String name);
	
	public Product insert(Product product);
	
	List<Product> findAll();

}
