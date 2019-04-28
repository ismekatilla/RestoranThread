package org.ismek;

import java.util.Date;

import org.ismek.object.Urun;
import org.ismek.service.UrunService;

public class UrunEkleThread2 extends Thread {

	@Override
	public void run() {
		
		UrunService urunService = new UrunService();
		for (int i = 50; i < 100; i++) {
			Urun urun = new Urun();
			urun.setAdi("URUN" + i);
			urun.setFiyat(i);
			urunService.urunEkle(urun);
		}
		System.out.println(new Date());
	}
}
