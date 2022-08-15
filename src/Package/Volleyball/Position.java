package Package.Volleyball;

import java.util.*;

public class Position {
	
	public static final int POSITION_VALUE_UNDEFINED = 0x00;
	
	public static final int POSITION_VALUE_SETTER = 0x01;
	
	public static final int POSITION_VALUE_MIDDLE = 0x02;
	
	public static final int POSITION_VALUE_HITTER = 0x04;
	
	public static final int POSITION_VALUE_LIBERO = 0x08;
	
	public static final String POSITION_CAPTION_UNDEFINED = "Undefined";
	
	public static final String POSITION_CAPTION_SETTER = "Setter";
	
	public static final String POSITION_CAPTION_MIDDLE = "Middle";
	
	public static final String POSITION_CAPTION_HITTER = "Hitter";
	
	public static final String POSITION_CAPTION_LIBERO = "Libero";
		
	public int position;
	
	public List<String> caption;
	
	public Position(int position) {
		this.position = position & 0xF;
		this.caption = new ArrayList<String>();
		setCaption();
	}
	
	public Position() {
		this(POSITION_VALUE_UNDEFINED);
	}
	
	public static int getValue(String caption) {
		if (caption.isEmpty()) return POSITION_VALUE_UNDEFINED;
		
		switch (caption) {
			case POSITION_CAPTION_SETTER: return POSITION_VALUE_SETTER;
			case POSITION_CAPTION_MIDDLE: return POSITION_VALUE_MIDDLE;
			case POSITION_CAPTION_HITTER: return POSITION_VALUE_HITTER;
			case POSITION_CAPTION_LIBERO: return POSITION_VALUE_LIBERO;
		}
		return POSITION_VALUE_UNDEFINED;
	}
	
	private void setCaption() {
		this.caption.clear();
		
		if ((this.position & POSITION_VALUE_SETTER) == POSITION_VALUE_SETTER) {
			this.caption.add("Setter");
		}
		
		if ((this.position & POSITION_VALUE_MIDDLE) == POSITION_VALUE_MIDDLE) {
			this.caption.add("Middle");
		}
		
		if ((this.position & POSITION_VALUE_HITTER) == POSITION_VALUE_HITTER) {
			this.caption.add("Hitters");
		}
		
		if ((this.position & POSITION_VALUE_LIBERO) == POSITION_VALUE_LIBERO) {
			this.caption.add("Liberos");
		}
	}
	
	public String toString() {
		return String.join(", ", this.caption);
	}
}