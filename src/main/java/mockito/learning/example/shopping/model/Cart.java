package mockito.learning.example.shopping.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Cart {

    private Long id;

    private Map<Goods, Integer> goods = new HashMap<>();

    private Person person;

}
