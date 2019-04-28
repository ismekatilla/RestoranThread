package org.ismek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ismek.connection.MySqlCon;
import org.ismek.object.Urun;

public class UrunDao {

	public boolean urunEkle(Urun urun) {
		
		Connection con = MySqlCon.baglantiOlustur();
		try {
			String sorgu = "insert into urunler (urun_ad, urun_fiyat) values (?, ?)";
			PreparedStatement prepareStatement = con.prepareStatement(sorgu);
			prepareStatement.setString(1, urun.getAdi());
			prepareStatement.setFloat(2, urun.getFiyat());
			
			prepareStatement.execute();
			
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Hata oluştu. Bağlantı bile kapatılamadı.");
			}
		}
		return true;
	}
}
