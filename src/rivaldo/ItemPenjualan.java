package rivaldo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rivaldz
 */
public class ItemPenjualan {
	private String nama;
	private int jumlah ;
	private float harga;
	private DefaultTableModel tabel = new DefaultTableModel();
	
	public ItemPenjualan() {
	getTabel().addColumn("Barang");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Qty");
        getTabel().addColumn("Satuan");
        getTabel().addColumn("Jumlah");
	
	}

	public String getNama() {
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
	
	

}
	

