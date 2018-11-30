package rivaldo;

import java.util.Objects;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rivaldz
 */
public class ItemPenjualan { //class yang menangani jComboBox
	private String nama;
	private int jumlah ;
	private float harga;
	 DefaultTableModel tabel = new DefaultTableModel();
	
	public ItemPenjualan() { //mengisi nama row jComboBox 
	getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Jumlah");
	}
	public double countSubtotal(){//menghitung total transaksi 
        double subTotal=0;
	double penghitungan = 0;
        for (int i=0 ; i < tabel.getRowCount();i++){
	    penghitungan = Double.parseDouble((String) tabel.getValueAt(i, 2));
            subTotal = subTotal + (penghitungan*Double.parseDouble(tabel.getValueAt(i, 1).toString()));
            }
           return subTotal;
	 }
	public String showSave(){//menampilkan apabila ada 2 jenis barang yang berbeda 
		
		String obt = "";
		for(int j = 0 ;j < tabel.getRowCount(); j++){
            obt += "\n" + tabel.getValueAt(j, 0) + "\t " + tabel.getValueAt(j, 2 ) + "\t " + tabel.getValueAt(j, 1);
		}
		return  obt ;
	}	
	
	public String getNama() { //geter mendapatkan nilai 
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public float getHarga() {
		return harga;
	}

	public void setHarga(float harga) {
		this.harga = harga;
	}

	public DefaultTableModel getTabel() {
		return tabel;
	}

	public void setTabel(DefaultTableModel tabel) {
		this.tabel = tabel;
	}
	public int getRowCount(){
		return tabel.getRowCount();
	}
}
	

