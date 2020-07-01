package runJava.ch14.thisisjava_12;

public class Index {

	//*******StateMain ,StateThread,TargetThread 사용방법*****
	////쓰레드의 상태를 확인하는 방법.
	

	//*****SumThread,JoinExample***
	//join을 쓰면 join을 호출한!!!!! 쓰레드가 대기상태가 된다.
	

/////***** ThreadA,ThreadB,WorkObject,WaitNotifyExample 사용***********
//1.notify()란? 일시정지중인 다른 쓰레드를 실행 대기 생태로 만든다.
//2.wait()란? 자신의 쓰레드를 일시 정지 상태로 만든다. 다른 쓰레드가 notify로 풀어줘야 실행대기 상태가 된다.
//3.사용 방법
//동기화 된 메소드나 블럭에서 사용 가능하다.
//4. 사용 예제
//어떤 생산자가 일을 수행 한 다음 그 값을 저장 한 후에 소비자가 그 값을 사용하고
//그 다음 생산자가 다시 일을 수행하도록 만들어주고 싶을 때
	
	
	
	//***ProducerThread,ConsumerThread,DataBox,WaitNotifyExample2******////////
	//wait() 자신의 쓰레드를 일시대기 상태로 만든다. notify() 일시대기 상태인 쓰레드를 실행대기 상태로 만든다.
	
	
	
	//****PrintThread1 ,StopFlagExample ******
	//쓰레드의 stop() 메소드를 사용하지 않고 정지시키는 방법
	//Thread를 상속한 클래스에 boolean 형태의 변수를 두고 무한 루프에 boolean 형태를 넣어둔다.
	//쓰레드를 멈추고 싶을때 boolean 형태를 true로 줘서  무한루프를 종료시킨다.
	
	
	
	//****PrintThread2,InterruptExample**********
	//원래 interrupt() 메소드는 일시정지 상태에 있는 쓰레드에 예외를 발생시켜서 중지시키는데
	//쓰레드가 일시정지 상태가 없다면 어떻게 쓰레드를 중지시킬까?
	//boolean state = Thread.interrupt() 정적 메소드 또는 isinterrupted() 를 이용한다.
	//Thread 정적 메소드인 interrupt()는 interrupt 메소드가 호출되면 true를 반환한다.
	//이를 run메소드에서 반복적으로 실행되는 코드 안에 넣어주면 반복문을 빠져나올 수 있다.

		
////******* AutoSaveThread, DaemonExample ****////
//setDaemon 메소드 실행 시 그 메소드를 부른 쓰레드에 속해져서 그 쓰레드가 꺼질경우 다른 쓰레드도 같이 꺼진다.
	

	/// ********* ThreadInfoExample , AutoSaveThread *******************
	// Thread의 그룹 상태를 보는 방법.
	
	
	//****** WorkThread, ThreadGroupExample , 
	// 스레드 그룹을 지정해서 한번에 끄는 방법..
	

	///************* ExecuteExample
	//쓰레드 풀을 만드는 방법과 쓰레드 풀의 갯수 세는법**********///////
	//1. ExecutorService 인터페이스와 Executors 정적 메소드 nexFixedThreadPool을 사용.
	
	///********** NoResultExample , 리턴값이 없는 작업 완료 통보 ***********////
	
	
	///********* ResultByCallableExample , 리턴값이 존재하는 작업 완료 통보*********////////
	// 1. Callable 정의
	// 2. ExecutorService에 submit 한 것을 Future로 받음
	// 3. Future 객체의 get() 메소드로 받는다.


	//******** ResultByRunnableExample , 작업 처리 결과를 외부 객체에 저장 *********////////
	// ****** 1. 쓰레드풀 생성
	// ****   2.공유할 객체 클래스 설계 
	// *** 3. 쓰레드 작업을 수행할 클래스 설계하고 공유 객체를 생성자에서 받는다.
	//*** 4. 쓰레드 작업을 쓰레드풀에 넣어서 수행하고 결과값을 받는다.
	// ***

	
	//***********CompletionServiceExample ****************/////
	// *** 작업 완료 순으로 통보받기  ****///////////////////////
	// *** 1.executorService 객체 생성
	// *** 2. CompletionService 객체 생성
	// *** 3. 처리해 줄 작업을 CompletionService에서 수행하고
	// ** 4. 결과값 출력을 executorService에서 받아서 수행한다.
	

	// * CallbackExample , 콜백 방식의 작업 완료 통보 받기

	
	
	
	
	
	
}
