package bean;

import java.util.ArrayList;
	
public class ThreadBean implements Bean{
	
	private int threadNo;
	private String title;
	private String category;
	private int commentCount;
	
	private ArrayList<CommentBean> commentList = new ArrayList<CommentBean>();
	private ArrayList<ThreadBean> threadList = new ArrayList<ThreadBean>();


//setter

	//�X���b�h�ԍ�
	public void setThreadNo(int threadNo){
		this.threadNo = threadNo;
	}
	//�X���b�h�^�C�g��
	public void setTitle(String title){
		this.title = title;
	}
	//�J�e�S���[
	public void setCategory(String category){
		this.category = category;
	}
	//���e��
	public void setCount(int commentCount){
		this.commentCount = commentCount;
	}
	//�X���b�h�̑S���f�[�^��ArrayList�ɃZ�b�g
	public void setCommentList(CommentBean list){
		commentList.add(list);
	}
	//�X���b�h�ꗗ��ArrayList�ɃZ�b�g
	public void setThreadList(ThreadBean list){
		threadList.add(list);
	}

//getter

	//�X���b�h�ԍ�
	public int getThreadNo(){
		return threadNo;
	}
	//�X���b�h�^�C�g��
	public String getTitle(){
		return title;
	}
	//�J�e�S���[
	public String getCategory(){
		return category;
	}
	//���e��
	public int getCommentCount(){
		return commentCount;
	}
	//�X���b�h�̑S���f�[�^��Ԃ�
	public ArrayList getCommentList(){
		return commentList;
	}
	//�X���b�h�ꗗ��Ԃ�
	public ArrayList getThreadList(){
		return threadList;
	}
	
}

