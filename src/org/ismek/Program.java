package org.ismek;

import java.util.Date;

import org.ismek.object.Urun;
import org.ismek.service.UrunService;

public class Program {

	public static void main(String[] args) {
		
		System.out.println(new Date());
		
//		UrunEkleThread urunEkleThread1 = new UrunEkleThread();
//		UrunEkleThread2 urunEkleThread2 = new UrunEkleThread2();
//		
//		urunEkleThread1.start();
//		urunEkleThread2.start();
		
		Date date1 = new Date();
		UrunService urunService = new UrunService();
		for (int i = 0; i < 100; i++) {
			Urun urun = new Urun();
			urun.setAdi("URUN" + i);
			urun.setFiyat(i);
			urunService.urunEkle(urun);
		}
		
		Date date2 = new Date();
		
		long diff = date2.getTime() - date1.getTime(); 
		System.out.println(diff);
	}
}
