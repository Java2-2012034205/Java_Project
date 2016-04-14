package sample_0414;

public class Television {
    private int channel;
    private int volume;
    private boolean onOff;
    
    Television(int c, int v, boolean o) {
    	channel = c;
    	volume = v;
    	onOff = o;
    	
    }
    
    void print() {
    	System.out.println("ä���� "+channel + "�̰� ������" + volume + "�Դϴ�.");
    }

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
}
