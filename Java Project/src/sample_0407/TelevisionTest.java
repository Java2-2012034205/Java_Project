package sample_0407;

public class TelevisionTest {

	public static void main(string[] args) {
		// TODO Auto-generated method stub
       Television myTv = new Television();
       myTv.channel = 18;
       myTv.volume = 12;
       myTv.onOff = true;
       
       System.out.println(myTv.channel +" "+ myTv.volume +" "+ myTv.onOff);
       myTv.pr();
       
       Television testTv = new Television();
       testTv = myTv;
       testTv.channel =536;
       
       System.out.println(testTv.channel +" "+ myTv.volume +" "+ myTv.onOff);
       testTv.pr();
       
       Television yourTv = new Television();
       yourTv.channel = 18;
       yourTv.volume = 12;
       yourTv.onOff = true;
       
       System.out.println(yourTv.channel +" "+ yourTv.volume +" "+ yourTv.onOff);
       yourTv.pr();
       
       System.out.println("current channel :" + yourTv.changechannel(24));
       
	}

}