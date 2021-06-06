package durus.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import durus.HRMS.business.abstracts.CandidatesService;
import durus.HRMS.core.abstracts.MernisService;
import durus.HRMS.core.utilities.results.ErrorResult;
import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.core.utilities.results.SuccessResult;
import durus.HRMS.dataAccess.abstracts.CandidatesDao;
import durus.HRMS.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService{

	private CandidatesDao candidatesDao;
	private MernisService mernisService;
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao, MernisService mernisService) {
		this.candidatesDao=candidatesDao;
		this.mernisService=mernisService;
	}
	
	@Override
	public List<Candidates> getAll() {
		return this.candidatesDao.findAll();
	}

	@Override
	public Result add(Candidates candidates) {
		if(candidates.getFirstName()=="" || candidates.getLastName()=="" || 
				candidates.getIdentityNumber()=="" || candidates.getBirthOfYear()==0 || 
				candidates.getEmail()=="" || candidates.getPassword()=="") {
			return new ErrorResult("Tüm alanlar dolu olmak zorundadır.");
		}
		else if(this.candidatesDao.getByEmail(candidates.getEmail()) != null) {
			return new ErrorResult("Bu E-Posta ile daha önce kayıt olunmuş !");
		}
		else if(this.candidatesDao.getByIdentityNumber(candidates.getIdentityNumber()) != null) {
			return new ErrorResult("Bu TC Kimlik numarası ile daha önce kayıt olunmuş !");
		}
		else if(this.mernisService.checkIfRealPerson(candidates)==false) {
			return new ErrorResult("Bilgilerinizde hata var, lütfen kontrol ediniz.");
		}
		else {
			this.candidatesDao.save(candidates);
			return new SuccessResult("Başarıyla kayıt oldunuz. Lütfen E-Posta adresine giderek hesabınızı aktifleştiriniz.");
		
		}
	
	}
}
	

