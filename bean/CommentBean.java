package bean;

public class CommentBean implements Bean{
	
	private int threadNo;
	private int commentNo;
	private String name;
	private String date;
	private String text;
	
	
//setter
	
	//�X���b�h�ԍ�
	public void setThreadNo(int threadNo){
		this.threadNo = threadNo;
	}
	//�R�����g�ԍ�
	public void setCommentNo(int commentNo){
		this.commentNo = commentNo;
	}
	//���e�Җ�
	public void setName(String name){
		this.name = name;
	}
	//���e����
	public void setDate(String date){
		this.date = date;
	}
	//���e���e
	public void setText(String text){
		this.text = text;
	}


//getter

	//�X���b�h�ԍ�
	public int getThreadNo(){
		return threadNo;
	}
	//�R�����g�ԍ�
	public int getCommentNo(){
		return commentNo;
	}
	//���e�Җ�
	public String getName(){
		return name;
	}
	//���e����
	public String getDate(){
		return date;
	}
	//���e���e
	public String getText(){
		return text;
	}

}