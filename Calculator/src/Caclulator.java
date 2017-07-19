
public class Caclulator {
private int firstnum;
private int secondnum;

public void reset() {
	firstnum=1;
	secondnum=1;
}
	
public void setFirstnum(int firstnum) {
	this.firstnum=firstnum;
}

public void setSecondnum(int secondnum) {
	this.secondnum=secondnum;
}
	
public int result() {
	return (int) (firstnum-secondnum);
}

public int sum() {
	return (int)(firstnum+secondnum);
}

public int subtract() {
	return (int)(firstnum-secondnum);
}

public int multiply() {
	return (int)(firstnum*secondnum);
}

public float divide() {
	if (secondnum ==0) {
		return (0);
	}
	else{
		return(float)(firstnum/secondnum);
	}
}

public boolean equal () {
	return (boolean)(firstnum==secondnum);
}

}
