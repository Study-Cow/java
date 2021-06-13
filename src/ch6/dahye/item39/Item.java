package ch6.dahye.item39;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Item {
    @NonNull
    private long Id;
    private String name;
}
