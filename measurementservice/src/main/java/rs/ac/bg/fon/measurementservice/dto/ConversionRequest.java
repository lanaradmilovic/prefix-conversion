package rs.ac.bg.fon.measurementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConversionRequest {
    private String from;
    private String to;
    private double amount;

}