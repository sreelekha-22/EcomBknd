package com.dive.model;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
// compares 2 objs field values, not references
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String locality;

    private String address;

    private String city;

    private String state;

    private String pincode;

    private String mobile;

}
