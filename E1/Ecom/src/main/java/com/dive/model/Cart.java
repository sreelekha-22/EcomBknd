package com.dive.model;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User user;

    // Any changes in cartItems will be reflected here
    // ifuser updated quantity in cartItem, will be reflected here in the cart too
    // When we delete any card item, it will be deleted from this set
    @OneToMany(mappedBy = "cart" , cascade =CascadeType.ALL, orphanRemoval = true)
    private Set<CartItems> cartItems = new HashSet<>();

    private double totalsellingPrice;

    private int totalItem;

    private int totalMrpPrice;

    private int discount;

    private String couponCode;
}
