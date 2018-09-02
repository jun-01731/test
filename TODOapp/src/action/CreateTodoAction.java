package action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.CreateTodoDAO;
import dto.TodoDTO;

public class CreateTodoAction extends ActionSupport implements SessionAware{
	private String todo;
	private Map<String, Object> session;
	private CreateTodoDAO dao = new CreateTodoDAO();
	private ArrayList<TodoDTO> todoList = new ArrayList<TodoDTO>();
	public String execute()throws SQLException {



		if(!(todo.equals(""))) {
			session.put("todo", todo);
		}
		dao.todoAdd(session.get("todo").toString());

		// TODO Listを取得
		todoList = dao.getTODO();


		return SUCCESS;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public ArrayList<TodoDTO> getTodoList() {
		return todoList;
	}
	public void setTodoList(ArrayList<TodoDTO> todoList) {
		this.todoList = todoList;
	}

}
