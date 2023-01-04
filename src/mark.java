package src;

import java.io.Serializable;

public class mark implements Serializable{
 private int mathMark;
 private int ITMark;
public int getMathMark() {
	return mathMark;
}
public void setMathMark(int mathMark) {
	this.mathMark = mathMark;
}
public int getITMark() {
	return ITMark;
}
public void setITMark(int iTMark) {
	ITMark = iTMark;
}

}
