import javax.swing.*;
public class Days_of_month {
	public static String[] jan() {
		String[] valid = new String[4];
		valid[0] = "Jan";
		valid[1] = "January";
		valid[2] = "Jan.";
		valid[3] = "1";
		return valid;
	}
	public static String[] feb() {
		String[] valid = new String[4];
		valid[0] = "Feb";
		valid[1] = "February";
		valid[2] = "Feb.";
		valid[3] = "2";
		return valid;
	}
	public static String[] mar() {
		String[] valid = new String[4];
		valid[0] = "Mar";
		valid[1] = "March";
		valid[2] = "Mar.";
		valid[3] = "3";
		return valid;
	}
	public static String[] apr() {
		String[] valid = new String[4];
		valid[0] = "Apr";
		valid[1] = "April";
		valid[2] = "Apr.";
		valid[3] = "4";
		return valid;
	}
	public static String[] may() {
		String[] valid = new String[4];
		valid[0] = "May";
		valid[1] = "May";
		valid[2] = "May.";
		valid[3] = "5";
		return valid;
	}
	public static String[] jun() {
		String[] valid = new String[4];
		valid[0] = "June";
		valid[1] = "Jun";
		valid[2] = "Jun.";
		valid[3] = "6";
		return valid;
	}
	public static String[] jul() {
		String[] valid = new String[4];
		valid[0] = "July";
		valid[1] = "Jul";
		valid[2] = "Jul.";
		valid[3] = "7";
		return valid;
	}
	public static String[] aug() {
		String[] valid = new String[4];
		valid[0] = "Aug";
		valid[1] = "August";
		valid[2] = "Aug.";
		valid[3] = "8";
		return valid;
	}
	public static String[] sep() {
		String[] valid = new String[4];
		valid[0] = "September";
		valid[1] = "Sep";
		valid[2] = "Sep.";
		valid[3] = "9";
		return valid;
	}
	public static String[] oct() {
		String[] valid = new String[4];
		valid[0] = "October";
		valid[1] = "Oct";
		valid[2] = "Oct.";
		valid[3] = "10";
		return valid;
	}
	public static String[] nov() {
		String[] valid = new String[4];
		valid[0] = "November";
		valid[1] = "Nov";
		valid[2] = "Nov.";
		valid[3] = "11";
		return valid;
	}
	public static String[] dec() {
		String[] valid = new String[4];
		valid[0] = "December";
		valid[1] = "Dec";
		valid[2] = "Dec.";
		valid[3] = "12";
		return valid;
	}
	public static boolean checkin(String[] n, String a) {
		for (int i = 0; i < n.length; i++) {
			if (a.equals(n[i])) {
				return true;
			}
		}
		return false;
	}
	public static boolean validm(String str_month) {
		if (checkin(jan(), str_month) == true) {
			return true;
		}
		if (checkin(feb(), str_month) == true) {
			return true;
		}
		if (checkin(mar(), str_month) == true) {
			return true;
		}
		if (checkin(apr(), str_month) == true) {
			return true;
		}
		if (checkin(may(), str_month) == true) {
			return true;
		}
		if (checkin(jun(), str_month) == true) {
			return true;
		}
		if (checkin(jul(), str_month) == true) {
			return true;
		}
		if (checkin(aug(), str_month) == true) {
			return true;
		}
		if (checkin(sep(), str_month) == true) {
			return true;
		}
		if (checkin(oct(), str_month) == true) {
			return true;
		}
		if (checkin(nov(), str_month) == true) {
			return true;
		}
		if (checkin(sep(), str_month) == true) {
			return true;
		}
		return false;
	}
	public static boolean validy(String str_year) {
		int year;
		try {
			year = Integer.parseInt(str_year);
		} catch (Exception e) {
			return false;
		}
		if (year < 0) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String str_month = JOptionPane.showInputDialog(null, "Please enter month: ");
		while (validm(str_month) == false) {
			str_month = JOptionPane.showInputDialog(null, "Please reenter month: ");
		}
		String str_year = JOptionPane.showInputDialog(null, "Please enter year: ");
		while (validy(str_year) == false) {
			str_year = JOptionPane.showInputDialog(null, "Please reenter year: ");
		}
		int month = 0;
		if (checkin(jan(), str_month) == true) {
			month = 1;
		}
		if (checkin(feb(), str_month) == true) {
			month = 2;
		}
		if (checkin(mar(), str_month) == true) {
			month = 3;
		}
		if (checkin(apr(), str_month) == true) {
			month = 4;
		}
		if (checkin(may(), str_month) == true) {
			month = 5;
		}
		if (checkin(jun(), str_month) == true) {
			month = 6;
		}
		if (checkin(jul(), str_month) == true) {
			month = 7;
		}
		if (checkin(aug(), str_month) == true) {
			month = 8;
		}
		if (checkin(sep(), str_month) == true) {
			month = 9;
		}
		if (checkin(oct(), str_month) == true) {
			month = 10;
		}
		if (checkin(nov(), str_month) == true) {
			month = 11;
		}
		if (checkin(sep(), str_month) == true) {
			month = 12;
		}
		int year = Integer.parseInt(str_year);
		int iyear;
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				iyear = 1;
			} else {
				iyear = 0;
			}
		} else {
			iyear = 1;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			JOptionPane.showMessageDialog(null, "The number of day in month is 31");
		} else if (month == 4 || month == 6 || month == 11 || month == 9) {
			JOptionPane.showMessageDialog(null, "The number of day in month is 30");
		} else {
			if (iyear == 1) {
				JOptionPane.showMessageDialog(null, "The number of day in month is 28");
			} else {
				JOptionPane.showMessageDialog(null, "The number of day in month is 29");
			}
		}
	}
}