package day4HomeWork3;

import day4HomeWork3.business.concretes.GameSellManager;
import day4HomeWork3.business.concretes.UserManager;
import day4HomeWork3.core.concretes.MernisServiceAdapter;
import day4HomeWork3.entites.concretes.Campaign;
import day4HomeWork3.entites.concretes.Game;
import day4HomeWork3.entites.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Salih", "Dürüs", 1000000000L, 1999);
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		userManager.add(user);
		
		Game game1 =new Game();
		game1.setId(1);
		game1.setName("FarCry");
		game1.setPrice(199.99);
		
		Game game2=new Game(2, "Cs Go", 50);
		
		Campaign campaign=new Campaign(1, "Bahar kampanyasý", 20);
		
		GameSellManager gameSellManager = new GameSellManager();
		gameSellManager.sale(game1, user);
		
		gameSellManager.sale(game2, user, campaign);
		
	}

}
