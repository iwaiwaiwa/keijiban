/*
 * �^�C�g���FOracleDataBase�Ƃ̒ʐM
 * ����    �FOracleDataBase�Ƃ̐ڑ��ASQL���̑��M�ƃf�[�^�̎󂯎��A�R�~�b�g�A�ؒf���s��
 *
 * �ύX�����F2016/02/23 Tuesday
 *         �F�V�K�쐬
 *
 */

package dba;

// �C���|�[�g��
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

//OracleDB�Ƃ̒ʐM�Ɋւ��鏈���Q�ł��B

public class DBAccessor{
	// DB�ɐڑ����邽�߂�Connection�^�̃I�u�W�F�N�g
	private Connection Connect;
	//OracleDB�ɐڑ����邽�߂̃��\�b�h
	public void connect (){
		try{
			/**
			* 
			* OracleDB����f�[�^��ǂݍ��ނ��邽�߂̃��\�b�h�ł��B
			* @param 	�r�p�k�� sql(String)
			* @return	�\�f�[�^
			*/
			// OracleDriver�N���X�̃I�u�W�F�N�g�𐶐�
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// OracleDB�ɐڑ�����
				Connect = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:orcl","info", "pro");
				System.out.println("�ڑ�����");
				// �I�[�g�R�~�b�g�@�\��OFF�ɂ���
				Connect.setAutoCommit(false);	
			}
		//��O���L���b�`����\���̂��鏈��
			catch(ClassNotFoundException e){
				System.out.println("class:Accessor_method:connect() ClassNotFoundException");
			}
			catch(SQLException e){
				System.out.println("class:Accessor_method:connect() SQLException");
			}
			catch(Exception e){
				System.out.println("class:Accessor_method:connect() Exception");
			}
		}
	
	public ResultSet read(String sql){
		// �\�f�[�^ read ( �r�p�k�� )
		// ��O���L���b�`����\���̂��鏈��
			try{
				
			System.out.println("read");
			
			//PreparedStatement st = Connect.prepareStatement(sql);
			// SQL����DB�ɑ��邽�߂�Statement�I�u�W�F�N�g�𐶐�
			Statement st = Connect.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY*/);
			// SQL�������s���AResultSet�I�u�W�F�N�g�𐶐�
			ResultSet rs = st.executeQuery(sql);
			// ���������f�[�^��Ԃ�
			return rs;
		}
		catch(SQLException e){
			System.out.println("class:Accessor_method:read() SQLException");
		}
		catch(Exception e){
			System.out.println("class:Accessor_method:read() Exception");
		}
		// ��O�����������ꍇ�Anull��Ԃ�
		return null;
	}
	
	//OracleDB�Ƀf�[�^���������ނ��邽�߂̃��\�b�h�ł��B
public void write (String sql){
		try{ 
			// SQL����DB�ɑ��邽�߂�Statement�I�u�W�F�N�g�𐶐�
			Statement st = Connect.createStatement();
			System.out.println(sql);
			// SQL�������s
			st.executeUpdate(sql);
			// ���ʂ��R�~�b�g
			commit();
		}
		//��O���L���b�`����\���̂��鏈��
		catch(SQLException e){
			System.out.println("class:Accessor_method:write() SQLException");
		}
		catch(Exception e){
			System.out.println("class:Accessor_method:write() Exception");
		}
	}
		/**
	* OracleDB�Ƀf�[�^���������ނ��邽�߂̃��\�b�h�ł��B
	*
	* @param 	�r�p�k�� sql(String)
	* @return	void
	*/
		
	public void commit (){
		try{
			// ��O���L���b�`����\���̂��鏈�����R�~�b�g
			Connect.commit();
		}
		catch(SQLException e){}
		catch(Exception e){}
	}
	
	//OracleDB��ؒf���邽�߂̃��\�b�h�ł��B
	public void close (){
		try{
		    //��O���L���b�`����\���̂��鏈�����N���[�Y
			Connect.close();
		}
		catch(SQLException e){}
		catch(Exception e){}
}

}	

		
// -EOF-