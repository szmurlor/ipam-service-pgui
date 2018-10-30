package pl.edu.pw.edu.pl.pgui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DevicesService {
    @Autowired
    private DevicesRepository devicesRepository;

    @GetMapping("/")
    @ResponseBody
    @Transactional(readOnly = true)
    public String helloWorld() {
        return this.devicesRepository.findByName("Kim").toString();
    }
}
