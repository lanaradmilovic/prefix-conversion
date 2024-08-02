package rs.ac.bg.fon.prefixinformationservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Prefix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String symbol;
    private double amount;
    @Column(name = "decimal_equivalent")
    private String decimalEquivalent;
    @Column(name = "short_scale")
    private String shortScale;
}
