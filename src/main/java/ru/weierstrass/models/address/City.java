package ru.weierstrass.models.address;

import ru.weierstrass.models.Storage;
import ru.weierstrass.models.commons.DbModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class City extends DbModel {

    protected int id;
    protected String name;
    protected List<Storage> shops;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Storage> getShops() {
        return this.shops;
    }

    @Override
    public void bind( ResultSet rs ) throws SQLException {
        this.id = rs.getInt( "id" );
        this.name = rs.getString( "name" );
        //TODO: how to bind related data properly?
        this.shops = new ArrayList<>();
    }

}