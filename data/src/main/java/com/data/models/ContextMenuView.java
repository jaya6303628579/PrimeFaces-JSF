package com.data.models;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dtContextMenuView")
@ViewScoped
public class ContextMenuView  {

    private List<Product> products;

    private Product selectedProduct;

    
    private ProductService service= new ProductService();

    
    public ContextMenuView() {
        products = service.getProducts(20);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public void setService(ProductService service) {
        this.service = service;
    }

    public void deleteProduct() {
        products.remove(selectedProduct);
        selectedProduct = null;
    }

    public void viewProduct() {
        // no-op
    }
}