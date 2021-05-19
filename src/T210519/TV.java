package T210519;

public interface TV {
	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100;
	
	public void turnOn();
	public void turnOff();
	public void ChangVolume(int Volume);
	public void ChangChannel(int Channel);
}
