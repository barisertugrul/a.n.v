package askidaNeVar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aski {
	private int id;
	private int askiTur; //�irket=1 veya G�n�ll�=2
	private int askiTedarikci; //�irket veya g�n�ll� indexi
	private int[] kazananlar; //Kazanan ��rencilerin index numaralar�n� i�eren dizi

	public void cekilisYap() {
		int[] commentList = Data.getInstance().comments;
		int[] likeList = Data.getInstance().likes;
		List<Integer> ciftler = ciftleriBul(commentList,likeList);
		Collections.shuffle(ciftler);
		if(ciftler.size()>5) {
			ciftler = ciftler.subList(0,5);
		}else {
			ciftler = ciftler.subList(0,ciftler.size());
		}
		Data.getInstance().wins = new int[ciftler.size()];
		Data.getInstance().wins = ciftler.stream().mapToInt(i->i).toArray();
	}
	
	private List<Integer> ciftleriBul(int[] commentsArray, int[] likesArray) {
		int[] ciftler= {};
		ArrayList<Integer> cift = new ArrayList<>();
		Arrays.sort(likesArray);
		for(int comment:commentsArray) {
			if(Arrays.binarySearch(likesArray,comment) > -1) {
				ciftler = Arrays.copyOf(ciftler, ciftler.length + 1);
				ciftler[ciftler.length-1] = comment;
				cift.add(comment);
			}
		}
		return cift;
		
	}
}
