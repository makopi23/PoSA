package chapter04;

import java.time.LocalDate;

public class DueDate {
	LocalDate dueDate;
	
	boolean isExpired() {
		// 期限切れか？
		return true;
	}
	
	boolean isExpiredOn(LocalDate date) {
		// その日は期限切れか？
		return true;
	}
	
	int remainingDays() {
		// 期限までの残日数
		return 0;
	}
	
	AlertType alertPriority() {
		// 期限切れの警告度合いの判定
		return new AlertType();
	}
}
