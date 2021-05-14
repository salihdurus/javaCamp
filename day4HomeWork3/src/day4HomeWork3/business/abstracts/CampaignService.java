package day4HomeWork3.business.abstracts;

import day4HomeWork3.entites.concretes.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
}
