package ua.org.oa.kostitcina;

import java.util.ArrayList;
import java.util.List;

public class Story {
	//private boolean pulled = false;
	List<Actor> actorsList = new ArrayList<>();
	//private static Actor turnip = new Actor("Репка", "репку", 20);
	private static Actor grandPa = new Actor("Дедка", "дедку", 6);
	private static Actor grandMo = new Actor("Бабка", "бабку", 5);
	private static Actor grandDaughter = new Actor("Внучка", "внучку", 4);
	private static Actor dog = new Actor("Жучка", "жучку", 3);
	private static Actor cat = new Actor("Кошка", "кошку", 2);
	private static Actor mouse = new Actor("Мышка", "мышку", 1);

	public void doStory() {
		System.out
				.println("НАРОДНЫЙ АРМЯНИНСКИ СКАЗК!\nПосадил дед репку и говорит: — Расти, расти, репка, сладка!\nРасти, расти, репка, крепка! Выросла репка сладка, крепка, большая-пребольшая.\nПошел дед репку рвать:");

		actorsList.add(grandPa);
		actorsList.add(grandMo);
		actorsList.add(grandDaughter);
		actorsList.add(dog);
		actorsList.add(cat);
		actorsList.add(mouse);

		for (int i = 0; i < actorsList.size() ; i++) {
		
			if (i > 0) {
				for (int g = i; g > 0; g--) {
					System.out.println(actorsList.get(g).getWho() + " за "
							+ actorsList.get(g - 1).getWhom());
				}
				System.out.println("Дедка за репку");
				System.out.println("-------------");
			}

			actorsList.get(i).pullOut();
			
			if( i < actorsList.size()-1) {
				actorsList.get(i).pullFailed();
				actorsList.get(i).call(actorsList.get(i + 1));
				
			}
			else {
				actorsList.get(i).pullSuccess();
			}
			
		}

	}



	public static void main(String[] args) {

		Story story = new Story();

		story.doStory();

	}
}
