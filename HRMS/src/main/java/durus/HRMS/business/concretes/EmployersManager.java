package durus.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import durus.HRMS.business.abstracts.EmployersService;
import durus.HRMS.core.utilities.results.ErrorResult;
import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.core.utilities.results.SuccessResult;
import durus.HRMS.dataAccess.abstracts.EmployersDao;
import durus.HRMS.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{

	EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		this.employersDao=employersDao;
	}
	
	@Override
	public List<Employers> getAll() {
		return this.employersDao.findAll();
	}

	@Override
	public Result add(Employers employers) {
		if(employers.getCompanyName()=="" || employers.getWebSiteAdress() == "" 
				|| employers.getEmail()=="" || employers.getPhoneNumber()=="" 
				|| employers.getPassword()=="") {
			return new ErrorResult("Tüm alanlar dolu olmak zorundadır.");
		}
		else if(!emailCompareWithDomain(employers).isSuccess()) {
			return new ErrorResult("Şirket maili ile web adresi aynı olması gerekir.");
		}
		else if(this.employersDao.getByEmail(employers.getEmail()) != null) {
			return new ErrorResult("Bu mail ile daha önce kayıt olunmuş.");
		}
		else {
			this.employersDao.save(employers);
			return new SuccessResult("Başarılı şekilde kayıt olundu E postanıza giderek doğrulama "
		+ "yaptıktan sonra personellerimiz onayladıktan sonra kayıt işleminiz tamamlanacaktır.");
		}
		
	}
	
	private Result emailCompareWithDomain(Employers employers) {
		String domain=employers.getEmail().substring(employers.getEmail().indexOf("@")+1);
				if(!employers.getWebSiteAdress().contains(domain)) {
					return new ErrorResult();
				}
				else {
					return new SuccessResult();
				}
	}

}
