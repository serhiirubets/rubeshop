package com.rubeshop.app.cartItem;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rubeshop.app.cart.Cart;
import com.rubeshop.app.product.Product;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JsonIgnore
    private Cart cart;

    @OneToOne
    private Product product;

    private String size;

    private Integer qty = 1;

    private Integer mrpPrice;

    private Integer sellingPrice;

    private Long userId;
}
