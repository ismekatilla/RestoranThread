package org.ismek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.ismek.connection.MySqlCon;
import org.ismek.object.Musteri;

public class MusteriDao {

	public boolean musteriEkle(Musteri musteri) {
		
		Connection con = MySqlCon.baglantiOlustur();
		try {
			String sorgu = "insert into musteriler (isim) values (?)";
			PreparedStatement prepareStatement = con.prepareStatement(sorgu);
			prepareStatement.setString(1, musteri.getIsim());
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
	
	public List<Musteri> musterileriGetir() {
		
		ArrayList<Musteri> musteriList = new ArrayList<Musteri>();
		Connection con = MySqlCon.baglantiOlustur();
		try {
			String sorgu = "Select * from musteriler";
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sorgu);
			while (resultSet.next()) {
				int musteriId = resultSet.getInt(1);
				String musteriIsim = resultSet.getString("isim");
				
				Musteri musteri = new Musteri();
				musteri.setId(musteriId);
				
				musteri.setIsim(musteriIsim);
				musteriList.add(musteri);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Hata oluştu. Bağlantı bile kapatılamadı.");
			}
		}
		return musteriList;
	}
}
