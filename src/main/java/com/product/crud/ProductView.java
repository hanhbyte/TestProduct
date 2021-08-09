package com.product.crud;

import com.product.crud.controller.ProductController;
import com.product.crud.model.Product;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    public List<Product> Products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ProductController productController = new ProductController();

    public void formCreateProduct() {
        boolean checkCreate = true;
        while (checkCreate) {
            System.out.println("");
            Long id = scanner.nextLong();
            System.out.println("");
            String name = scanner.nextLine();
            System.out.println("");
            String price = scanner.nextLine();
            Product product = new Product(id, name, price);
            productController.createProduct(product);
            System.out.println("Nhập một phím bất kì để tạo dữ liệu tiếp - Nhập QUIT để thoát khỏi chương trình");
            String enterQuit = scanner.next();
            if (enterQuit.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }

    public void deleteProduct(int index) {
        this.Products.remove(index);
    }

    public int fileByName(String name) {
        for (int i = 0; i < Products.size(); i++) {
            if (Products.get(i).getName().contains(name))
                return i;
        }
        return -1;
    }

    public void showAll() {
        for (Product product : Products){
            System.out.println(product);
        }
    }

    public void manageProductList() {
        System.out.println("STT--NAME--PRICE");
        System.out.println("SIZE ==" + productController.showListProduct().size());
        for (int i = 0; i < productController.showListProduct().size(); i++) {
            System.out.println(" " + productController.showListProduct().get(i).getId()
                    + "  " + productController.showListProduct().get(i).getName()
                    + "  " + productController.showListProduct().get(i).getPrice());
        }
        String enterQuit = scanner.nextLine();
        if (enterQuit.equalsIgnoreCase("quit")) {
            new Main();
        }
    }
}
