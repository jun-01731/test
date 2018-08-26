package com.internousdev.ecsite2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite2.util.DBConnector;
import com.internousdev.ecsite2.util.DateUtil;

public class ProductAddCompleteDAO {
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO item_info_transaction(item_name, item_price, item_stock, insert_date) VALUES(?, ?, ?, ?)";

	public void productAdd(String itemName, int itemPrice, int stock) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemName);
			preparedStatement.setInt(2, itemPrice);
			preparedStatement.setInt(3, stock);
			preparedStatement.setString(2, dateUtil.getDate());

			preparedStatement.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}

	}

}
