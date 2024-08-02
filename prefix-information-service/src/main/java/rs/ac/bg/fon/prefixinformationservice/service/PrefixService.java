package rs.ac.bg.fon.prefixinformationservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.prefixinformationservice.model.Prefix;
import rs.ac.bg.fon.prefixinformationservice.repository.PrefixRepository;

@Service
public class PrefixService {
    @Autowired
    private PrefixRepository prefixRepository;
    public Prefix getPrefixByName(String name) {
        return prefixRepository.findByName(name);
    }
}