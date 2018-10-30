package pl.edu.pw.edu.pl.pgui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;


@RestController
public class DevicesService {
    private DevicesRepository devicesRepository;
    private PagingDevicesRepository pagingDevicesRepository;

    @Autowired
    public DevicesService(DevicesRepository devicesRepository, PagingDevicesRepository pagingDevicesRepository) {
        this.devicesRepository = devicesRepository;
        this.pagingDevicesRepository = pagingDevicesRepository;
    }


    @GetMapping("/devices")
    @ResponseBody
    @Transactional(readOnly = true)
    public String items(@RequestParam Integer start,@RequestParam Integer limit) {
        // return this.devicesRepository.findByName("Kim").toString();
        Page<Device> items = this.pagingDevicesRepository.findAll(PageRequest.of(start, limit));
        List<Device> devs = new LinkedList<>();
        for (Device d: items) {
            devs.add(d);
        }
        return String.valueOf(devs);
    }
}
