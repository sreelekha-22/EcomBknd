package com.dive.model;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
// compares 2 objs field values, not references
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private double discountPercentage;

    private LocalDate validityStartDate;

    private LocalDate validityEndDate;

    private double minimumOrderValue;

    private boolean isActive=true;

    @ManyToMany(mappedby = "usedCoupons")
    // it won't create extra table for this
    // just go this table & map it
    private Set<User> useByUsers =  new HashSet<>();

}
