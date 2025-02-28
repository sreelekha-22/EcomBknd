package com.dive.model;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @NotNull
    Column(unique  = true)
    private String categoryId;

    @ManyToOne
    private Category parentCategory;

    @NotNull
    private Integer level;
    //level 1 : Men, Women, Elctronics..
    // l2 - TopWear, Bottomwear
    //l3- shirt, kurta,..
}
