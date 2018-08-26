package com.internousdev.ecsite2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.internousdev.ecsite2.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo() {
        //商品情報をすべて取得するSQL文
		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(); //SQL文を実行

			if(resultSet.next()) {
				buyItemDTO.setId(resultSet.getInt("id")); //select文でDBから取得した商品情報をDTOクラスに格納
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return buyItemDTO;
	}
	public BuyItemDTO getBuyItemDTO() {
		return buyItemDTO;
	}

}
