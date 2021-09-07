package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int _total_buah;

    public static void main(String[] args) {

        ArrayList<String> namaBuah = new ArrayList<String>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Total Buah Yang akan anda inputkan : ");
        _total_buah = scanner.nextInt();
        System.out.println();

        for (int i = 0 ; i < _total_buah; i++){
            scanner.nextLine();
            System.out.print("Masukkan Nama Buah : ");
            namaBuah.add(scanner.nextLine());
            System.out.print("Masukkan jumlah "+namaBuah.get(i)+" : ");
            jumlah.add(scanner.nextInt());
        }

        for (int i = 0 ; i < namaBuah.size(); i++){
            System.out.println("Buah "+namaBuah.get(i)+" Memiliki Jumlah "+jumlah.get(i));
        }

    }
}
