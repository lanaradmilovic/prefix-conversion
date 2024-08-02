package rs.ac.bg.fon.measurementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prefix {
    private Long id;
    private String name;
    private String symbol;
    private double amount;
    private String decimalEquivalent;
    private String shortScale;
}
