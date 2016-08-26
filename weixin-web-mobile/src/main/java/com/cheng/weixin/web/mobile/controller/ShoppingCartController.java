package com.cheng.weixin.web.mobile.controller;

import com.cheng.weixin.web.mobile.model.Response;
import com.cheng.weixin.web.mobile.result.cart.ShoppingCartInfo;
import com.cheng.weixin.web.mobile.security.IgnoreSecurity;
import com.cheng.weixin.web.mobile.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Desc: 购物车
 * Author: cheng
 * Date: 2016/08/27
 */
@RestController
@RequestMapping("cart")
public class ShoppingCartController extends BaseController {
    @Autowired
    private CartService cartService;

    /** 购物车信息 **/
    @IgnoreSecurity
    @RequestMapping(value = "v1/info")
    public ResponseEntity<Response> login(HttpServletRequest request) {
        ShoppingCartInfo shoppingCartInfo = cartService.getShoppingCart("1");
        return success(shoppingCartInfo);
    }

}