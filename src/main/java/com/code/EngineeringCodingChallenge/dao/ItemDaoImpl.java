package com.code.EngineeringCodingChallenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.code.EngineeringCodingChallenge.exceptions.ConnectionFailedException;
import com.code.EngineeringCodingChallenge.model.Item;
import com.code.EngineeringCodingChallenge.utility.DBConnection;

public class ItemDaoImpl implements ItemDao {


	public List<Item> displayShopDetails() {
		// TODO Auto-generated method stub

		Connection con = DBConnection.getConnection();
		String sql = "select * from item;";
		List<Item> item = new ArrayList<Item>();
		try {
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(sql);
			while (res.next()) {
				int id = res.getInt("id");
				String name = res.getString("name");
				double purchase = res.getDouble("purchase");
				double sell = res.getDouble("sell");

				Item i = new Item(id, name, purchase, sell);
				item.add(i);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return item;
	}

	public String addShopdetails(List<Item> item) throws ConnectionFailedException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		PreparedStatement st = null;
		String str = null;
		String query = "insert into item(id,name,purchase,sell) values(?,?,?,?);";
		Item obj = item.get(0);
		try {
			st = con.prepareStatement(query);
			st.setInt(1, obj.getId());
			st.setString(2, obj.getName());
			st.setDouble(3, obj.getPurchase());
			st.setDouble(4, obj.getSell());
			st.executeUpdate();

			str = "Item ID with '" + obj.getId() + "' was succesfully inserted";

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				ConnectionFailedException.closeResource(st);
				ConnectionFailedException.closeResource(con);
			} catch (ConnectionFailedException e) {
				// TODO Auto-generated catch block
				throw new ConnectionFailedException();
			}

		}
		return str;
	}

}
