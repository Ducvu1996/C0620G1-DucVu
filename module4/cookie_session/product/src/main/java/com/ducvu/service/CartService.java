package com.ducvu.service;

import com.ducvu.entity.Cart;

import java.util.HashMap;

public interface CartService {
        Cart addCart(int id, HashMap<Integer,Cart> cartHashMap );

}
