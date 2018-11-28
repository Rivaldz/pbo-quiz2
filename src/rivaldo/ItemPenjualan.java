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
	getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Jumlah");
        
	
	}
	public double countSubtotal(){
        double subTotal=0;
	double penghitungan = 0;
        for (int i=0 ; i < tabel.getRowCount();i++){
	    penghitungan = Double.parseDouble((String) tabel.getValueAt(i, 2));
            subTotal = subTotal + (penghitungan*Double.parseDouble(tabel.getValueAt(i, 1).toString()));
        }
        return subTotal;
    }
	public String countName(){
	   String subTotal;
	   String penghitungan = "\n";
	   for (int i=0 ; i < tabel.getRowCount();i++){
	    penghitungan = (String) tabel.getValueAt(i, 0);
            
           }
	   return  penghitungan;
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
	

