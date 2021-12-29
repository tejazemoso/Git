package com.basicsstrong.oop;

class Music {
	String song_name;
	public void playMusic(String song_name) {
		System.out.println("Playing music "+song_name);
	}
}
class Aditya extends Music{
	String soong_name;
	Aditya(){
		System.out.println("Initialising Aditya Music player");
	}
	@Override
	public void playMusic(String song_name) {
		System.out.println("Aditya music playing "+song_name);
	}
}
class Sony extends Music{
	String song_name;
	Sony(){
		System.out.println("Initialising Sony Music player");
	}
	@Override
	public void playMusic(String song_name) {
		System.out.println("Sony music playing "+song_name);
		this.song_name=song_name;
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aditya a=new Aditya();
		a.playMusic("Senorita");
		Sony s=new Sony();
		s.playMusic("Perfect");
	}

}
