package ch6.dahye.item41;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Item {
    private long id;
    private String name;
    private BigDecimal price;
}
