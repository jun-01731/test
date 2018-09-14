package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.CreateTodoDAO;
import dao.DeleteDAO;
import dto.TodoDTO;

public class DeleteAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private String id;
	private String selectedId;
	private ArrayList<TodoDTO> todoList = new ArrayList<TodoDTO>();
	public String execute()throws SQLException {
		System.out.println(selectedId);
		selectedId = String.valueOf((selectedId.split(", ",0))[0]);
		int intSelectedId = Integer.parseInt(selectedId);
		// 画面から取得したTODOの一覧から選択したものを取得する
		System.out.println(id);
		id = String.valueOf((id.split(", ",0))[intSelectedId]);
		System.out.println(id);

		DeleteDAO dao = new DeleteDAO();
		dao.deleteTODO(id);
		CreateTodoDAO todoDAO = new CreateTodoDAO();
		todoList = todoDAO.getTODO();

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSelectedId() {
		return selectedId;
	}

	public void setSelectedId(String selectedId) {
		this.selectedId = selectedId;
	}

	public ArrayList<TodoDTO> getTodoList() {
		return todoList;
	}

	public void setTodoList(ArrayList<TodoDTO> todoList) {
		this.todoList = todoList;
	}
}
