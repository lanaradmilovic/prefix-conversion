package rs.ac.bg.fon.measurementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.ac.bg.fon.measurementservice.service.MeasurementService;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {

    @Autowired
    private MeasurementService measurementService;

    @GetMapping("/convert/from/{from}/to/{to}/amount/{amount}")
    public double convert(
            @PathVariable("from") String from,
            @PathVariable("to") String to,
            @PathVariable("amount") String amount) {
        try {
            double amountValue = Double.parseDouble(amount);
            return measurementService.convert(amountValue, from, to);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid amount format: " + amount, e);
        }
    }
}
