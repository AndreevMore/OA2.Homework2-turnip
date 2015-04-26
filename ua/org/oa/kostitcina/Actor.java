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

		System.out.println("Позвал " + who + " " + x.whom);
	}

	public void pullOut() {
		System.out.println("тянут-потянут");

	}

	public void pullFailed() {
		System.out.println("Вытянуть не может.");
	}

	public void pullSuccess() {
		System.out.println("Вытянули РЕПКУ!!!");
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
