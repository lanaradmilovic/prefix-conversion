package rs.ac.bg.fon.measurementservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import rs.ac.bg.fon.measurementservice.dto.Prefix;


@FeignClient(name = "prefix-information-service", url = "localhost:8080")
public interface MeasurementServiceProxy {
    @GetMapping("/prefix/{name}")
    Prefix getPrefix(@PathVariable("name") String name);
}
