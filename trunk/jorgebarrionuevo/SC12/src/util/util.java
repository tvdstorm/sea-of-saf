package util;

public abstract class util {
	public static boolean isIn(String s, String[] l){
		int i = 0;
		boolean r=false;
        while ((i<l.length) && (!r)) {r=(s.equals(l[i]));i++;}
		return r;
	}
}
