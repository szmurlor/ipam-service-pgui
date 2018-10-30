package pl.edu.pw.edu.pl.pgui;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PagingDevicesRepository extends PagingAndSortingRepository<Device, Integer> {
}
