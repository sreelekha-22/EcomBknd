package com.dive.model;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
// compares 2 objs field values, not references
public class User {

@OneToMany
    address -

@ManyToMany
@JsonIgnore
// we don't need this data from user in frontend
// we need it in backend only
    coupon
    Set<Coupon> usedCoupons = ;
}
