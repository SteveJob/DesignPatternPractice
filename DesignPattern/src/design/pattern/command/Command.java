package design.pattern.command;

public abstract class Command {

	private Receiver receiver;
	public Command(){
		
	}
	public Command(Receiver receiver){
		this.receiver=receiver;
	}
	
	public void setReceiver(Receiver receiver){
		this.receiver=receiver;
	}
	
	
	public void excute(){
		if(receiver!=null){
			invokeReceiver(receiver);
		}
	}
	public abstract void invokeReceiver(Receiver receiver);
}
