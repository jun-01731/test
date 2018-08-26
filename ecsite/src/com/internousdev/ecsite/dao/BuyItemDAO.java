package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	BuyItemDTO buyItemDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo() {
		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(); //SQL文を実行

			if(resultSet.next()) {
				//SELECT文でDBから取得した情報をDTOクラスに格納
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
			}
		} catch(Exception e) {
			e.printStackTrace(); //処理中にエラーが発生したら実行する処理
		}
		return buyItemDTO; //ActionクラスにDTOクラスを返す
	}
	public BuyItemDTO getBuyItemDTO() {
		return buyItemDTO;
	}

}
