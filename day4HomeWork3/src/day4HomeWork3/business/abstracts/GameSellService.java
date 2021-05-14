package day4HomeWork3.business.abstracts;

import day4HomeWork3.entites.concretes.Campaign;
import day4HomeWork3.entites.concretes.Game;
import day4HomeWork3.entites.concretes.User;

public interface GameSellService {
	void sale(Game game,User user);
	void sale(Game game,User user,Campaign campaign);
}
