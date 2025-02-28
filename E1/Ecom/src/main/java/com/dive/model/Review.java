package com.dive.model;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String reviewText;

    @Column(nullable = false)
    private double rating;

    @ElementCollection
    private List<String> productImages;

    @JsonIgnore
    @ManyToOne
    @Column( nullable = false)
    // @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn( nullable= false)
    // no need, it automatically joins with that table,,  
    // @JoinColumn( nullable= false)
    // u can use '@Not Null' instead of nullable=false
    private User user;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
