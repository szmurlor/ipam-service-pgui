package pl.edu.pw.edu.pl.pgui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevicesRepositoryService {

    private DevicesRepository devicesRepository;

    @Autowired
    public DevicesRepositoryService(DevicesRepository devicesRepository) {
        this.devicesRepository = devicesRepository;
    }

    public List<Device> list(Integer start, Integer limit) {
        return null;
    }
}
