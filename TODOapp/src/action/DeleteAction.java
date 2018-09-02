package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.DeleteDAO;

public class DeleteAction extends ActionSupport implements SessionAware{
	private String delete;
	private Map<String, Object> session;
	private String selectedId;
	private String id;

	public String execute()throws SQLException {
		System.out.println(delete);
		selectedId = String.valueOf((selectedId.split(", ",0))[0]);
		int intSelectedId = Integer.parseInt(selectedId);
		id = String.valueOf((id.split(", ",0))[intSelectedId]);
		System.out.println(id);

		DeleteDAO dao = new DeleteDAO();
		dao.deleteTODO(id);


		return SUCCESS;
	}



	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}
	@Override
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
	public void setSelected(String selectedId) {
		this.selectedId = selectedId;
	}


}
