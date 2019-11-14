package local.patrickchow.zoo.zooassignment.services;

import local.patrickchow.zoo.zooassignment.models.Zoo;
import local.patrickchow.zoo.zooassignment.view.Count;

import java.util.List;

public interface ZooService {

    List<Zoo> getAll();

    Zoo getZooById(long zooid);

    List<Zoo> getZooByLikeName(String name);

    Zoo addZoo(Zoo zoo);

    Zoo updateZoo(long zooid, Zoo zoo);

    void deleteZoo(long id);

    List<Count> animalCount();

    void deleteZooAnimalsItem(long zooid, long animalid);

    void addZooAnimal(long zooid, long animalid);

}