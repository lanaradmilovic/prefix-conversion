package rs.ac.bg.fon.measurementservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.measurementservice.dto.Prefix;
import rs.ac.bg.fon.measurementservice.proxy.MeasurementServiceProxy;

@Service
public class MeasurementService {

    @Autowired
    private MeasurementServiceProxy measurementServiceProxy;

    public double convert(double value, String fromPrefix, String toPrefix) {
        Prefix from = measurementServiceProxy.getPrefix(fromPrefix);
        Prefix to = measurementServiceProxy.getPrefix(toPrefix);

        if (from == null || to == null) {
            throw new IllegalArgumentException("Invalid prefix provided");
        }

        // Convert value to base unit (1 unit in `from` prefix)
        double baseValue = value * from.getAmount();

        // Convert base unit to target prefix
        return baseValue / to.getAmount();
    }
}

