package ex05_work;

import java.util.ArrayList;
import java.util.Random;

public class WordGame extends Thread{
	private String[] data = {"apple", "banana", "orange", "grape", "strawberry"};
	private ArrayList<String> arr;
	private boolean isPlaying = true;//������ ������ ����
	Random rnd = new Random();
	
	public WordGame( ArrayList<String> arr ) {
		this.arr = arr;
	}
	
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
	@Override
	public void run() {
		
		while( isPlaying ) {
			
			int r = rnd.nextInt( data.length );
			
			//�߻��� ���� ��ġ�� �ܾ arr�� ����
			arr.add( data[r] );
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//while
		
	}
}
