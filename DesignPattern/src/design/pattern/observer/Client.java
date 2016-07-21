package design.pattern.observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleFrameMedia media=new SingleFrameMedia();
		SingleFrameStudio studio=new SingleFrameStudio();
		media.subscribe(studio);
		media.notifyObserver();
	}

}
