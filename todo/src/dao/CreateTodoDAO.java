package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.TodoDTO;
import util.DBConnector;
import util.DateUtil;

public class CreateTodoDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO todo_list(todo, insert_date) VALUES(?, ?)";

	private boolean result= false;
	//TODOの追加
	public boolean todoAdd(String todo) throws SQLException{
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, todo);
			preparedStatement.setString(2, dateUtil.getDate());

			preparedStatement.execute();
			result = true;
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return result;
	}

	//TODOの取得
	public ArrayList<TodoDTO> getTODO() throws SQLException{
		ArrayList<TodoDTO> todoList = new ArrayList<TodoDTO>();
		String sql = "SELECT * FROM todo_list";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				TodoDTO dto = new TodoDTO();
				dto.setTodo(resultSet.getString("todo"));
				todoList.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return todoList;
	}

}
