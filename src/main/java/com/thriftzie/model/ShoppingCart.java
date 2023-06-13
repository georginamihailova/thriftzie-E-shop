package com.thriftzie.model;

import com.thriftzie.enumerations.ShoppingCartStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private ShoppingCartStatus shoppingCartStatus;

    public ShoppingCart() {
    }

    public ShoppingCart(User user, ShoppingCartStatus shoppingCartStatus) {
        this.user = user;
        this.shoppingCartStatus = shoppingCartStatus;
    }
}
