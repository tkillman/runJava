package hanJangHee.day1114;

import java.util.Calendar;

class CalendarEx1 {

	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("2016����");
		Calendar now = Calendar.getInstance();
		
		int week_yy = now.get(Calendar.WEEK_OF_YEAR);
		int yy = now.get(Calendar.YEAR);
		int mm = now.get(Calendar.MONTH)+1;
		int dd = now.get(Calendar.DAY_OF_MONTH);
		
		sb.append(week_yy);
		sb.append("��°��");
		sb.append(yy);
		sb.append("��");
		sb.append(mm);
		sb.append("��");
		sb.append(dd);
		sb.append("��");
		System.out.println(sb.toString());
		
	}
}
