package pl.edu.pw.edu.pl.pgui;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DevicesRepository extends CrudRepository<Device, Integer> {
    List<Device> findByName(String name);
}
