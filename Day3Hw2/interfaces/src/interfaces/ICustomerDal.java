package interfaces;

public interface ICustomerDal {
	void add();

}
//interface ler de abstractlar gibi NEWLENEMEZLER!
//genellikle, katman gecisleri interfaceler ile yapilir.
//extend vs implement farki ne? Bir class birden fazla interface i implement edebilir.( ornek icin mySqlCustomerdal a bak)
// ama bir clas sadece bir classi extend edebilir.