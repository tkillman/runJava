package runJava.ch15.kame.ch15.ex07;

import java.util.StringTokenizer;


//***************StringTokenizer �̿��غ���*************
public class Ch15Ex13 {

	// StringTokenizer �̿��غ���
	public static void main(String[] args) {
		
		StringTokenizer stok01= new StringTokenizer("���,�ٳ���,����,��", ",");
		// String ���,�ٳ���,����,���� �޸��� �и��Ѵ�. default�� ��� �������� ����
		while(stok01.hasMoreTokens()){
			// ��ū�� ������
			System.out.println(stok01.nextToken());
			// ��ū�� ���´�.
		}
		
	}
	
}
