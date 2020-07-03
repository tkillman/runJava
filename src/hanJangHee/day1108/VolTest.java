package hanJangHee.day1108;

interface Volume{
	
	void volumeUp(int level);
	
	void volumeDown(int level);
	
}

class Speaker implements Volume{
	int VolLevel;
	
	Speaker(){}
	
	public void volumeUp(int level){
	    VolLevel += level;
	    if(VolLevel > 100){
	    	VolLevel=100;
	    }
	    System.out.println("Speaker볼륨 올립니다" + VolLevel);
		}
	
	public void volumeDown(int level){
		VolLevel -= level;
		if(VolLevel<0){
			VolLevel=0;
		}
		System.out.println("Speakcer 볼륨 내립니다" + VolLevel);
		}
}

class Radio implements Volume{
	int VolLevel;
	
	Radio(){}
	
	public void volumeUp(int level){
		VolLevel += level;
		System.out.println("Radio 볼륨을 올립니다" + VolLevel);
	}
	
	public void volumeDown(int level){
		VolLevel -= level;
		System.out.println("Radio 볼륨을 줄입니다" + VolLevel);
}
	
}

class Tv implements Volume{
	int VolLevel;
	
	Tv(){}
	
	public void volumeUp(int level){
		VolLevel += level;
        System.out.println("Tv 볼륨을 올립니다" + VolLevel);
	}
	
	public void volumeDown(int level){
		VolLevel -= level;
		if(VolLevel<0){
			VolLevel=0;
		}
		System.out.println("Tv 볼륨을 줄입니다" + VolLevel);
}

}

class VolTest {
	public static void main(String[] args){
		Volume[] v = new Volume[3];
		v[0]=new Speaker();
		v[1]=new Radio();
		v[2]=new Tv();
		
		for(int i = 0; i < v.length; i++){
			for(int j = 1; j <=3; j++){
				v[i].volumeUp(200);
			}
			for(int j = 1; j <= 3; j++){
				v[i].volumeDown(300);
			}
		}
		
		
	}

}
