package com.kodilla.good.patterns.challenges.orderService;

public class WarehouseService {

        private Magazine magazine;
//
    public WarehouseService() {
        this.magazine = new Magazine(3);
    }
//
//    public Magazine getMagazine() {
//        return magazine;
//    }
//
//    public Something getSomething() {
//        return something;
//    }


    public boolean check(Something something) {
        return magazine.getMagazineQuantity() >= something.getQuantity();
    }

    public void decreaseStorage(Something something) {
        magazine.setMagazineQuantity(magazine.getMagazineQuantity() - something.getQuantity());
    }
}
