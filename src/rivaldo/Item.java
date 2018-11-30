package rivaldo;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivaldz
 */

public class Item { // class item digunakan untuk menampung item yang akan di tampilkan ke ui 
	private String namaBarang; //atribut nama barang digunakan untuk menambah nama dengan jcombo box	
	private double harga; //mengambil harga 

	public Item() {
	}

	
	public Item(String namaBarang,double harga) { //konstructor default sesuai atribut
		this.namaBarang = namaBarang;		
		this.harga = harga;
	}
	
	
	@Override
	public String toString() { //menampikan nama barang(outpu)
		return this.namaBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) { //men set atau memasukan nama barang
		this.namaBarang = namaBarang;
	}
	public double getHarga() { //memanggil harga
		return harga;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}
	
}
