//package rs.ac.bg.fon.prefixinformationservice.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import rs.ac.bg.fon.prefixinformationservice.model.Prefix;
//import rs.ac.bg.fon.prefixinformationservice.repository.PrefixRepository;
//
//@Service
//public class PrefixService {
//    @Autowired
//    private PrefixRepository prefixRepository;
//    public Prefix getPrefixByName(String name) {
//        return prefixRepository.findByName(name);
//    }
//}
package rs.ac.bg.fon.prefixinformationservice.service;

import org.springframework.stereotype.Service;
import rs.ac.bg.fon.prefixinformationservice.model.Prefix;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrefixService {

    private List<Prefix> prefixes = new ArrayList<>();

    public PrefixService() {
        // Inicijalizacija podataka
        prefixes.add(new Prefix(1L, "jota", "Y", 1e24, "1 000 000 000 000 000 000 000 000", "septilion"));
        prefixes.add(new Prefix(2L, "zeta", "Z", 1e21, "1 000 000 000 000 000 000 000", "sekstilion"));
        prefixes.add(new Prefix(3L, "eksa", "E", 1e18, "1 000 000 000 000 000 000", "kvintillion"));
        prefixes.add(new Prefix(4L, "peta", "P", 1e15, "1 000 000 000 000 000", "kvadrilion"));
        prefixes.add(new Prefix(5L, "tera", "T", 1e12, "1 000 000 000 000", "trilion"));
        prefixes.add(new Prefix(6L, "giga", "G", 1e9, "1 000 000 000", "bilion"));
        prefixes.add(new Prefix(7L, "mega", "M", 1e6, "1 000 000", "milion"));
        prefixes.add(new Prefix(8L, "kilo", "k", 1e3, "1 000", "hiljada"));
        prefixes.add(new Prefix(9L, "hekto", "h", 1e2, "100", "sto"));
        prefixes.add(new Prefix(10L, "deka", "da", 1e1, "10", "deset"));
        prefixes.add(new Prefix(11L, "jedan", "1", 1.0, "1", "jedan"));
        prefixes.add(new Prefix(12L, "deci", "d", 1e-1, "0.1", "deseti deo"));
        prefixes.add(new Prefix(13L, "centi", "c", 1e-2, "0.01", "stoti deo"));
        prefixes.add(new Prefix(14L, "mili", "m", 1e-3, "0.001", "hiljaditi deo"));
        prefixes.add(new Prefix(15L, "mikro", "u", 1e-6, "0.000 001", "milioniti deo"));
        prefixes.add(new Prefix(16L, "nano", "n", 1e-9, "0.000 000 001", "bilioniti deo"));
        prefixes.add(new Prefix(17L, "piko", "p", 1e-12, "0.000 000 000 001", "trilioniti deo"));
        prefixes.add(new Prefix(18L, "femto", "f", 1e-15, "0.000 000 000 000 001", "kvadrilioniti deo"));
        prefixes.add(new Prefix(19L, "ato", "a", 1e-18, "0.000 000 000 000 000 001", "kvintilioniti deo"));
        prefixes.add(new Prefix(20L, "zepto", "z", 1e-21, "0.000 000 000 000 000 000 001", "sekstilioniti deo"));
        prefixes.add(new Prefix(21L, "jokto", "y", 1e-24, "0.000 000 000 000 000 000 000 001", "septilioniti deo"));
    }

    public Prefix getPrefixByName(String name) {
        return prefixes.stream()
                .filter(prefix -> prefix.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
