package Package.Role;

public class Gender {
	
	public static final int FEMALE = 0x0;
	
	public static final int MALE = 0x1;
	
	public static final String STRING_FEMALE = "Female";
	
	public static final String STRING_MALE = "Male";
	
	
	public int gender;
	
	public String caption;
	
	Gender(int gender) {
		if(gender < FEMALE || gender > MALE) return;
		this.gender = gender;
		this.caption = (this.gender == MALE ? STRING_MALE : STRING_FEMALE);
	}
	
	Gender(String caption) {
		if (caption.isEmpty()) return;
		if (caption.equals(STRING_MALE)) {
			this.gender = MALE;
		} else if (caption.equals(STRING_FEMALE)) {
			this.gender = FEMALE;
		} else {
			return;
		}
		this.caption = caption;		
	}
	
	public boolean isMale() {
		return this.gender == MALE;
	}
}