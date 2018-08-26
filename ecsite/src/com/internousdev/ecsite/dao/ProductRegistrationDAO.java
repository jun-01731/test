package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;


public class ProductRegistrationDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO item_info_transaction(item_name, item_price, item_stock, insert_date) VALUES(?, ?, ?, ?)";

	private boolean result= false;

	public boolean productRegist(String itemName, int itemPrice, int stock) throws SQLException{
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName);
			preparedStatement.setInt(2, itemPrice);
			preparedStatement.setInt(3, stock);
			preparedStatement.setString(4, dateUtil.getDate());

			preparedStatement.execute();
			result = true;
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return result;
	}

}
