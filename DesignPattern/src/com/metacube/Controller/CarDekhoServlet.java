package com.metacube.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.metacube.DAO.CarDAOConcrete;
import com.metacube.VO.CarVO;

/**this is the main servlet that is called on the landing page
 * Servlet implementation class CarDekhoServlet
 */
@
WebServlet("/CarDekhoServlet")
public class CarDekhoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CarDekhoServlet() {
        super();
    }

    /**
     * handles the request from landing page
     * processes the request for creating a new car based on the parameters passed from the jsp 
     * fetches all the cars from the database 
     */
    protected void doGet(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {

        //decide which action to be performed-create a car or list all the cars
        String actionRequested = request.getParameter("action");

        //
        switch (actionRequested) {

            //if new car is to be created
            case "create":
                request.setAttribute("make", "");
                request.setAttribute("model", "");
                request.setAttribute("engine-capacity", "");
                request.setAttribute("fuel-capacity", "");
                request.setAttribute("milage", "");
                request.setAttribute("isAC", "true");
                request.setAttribute("isPowerSteering", "true");
                request.setAttribute("isAccessoryKit", "true");
                request.setAttribute("btn-value", "Add");
                request.getRequestDispatcher("create.jsp").forward(request, response);
                break;

                //if list of all the cars is to be fetched
            case "list":
                List < CarVO > carList = new CarDAOConcrete().getAllCars();
                HttpSession session = request.getSession();
                session.setAttribute("carList", carList);
                request.getRequestDispatcher("list.jsp").forward(request, response);
                break;
            default:
                break;
        }
    }
}