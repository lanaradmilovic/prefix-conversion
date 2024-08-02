package rs.ac.bg.fon.measurementservice.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rs.ac.bg.fon.measurementservice.dto.ConversionRequest;
import rs.ac.bg.fon.measurementservice.service.MeasurementService;

@Controller
@RequestMapping("/measurement")
public class MeasurementMvcController {
    @Autowired
    private MeasurementService measurementService;

    @GetMapping("/convert")
    public String showForm(Model model) {
        model.addAttribute("conversionRequest", new ConversionRequest());
        return "convert";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam double amount, @RequestParam String from, @RequestParam String to, Model model) {
        double result = measurementService.convert(amount, from, to);
        model.addAttribute("result", result);
        return "convert";
    }
}
