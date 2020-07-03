package hanJangHee.day1103;

class Tv{
	boolean power;
	int channel;
	
	void power(){ power = !power;}
	void channelUp(){++channel;}
	void channelDown(){--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displatCaption(String text){
		if(caption){
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
         public static void main(String[] args){
        	 CaptionTv ctv = new CaptionTv();
        	 ctv.channel = 10;
        	 ctv.channelUp();
        	 System.out.println(ctv.channel);
        	 ctv.displatCaption("Hello, World");
        	 ctv.caption = true;
        	 ctv.displatCaption("Hello, World");	 
         }
	
	
}
