package local.patrickchow.zoo.zooassignment.repository;
import local.patrickchow.zoo.zooassignment.models.Zoo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZooRepository extends CrudRepository<Zoo, Long> {

    List<Zoo> findByZoonameContainingIgnoreCase(String name);

}