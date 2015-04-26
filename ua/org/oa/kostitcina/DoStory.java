package ua.org.oa.kostitcina;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoStory {

	private static final Logger logger = Logger.getLogger(DoStory.class
			.getSimpleName());

	List<Actor> actorsList = new ArrayList<>();
	private Actor grandPa = new Actor("�����", "�����");
	private Actor grandMo = new Actor("�����", "�����");
	private Actor grandDaughter = new Actor("������", "������");
	private Actor dog = new Actor("�����", "�����");
	private Actor cat = new Actor("�����", "�����");
	private Actor mouse = new Actor("�����", "�����");

	public void doStory() {
		System.out
				.println("�������� ���������� �����!\n������� ��� ����� � �������: � �����, �����, �����, ������!\n�����, �����, �����, ������! ������� ����� ������, ������, �������-����������.\n����� ��� ����� �����:");

		actorsList.add(grandPa);
		actorsList.add(grandMo);
		actorsList.add(grandDaughter);
		actorsList.add(dog);
		actorsList.add(cat);
		actorsList.add(mouse);

		for (int i = 0; i < actorsList.size(); i++) {

			if (i > 0) {
				for (int g = i; g > 0; g--) {
					System.out.println(actorsList.get(g).getWho() + " �� "
							+ actorsList.get(g - 1).getWhom());
					Log.debug("Actors GetWho + GetWhom");
				}
				System.out.println("����� �� �����");
			}
			Log.debug("actors try to pullout");
			actorsList.get(i).pullOut();

			if (i < actorsList.size() - 1) {
				actorsList.get(i).pullFailed();
				logger.log(Level.INFO, " pulll failed need one more actor:" + i);
				actorsList.get(i).call(actorsList.get(i + 1));
					} else {
				actorsList.get(i).pullSuccess();
				}
		}
	}
}
