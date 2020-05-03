//package com.kodilla.patterns.builder.bigmac;
//
//public class Bun {
//    public final static String WITHSESAME = "With sesame";
//    public final static String WITHOUTSESAME = "Without sesame";
//    private String bun;
//
//    public Bun(String bun) {
//        if (WITHOUTSESAME.equals(bun) || WITHSESAME.equals(bun)) {
//            this.bun = bun;
//        } else {
//            throw new IllegalStateException("Bun must be with sesame or without sesame");
//        }
//    }
//
//    public String getBun() {
//        return bun;
//    }
//
//    @Override
//    public String toString() {
//        return  bun;
//    }
//}
