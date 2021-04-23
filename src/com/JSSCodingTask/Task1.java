package com.JSSCodingTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    String name;
    int cost;
    Boolean in_stock;

    Product(){}

    Product(String name, int cost, Boolean in_stock)
    {
        this.name = name;
        this.cost = cost;
        this.in_stock = in_stock;
    }

    void sort_Name(ArrayList<Product> list)
    {
        Collections.sort(list, new Comparator<Product>()
        {
            @Override
            public int compare(Product p1, Product p2)
            {
                return String.valueOf(p1.name).compareTo(p2.name);
            }
        });
    }

    void sort_price(ArrayList<Product> list)
    {
        Collections.sort(list, new Comparator<Product>()
        {
            @Override
            public int compare(Product c1, Product c2)
            {
                return Integer.valueOf(c1.cost).compareTo(c2.cost);
            }
        });
    }

    void sort_In_Stock(ArrayList<Product>list)
    {
        Collections.sort(list, new Comparator<Product>()
        {
            @Override
            public int compare(Product b1, Product b2)
            {
                return Boolean.valueOf(b1.in_stock).compareTo(b2.in_stock);
            }
        });
    }

    void display(ArrayList<Product> list)
    {
        for (Product ob : list)
        {
            System.out.println(ob.name+" " + ob.cost+", "+ob.in_stock);
        }

    }
}


public class Task1 {
    public static void main(String args[])
    {

        Product o1 = new Product("Carrot", 10, true);
        Product obj2 = new Product("Banana Half Dozen", 20, false);
        Product obj3 = new Product("Banana Dozen", 40, true);
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(o1);
        list.add(obj2);
        list.add(obj3);
        Product temp = new Product();
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to Sort by Name");
        System.out.println("Press 2 to Sort by Price");
        System.out.println("Press 3 to Sort by In-Stock");
        System.out.println("Enter your Choce: ");
        x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("sort by Name");
                System.out.println("====================");
                temp.sort_Name(list);
                temp.display(list);
                break;
            case 2:
                System.out.println("sort by Price");
                System.out.println("====================");
                temp.sort_price(list);
                temp.display(list);
                break;
            case 3:
                System.out.println("sort by In-Stock");
                System.out.println("====================");
                temp.sort_In_Stock(list);
                temp.display(list);
                break;
        }
    }
}
