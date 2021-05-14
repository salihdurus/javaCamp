package day4HomeWork3.business.concretes;

import day4HomeWork3.business.abstracts.CampaignService;
import day4HomeWork3.entites.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" Kampanyas� eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" Kampanyas� silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" Kampanyas� g�ncellendi");
		
	}

}
