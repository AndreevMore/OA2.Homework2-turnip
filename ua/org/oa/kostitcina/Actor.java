package ua.org.oa.kostitcina;

public class Actor {

	private String who;
	private String whom;

	public Actor(String who, String whom) {
		this.who = who;
		this.whom = whom;
	}

	public void call(Actor x) {

		System.out.println("Позвал " + who + " " + x.whom);
	}

	public void pullOut() {
		System.out.println("тянут-потянут");

	}

	public void pullFailed() {
		System.out.println("Вытянуть не могут\n");
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

}
