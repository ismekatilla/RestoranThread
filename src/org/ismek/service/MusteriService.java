package org.ismek.service;

import java.util.List;

import org.ismek.dao.MusteriDao;
import org.ismek.object.Musteri;

public class MusteriService {

	public boolean musteriEkle(Musteri musteri) {
		MusteriDao musteriDao = new MusteriDao();
		return musteriDao.musteriEkle(musteri);
	}
	
	public List<Musteri> musterileriGetir() {
		MusteriDao musteriDao = new MusteriDao();
		return musteriDao.musterileriGetir();
	}
}
