package com.product.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CrudApplication {
    Scanner scanner = new Scanner(System.in);
    ProductView productView = new ProductView();

    public void Main() {
        System.out.println("MENU MANAGE PRODUCT");
        System.out.println("1.Create Product\n2.Delete Product\n3.Show List Product");
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu) {
            case 1:
                productView.formCreateProduct();
                break;
            case 2:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter the name you want to delete :");
                String name = scanner1.nextLine();
                int index = productView.fileByName(name);
                productView.deleteProduct(index);
                productView.showAll();
                break;
            case 3:
                productView.showAll();
                break;
            case 0:
                break;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

}
