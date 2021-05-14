package day4HomeWork3.business.concretes;

import day4HomeWork3.business.abstracts.GameSellService;
import day4HomeWork3.entites.concretes.Campaign;
import day4HomeWork3.entites.concretes.Game;
import day4HomeWork3.entites.concretes.User;

public class GameSellManager implements GameSellService{

	@Override
	public void sale(Game game, User user) {
		System.out.println(game.getName()+" "+user.getFirstName()+" adlý kullanýcýya "+game.getPrice()+" Tl fiyatla satýldý.");
		
		
	}

	@Override
	public void sale(Game game, User user, Campaign campaign) {
		double priceAfterCampaign=game.getPrice()-(game.getPrice()*campaign.getDiscountRate())/100;
		
		System.out.println(game.getName()+" "+user.getFirstName()+" adlý kullanýcýya , normal fiyatý "+game.getPrice()+" Tl iken "+campaign.getName()+ "\n ile %"+campaign.getDiscountRate()+" indirimle "+priceAfterCampaign+" Tl fiyatla satýldý.");
		
	}

}
