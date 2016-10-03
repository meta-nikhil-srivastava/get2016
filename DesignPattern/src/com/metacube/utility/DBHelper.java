package com.metacube.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.metacube.VO.CarVO;

/**
 * 
 * @author Nikhil This class interacts with the database using singleton
 *         connection object
 * 
 */
public class DBHelper {

    /**
     * enters the car object into the database
     * 
     * @param carVO
     */
    public void addCar(CarVO carVO) {

        // get connection object
        Connection connection = ConnectionSingleton.getConnectionObject();

        // write insert query for insertion into vehicle table
        final String query1 = "INSERT INTO vehicle (make,model,engine_in_cc,fuel_capacity,milage,road_tax,price) VALUES(?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement;
        try {
            // set the parameters to be inserted
            preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setString(1, carVO.getMake());
            preparedStatement.setString(2, carVO.getModel());
            preparedStatement.setFloat(3, carVO.getEngineInCC());
            preparedStatement.setFloat(4, carVO.getFuelCapacity());
            preparedStatement.setFloat(5, carVO.getMilage());
            preparedStatement.setInt(6, carVO.getRoadTax());
            preparedStatement.setInt(7, carVO.getPrice());

            // execute the query
            preparedStatement.execute();

            // write select query for getting the vehicle id for the current car
            final String query2 = "SELECT MAX(vehicle_ID) FROM vehicle";

            preparedStatement = connection.prepareStatement(query2);

            // execute the query
            ResultSet resultSet = preparedStatement.executeQuery();
            int vehicle_id = 0;

            // get the vehicle id from the resultset
            while (resultSet.next()) {
                vehicle_id = resultSet.getInt(1);
            }

            // write insert query for insertion into car table
            final String query3 = "INSERT INTO car (vehicle_id,ac,power_steering,accessory_kit,create_date,update_date) VALUES(?,?,?,?,?,?)";
            java.util.Date date = new java.util.Date();
            Timestamp timestamp = new Timestamp(date.getTime());

            // set the parameters
            preparedStatement = connection.prepareStatement(query3);
            preparedStatement.setInt(1, vehicle_id);
            preparedStatement.setBoolean(2, carVO.isAc());
            preparedStatement.setBoolean(3, carVO.isPowerSteering());
            preparedStatement.setBoolean(4, carVO.isAccessoryKit());
            preparedStatement.setTimestamp(5, timestamp);
            preparedStatement.setTimestamp(6, timestamp);

            // execute query
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * returns car list based on search parameters
     * 
     * @param filter
     * @param parameter
     * @return
     */
    public List < CarVO > searchCar(String filter, String parameter) {

        // get connection object
        Connection connection = ConnectionSingleton.getConnectionObject();
        // prepare the select query
        final String query = "SELECT v.vehicle_id,v.make,v.model,v.engine_in_cc,v.fuel_capacity,v.milage,v.road_tax,v.price,c.ac,c.power_steering,c.accessory_kit FROM vehicle v,car c WHERE v." + filter + " LIKE '%" + parameter + "%' AND v.vehicle_id=c.vehicle_id";

        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // return the car list made from getting results from the resultset
        return getCarList(resultSet);
    }

    /**
     * returns car list based on search parameters
     * 
     * @param filter
     * @param minValue
     * @param maxValue
     * @return
     */
    public List < CarVO > searchCar(String filter, float minValue, float maxValue) {
        // get connection object
        Connection connection = ConnectionSingleton.getConnectionObject();

        // prepare the select query
        final String query = "SELECT v.vehicle_id,v.make,v.model,v.engine_in_cc,v.fuel_capacity,v.milage,v.road_tax,v.price,c.ac,c.power_steering,c.accessory_kit FROM vehicle v,car c WHERE v." + filter + " BETWEEN " + minValue + " AND " + maxValue + " AND v.vehicle_id=c.vehicle_id";
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // return the car list made from getting results from the resultset
        return getCarList(resultSet);
    }

    /**
     * @return the list of all cars
     */
    public List < CarVO > getAllCars() {
        // get connection object
        Connection connection = ConnectionSingleton.getConnectionObject();

        // prepare the select query
        final String query = "SELECT * FROM vehicle v,car c WHERE v.vehicle_id=c.vehicle_id";
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // return the car list made from getting results from the resultset
        return getCarList(resultSet);
    }

    /**
     * parses the resultset object and returns the results
     *  in the form of a list containing car objects
     * @param resultSet
     * @return
     */
    public List < CarVO > getCarList(ResultSet resultSet) {
            List < CarVO > carList = new ArrayList < CarVO > ();
            try {
                //parse all the rows from the resultset
                while (resultSet.next()) {

                    //create a new car object
                    CarVO carVO = new CarVO();

                    //parse the values from the resultset
                    carVO.setVehicleId(resultSet.getInt(1));
                    carVO.setMake(resultSet.getString(2));
                    carVO.setModel(resultSet.getString(3));
                    carVO.setEngineInCC(resultSet.getFloat(4));
                    carVO.setFuelCapacity(resultSet.getFloat(5));
                    carVO.setMilage(resultSet.getFloat(6));
                    carVO.setRoadTax(resultSet.getInt(7));
                    carVO.setPrice(resultSet.getInt(8));
                    carVO.setAc(resultSet.getBoolean(9));
                    carVO.setPowerSteering(resultSet.getBoolean(10));
                    carVO.setAccessoryKit(resultSet.getBoolean(11));
                    carList.add(carVO);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            //return the car list
            return carList;
        }
        /**
         * updates a pre-existing car
         * @param carVO
         */
    public void updateCar(CarVO carVO) {

        //get the connection
        Connection connection = ConnectionSingleton.getConnectionObject();

        //create update query for vehicle table
        final String query1 = "UPDATE vehicle v SET make=?,model=?,engine_in_cc=?,fuel_capacity=?,milage=?,road_tax=?,price=? WHERE v.vehicle_id=?";

        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(query1);

            //set the parameters for update query
            preparedStatement.setString(1, carVO.getMake());
            preparedStatement.setString(2, carVO.getModel());
            preparedStatement.setFloat(3, carVO.getEngineInCC());
            preparedStatement.setFloat(4, carVO.getFuelCapacity());
            preparedStatement.setFloat(5, carVO.getMilage());
            preparedStatement.setInt(6, carVO.getRoadTax());
            preparedStatement.setInt(7, carVO.getPrice());
            preparedStatement.setInt(8, carVO.getVehicleId());

            //update the vehicle table
            preparedStatement.executeUpdate();

            //create update query for car table
            final String query3 = "UPDATE car c SET ac=?,power_steering=?,accessory_kit=?,update_date=? WHERE c.vehicle_id=?";
            java.util.Date date = new java.util.Date();
            Timestamp timestamp = new Timestamp(date.getTime());

            preparedStatement = connection.prepareStatement(query3);
            preparedStatement.setBoolean(1, carVO.isAc());
            preparedStatement.setBoolean(2, carVO.isPowerSteering());
            preparedStatement.setBoolean(3, carVO.isAccessoryKit());
            preparedStatement.setTimestamp(4, timestamp);
            preparedStatement.setInt(5, carVO.getVehicleId());

            //update the car table
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}