package com.kodilla.good.patterns.challenges.food2door;

public abstract class Supplier {

     public String supplierName;

     public Supplier(String supplierName) {
          this.supplierName = supplierName;
     }

     public String getSupplierName() {
          return supplierName;
     }

     abstract boolean process(String productName, Integer count);
}

