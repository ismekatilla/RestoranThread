package org.ismek;

import java.util.Date;

import org.ismek.object.Urun;
import org.ismek.service.UrunService;

public class UrunEkleThread extends Thread {

	@Override
	public void run() {
		
		UrunService urunService = new UrunService();
		for (int i = 0; i < 50; i++) {
			Urun urun = new Urun();
			urun.setAdi("URUN" + i);
			urun.setFiyat(i);
			urunService.urunEkle(urun);
		}
		System.out.println(new Date());
	}
}
