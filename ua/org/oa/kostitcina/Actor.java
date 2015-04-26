package ua.org.oa.kostitcina;

public class Actor {

	private String who;
	private String whom;

	public Actor(String who, String whom) {
		this.who = who;
		this.whom = whom;
	}

	public void call(Actor x) {

		System.out.println("������ " + who + " " + x.whom);
	}

	public void pullOut() {
		System.out.println("�����-�������");

	}

	public void pullFailed() {
		System.out.println("�������� �� �����\n");
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

}
