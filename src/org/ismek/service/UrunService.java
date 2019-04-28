package org.ismek.service;

import org.ismek.dao.UrunDao;
import org.ismek.object.Urun;

public class UrunService {

	public boolean urunEkle(Urun urun) {
		if (urun.getFiyat() > 7f) {
			urun.setAdi("!!! LÜKS ÜRÜN !!! - " + urun.getAdi());
		}
		UrunDao urunDao = new UrunDao();
		return urunDao.urunEkle(urun);
	}
}
