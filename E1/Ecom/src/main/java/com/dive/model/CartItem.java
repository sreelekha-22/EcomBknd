package com.dive.model;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JsonIgnore
    private Cart cart;

    private Product product;

    private String size;
    // s m l xl

    private int quantity = 1;

    private Integer mrpPrice;

    private Integer sellingPrice;

    private Long userId;
    
}
