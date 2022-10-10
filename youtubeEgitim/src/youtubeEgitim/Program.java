package youtubeEgitim;

public class Program {
	
//	/*
//	 Program Akisi
//	 -Nesne Yonelimli Programlama Nedir
//	 -Referans Tipleri Anlamak
//	 -Class Kavrami
//	 -Constructor Kavrami
//	 -Interface Kavrami
//	 -Abstract Class Kavrami
//	 -Polymorphism
//	 -Ornekler		
//	 */
	public static void main(String[] args) {
//		//-Referans Tipleri Anlamak
//		
//		System.out.println("Hello World!");
//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;
//		sayi2 = 100;
//		//sayi1 i yazdirdigimizda karsimiza ne cikar? - 20 
//		//bellekte 2 adet alan var, bunlardan birinin ismi stack, digerininki heap.
//		//biz int sayi1 diye bir sey tanimladigimizda, bu degeri gidip stack bolumune yazar. 
//		//Sonrasinda sayi2 diye bir deger tanimladik. O de primitive tipidir ve stack bolumune kaydedilir.
//		// sayi1 = sayi3 demek, sayi1 in degeri sayi2 nin degerine esittir demektir.yani sayi1 in degeri 20 oldu.
//		//sonra sayi2 =100 yaptik. sayi2 nin degerini 100 yaptik. Bu asamadan sonra sayi1 e baktigimizda, stackte 
//		//yer alan sayi1 degerinin hala 20 oldugunu goruruz. 
//		System.out.println(sayi1);
//		
//		
//		int[] sayilar1 = {1,2,3};
//		int[] sayilar2 = {10,20,30};
//		
//		sayilar1 = sayilar2;
//		
//		sayilar2[0]=1000;
//		
//		//Bu durumda, sayilar1 in 0. elemani nedir diye yazdirsak karsimiza ne cikar? - 1000
//		//o da nesi? 1000 cikiyor cunku arraylar referans tiptir. Stack ve heap e geri donelim. sayilar1 e verileri tanimladik ya, sayilar1
//		// stacke yazdiriliyor. new dedigimiz zaman, sayilar1 in karsiligi olan degerler heapte olusturuluyor. Bunlari isaretlemek icin de 
//		//adressler olusturuyor. ornegin s1 in adresi 101 olsun. 
//		//Saylar2 icin de sayilar 2 stack e , karsiligi olan degerler heape aktariliyor ve adres olarak da 102 verilmis olsun.
//		//sayilar1 = sayilar2 demek, sayilar 1 in referans numarasi (adresi) == sayilar2nin adresi demektir. Yani sayilar1 in adresi artik 101 
//		//degil 102. Bu durumda, {1,2,3} un bir karsiligi kalmadigi icin garbage collector a gidiyor. sayilar 1 ve sayilar 2 nin ikisinin de adresi
//		//oldugu icin, ikisinin de aldigi degerler { 1000, 20, 30} olur. Bu durumda, sayilar1 in 0. degeri de 1000 olmus oluyor.
//		
//		System.out.println(sayilar1[0]);
//		
//		
//		//Class Kavrami
//		
//		//Class nedir?
//		//Class bizim icerisinde yapacagimiz islemleri tutan veya herhangi bir konuda bilgi tutan yapilardir.
//		
//	
//		CreditManager creditManager = new CreditManager();
//		creditManager.Calculate();
//		creditManager.Calculate();
//		creditManager.Save();
//		
//		Customer customer = new Customer();
//		customer.setId(1);
//		customer.setCity("Vancouver");
//
//
//		
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.Save();
//		customerManager.Delete();
//		
//		Company company = new Company();
//		company.setTaxNumber("1000000");
//		company.setCompanyName("Arcelik");
//		company.setId(100);
//		
//		
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//		
//		Person person = new Person();
//		person.setFirstName("");
//		person.setNationalIdentity("1234");
//		
//		Customer c1 = new Customer();
//		Customer c2 = new Person();
//		Customer c3 = new Company();
	
	
	
	//------------------------------------Interface---------------------------------
	
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryClassManager());
		customerManager.GiveCredit();
		
		CustomerManager customerManager1 = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager1.GiveCredit();
	
		 
		//Astract class lar ne ise yariyor?
		// ornegin, calcullate her yerde degisiyor ama save her yerde ayni olsun. (Kaydedildi)
		//Yazilin gelistirmede DRY kurali vardir. DONOT REPEAT YOURSELF!
		//Ama biz gittik CreditManager,TeacherCreditManager ve MilitaryCreditManager da ayni save i 3 kere yazdik.
		
		//bir sinif sadece bir abstract sinifi veya baska bir classi inherit edebilir. Hem class i hem abstract classi inherit edemez.
		//abstract siniflar da interface ler de newlenemezler. 
				

	}

}
