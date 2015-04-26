package ua.org.oa.kostitcina;

public class Actor {

	private String who;
	private String whom;
	private int horsepower;

	public Actor(String who, String whom, int horsepower) {
		this.who = who;
		this.whom = whom;
		this.horsepower = horsepower;
	}

	public void call(Actor x) {

		System.out.println("������ " + who + " " + x.whom);
	}

	public void pullOut() {
		System.out.println("�����-�������");

	}

	public void pullFailed() {
		System.out.println("�������� �� �����.");
	}

	public void pullSuccess() {
		System.out.println("�������� �����!!!");
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public String getWhom() {
		return whom;
	}

	public void setWhom(String whom) {
		this.whom = whom;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

}
