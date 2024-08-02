package rs.ac.bg.fon.prefixinformationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.prefixinformationservice.model.Prefix;
import rs.ac.bg.fon.prefixinformationservice.service.PrefixService;

@RestController
@RequestMapping("/prefix")
public class PrefixController {
    @Autowired
    private PrefixService prefixService;

    @GetMapping("/{name}")
    public Prefix getPrefix(@PathVariable String name) {
        return prefixService.getPrefixByName(name);
    }
}
